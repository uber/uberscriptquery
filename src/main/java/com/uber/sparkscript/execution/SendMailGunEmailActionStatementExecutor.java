package com.uber.sparkscript.execution;

import com.uber.sparkscript.antlr4.parsing.ActionParamValue;
import com.uber.sparkscript.antlr4.parsing.ActionStatement;
import com.uber.sparkscript.antlr4.parsing.ValueType;
import com.uber.sparkscript.jdbc.DataSetResult;
import com.uber.sparkscript.util.CredentialProvider;
import com.uber.sparkscript.util.SparkUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class SendMailGunEmailActionStatementExecutor implements ActionStatementExecutor {
    public static final String ACTION_NAME = "sendMailGunEmail";
    private static final Logger logger = LoggerFactory.getLogger(SendMailGunEmailActionStatementExecutor.class);

    @Override
    public Object execute(SparkSession sparkSession, ActionStatement actionStatement, CredentialProvider credentialManager) {

        String mailGunUrl = actionStatement.getParamValues().get(0).getValue().toString();
        String apiKey = actionStatement.getParamValues().get(1).getValue().toString();
        String from = actionStatement.getParamValues().get(2).getValue().toString();
        String to = actionStatement.getParamValues().get(3).getValue().toString();
        ActionParamValue subjectParamValue = actionStatement.getParamValues().get(4);
        ActionParamValue htmlParamValue = actionStatement.getParamValues().get(5);

        String subject;
        if (subjectParamValue.getValueType() == ValueType.String) {
            subject = subjectParamValue.getValue().toString();
        } else {
            DataSetResult dataSetResult = SparkUtils.getTableData(sparkSession, subjectParamValue.getValue().toString());
            subject = mergeFirstColumnData(dataSetResult);
        }

        String html;
        if (htmlParamValue.getValueType() == ValueType.String) {
            html = htmlParamValue.getValue().toString();
        } else {
            DataSetResult dataSetResult = SparkUtils.getTableData(sparkSession, htmlParamValue.getValue().toString());
            html = mergeFirstColumnData(dataSetResult);
        }

        HttpClientBuilder httpClientBuilder = HttpClients.custom().useSystemProperties();
        BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(org.apache.http.auth.AuthScope.ANY,
                new org.apache.http.auth.UsernamePasswordCredentials("api", apiKey));
        httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);

        CloseableHttpClient httpClient = httpClientBuilder.build();

        HttpPost httpPost = new HttpPost(mailGunUrl);

        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("from", from));
        urlParameters.add(new BasicNameValuePair("to", to));
        urlParameters.add(new BasicNameValuePair("subject", subject.toString()));
        urlParameters.add(new BasicNameValuePair("html", html.toString()));

        UrlEncodedFormEntity formEntity;
        try {
            formEntity = new UrlEncodedFormEntity(urlParameters);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Failed to send MailGun email", e);
        }

        httpPost.setEntity(formEntity);

        try (CloseableHttpResponse httpResponse = httpClient.execute(httpPost)) {
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()))) {
                String responseBody = IOUtils.toString(reader);
                if (statusCode != 200) {
                    throw new RuntimeException(String.format("Failed to send MailGun email, got http response: %s, %s", statusCode, responseBody));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to send MailGun email", e);
        }

        return null;
    }

    private String mergeFirstColumnData(DataSetResult dataSetResult) {
        StringBuilder sb = new StringBuilder();
        for (List<Object> row : dataSetResult.getRows()) {
            String str = String.valueOf(row.get(0));
            sb.append(str);
        }
        return sb.toString();
    }
}
