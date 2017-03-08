// Generated from SparkScriptSql.g4 by ANTLR 4.5.3

package com.uber.sparkscript.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkScriptSqlParser}.
 */
public interface SparkScriptSqlListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#root}.
     *
     * @param ctx the parse tree
     */
    void enterRoot(SparkScriptSqlParser.RootContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#root}.
     *
     * @param ctx the parse tree
     */
    void exitRoot(SparkScriptSqlParser.RootContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#jsonQueryStatementAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterJsonQueryStatementAssignment(SparkScriptSqlParser.JsonQueryStatementAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#jsonQueryStatementAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitJsonQueryStatementAssignment(SparkScriptSqlParser.JsonQueryStatementAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#jsonQueryStatementAssignment_query}.
     *
     * @param ctx the parse tree
     */
    void enterJsonQueryStatementAssignment_query(SparkScriptSqlParser.JsonQueryStatementAssignment_queryContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#jsonQueryStatementAssignment_query}.
     *
     * @param ctx the parse tree
     */
    void exitJsonQueryStatementAssignment_query(SparkScriptSqlParser.JsonQueryStatementAssignment_queryContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#statementAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterStatementAssignment(SparkScriptSqlParser.StatementAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitStatementAssignment(SparkScriptSqlParser.StatementAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_tableAlias}.
     *
     * @param ctx the parse tree
     */
    void enterStatementAssignment_tableAlias(SparkScriptSqlParser.StatementAssignment_tableAliasContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_tableAlias}.
     *
     * @param ctx the parse tree
     */
    void exitStatementAssignment_tableAlias(SparkScriptSqlParser.StatementAssignment_tableAliasContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_queryType}.
     *
     * @param ctx the parse tree
     */
    void enterStatementAssignment_queryType(SparkScriptSqlParser.StatementAssignment_queryTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_queryType}.
     *
     * @param ctx the parse tree
     */
    void exitStatementAssignment_queryType(SparkScriptSqlParser.StatementAssignment_queryTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_queryEngine}.
     *
     * @param ctx the parse tree
     */
    void enterStatementAssignment_queryEngine(SparkScriptSqlParser.StatementAssignment_queryEngineContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_queryEngine}.
     *
     * @param ctx the parse tree
     */
    void exitStatementAssignment_queryEngine(SparkScriptSqlParser.StatementAssignment_queryEngineContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_query}.
     *
     * @param ctx the parse tree
     */
    void enterStatementAssignment_query(SparkScriptSqlParser.StatementAssignment_queryContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_query}.
     *
     * @param ctx the parse tree
     */
    void exitStatementAssignment_query(SparkScriptSqlParser.StatementAssignment_queryContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#configSetting}.
     *
     * @param ctx the parse tree
     */
    void enterConfigSetting(SparkScriptSqlParser.ConfigSettingContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#configSetting}.
     *
     * @param ctx the parse tree
     */
    void exitConfigSetting(SparkScriptSqlParser.ConfigSettingContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#fileAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterFileAssignment(SparkScriptSqlParser.FileAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitFileAssignment(SparkScriptSqlParser.FileAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_tableAlias}.
     *
     * @param ctx the parse tree
     */
    void enterFileAssignment_tableAlias(SparkScriptSqlParser.FileAssignment_tableAliasContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_tableAlias}.
     *
     * @param ctx the parse tree
     */
    void exitFileAssignment_tableAlias(SparkScriptSqlParser.FileAssignment_tableAliasContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_fileType}.
     *
     * @param ctx the parse tree
     */
    void enterFileAssignment_fileType(SparkScriptSqlParser.FileAssignment_fileTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_fileType}.
     *
     * @param ctx the parse tree
     */
    void exitFileAssignment_fileType(SparkScriptSqlParser.FileAssignment_fileTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_fileLocation}.
     *
     * @param ctx the parse tree
     */
    void enterFileAssignment_fileLocation(SparkScriptSqlParser.FileAssignment_fileLocationContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_fileLocation}.
     *
     * @param ctx the parse tree
     */
    void exitFileAssignment_fileLocation(SparkScriptSqlParser.FileAssignment_fileLocationContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#actionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterActionStatement(SparkScriptSqlParser.ActionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#actionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitActionStatement(SparkScriptSqlParser.ActionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#actionStatement_param}.
     *
     * @param ctx the parse tree
     */
    void enterActionStatement_param(SparkScriptSqlParser.ActionStatement_paramContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#actionStatement_param}.
     *
     * @param ctx the parse tree
     */
    void exitActionStatement_param(SparkScriptSqlParser.ActionStatement_paramContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#jsonObject}.
     *
     * @param ctx the parse tree
     */
    void enterJsonObject(SparkScriptSqlParser.JsonObjectContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#jsonObject}.
     *
     * @param ctx the parse tree
     */
    void exitJsonObject(SparkScriptSqlParser.JsonObjectContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#jsonArray}.
     *
     * @param ctx the parse tree
     */
    void enterJsonArray(SparkScriptSqlParser.JsonArrayContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#jsonArray}.
     *
     * @param ctx the parse tree
     */
    void exitJsonArray(SparkScriptSqlParser.JsonArrayContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#jsonPair}.
     *
     * @param ctx the parse tree
     */
    void enterJsonPair(SparkScriptSqlParser.JsonPairContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#jsonPair}.
     *
     * @param ctx the parse tree
     */
    void exitJsonPair(SparkScriptSqlParser.JsonPairContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#jsonValue}.
     *
     * @param ctx the parse tree
     */
    void enterJsonValue(SparkScriptSqlParser.JsonValueContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#jsonValue}.
     *
     * @param ctx the parse tree
     */
    void exitJsonValue(SparkScriptSqlParser.JsonValueContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#singleStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSingleStatement(SparkScriptSqlParser.SingleStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#singleStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSingleStatement(SparkScriptSqlParser.SingleStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#singleExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSingleExpression(SparkScriptSqlParser.SingleExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#singleExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSingleExpression(SparkScriptSqlParser.SingleExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#singleTableIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterSingleTableIdentifier(SparkScriptSqlParser.SingleTableIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#singleTableIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitSingleTableIdentifier(SparkScriptSqlParser.SingleTableIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#singleDataType}.
     *
     * @param ctx the parse tree
     */
    void enterSingleDataType(SparkScriptSqlParser.SingleDataTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#singleDataType}.
     *
     * @param ctx the parse tree
     */
    void exitSingleDataType(SparkScriptSqlParser.SingleDataTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code statementDefault}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatementDefault(SparkScriptSqlParser.StatementDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code statementDefault}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatementDefault(SparkScriptSqlParser.StatementDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code use}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterUse(SparkScriptSqlParser.UseContext ctx);

    /**
     * Exit a parse tree produced by the {@code use}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitUse(SparkScriptSqlParser.UseContext ctx);

    /**
     * Enter a parse tree produced by the {@code createDatabase}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateDatabase(SparkScriptSqlParser.CreateDatabaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code createDatabase}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateDatabase(SparkScriptSqlParser.CreateDatabaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code setDatabaseProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterSetDatabaseProperties(SparkScriptSqlParser.SetDatabasePropertiesContext ctx);

    /**
     * Exit a parse tree produced by the {@code setDatabaseProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitSetDatabaseProperties(SparkScriptSqlParser.SetDatabasePropertiesContext ctx);

    /**
     * Enter a parse tree produced by the {@code dropDatabase}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterDropDatabase(SparkScriptSqlParser.DropDatabaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code dropDatabase}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitDropDatabase(SparkScriptSqlParser.DropDatabaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code createTableUsing}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTableUsing(SparkScriptSqlParser.CreateTableUsingContext ctx);

    /**
     * Exit a parse tree produced by the {@code createTableUsing}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTableUsing(SparkScriptSqlParser.CreateTableUsingContext ctx);

    /**
     * Enter a parse tree produced by the {@code createTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTable(SparkScriptSqlParser.CreateTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code createTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTable(SparkScriptSqlParser.CreateTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code createTableLike}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTableLike(SparkScriptSqlParser.CreateTableLikeContext ctx);

    /**
     * Exit a parse tree produced by the {@code createTableLike}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTableLike(SparkScriptSqlParser.CreateTableLikeContext ctx);

    /**
     * Enter a parse tree produced by the {@code analyze}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterAnalyze(SparkScriptSqlParser.AnalyzeContext ctx);

    /**
     * Exit a parse tree produced by the {@code analyze}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitAnalyze(SparkScriptSqlParser.AnalyzeContext ctx);

    /**
     * Enter a parse tree produced by the {@code renameTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterRenameTable(SparkScriptSqlParser.RenameTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code renameTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitRenameTable(SparkScriptSqlParser.RenameTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code setTableProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterSetTableProperties(SparkScriptSqlParser.SetTablePropertiesContext ctx);

    /**
     * Exit a parse tree produced by the {@code setTableProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitSetTableProperties(SparkScriptSqlParser.SetTablePropertiesContext ctx);

    /**
     * Enter a parse tree produced by the {@code unsetTableProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterUnsetTableProperties(SparkScriptSqlParser.UnsetTablePropertiesContext ctx);

    /**
     * Exit a parse tree produced by the {@code unsetTableProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitUnsetTableProperties(SparkScriptSqlParser.UnsetTablePropertiesContext ctx);

    /**
     * Enter a parse tree produced by the {@code setTableSerDe}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterSetTableSerDe(SparkScriptSqlParser.SetTableSerDeContext ctx);

    /**
     * Exit a parse tree produced by the {@code setTableSerDe}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitSetTableSerDe(SparkScriptSqlParser.SetTableSerDeContext ctx);

    /**
     * Enter a parse tree produced by the {@code addTablePartition}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterAddTablePartition(SparkScriptSqlParser.AddTablePartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code addTablePartition}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitAddTablePartition(SparkScriptSqlParser.AddTablePartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code renameTablePartition}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterRenameTablePartition(SparkScriptSqlParser.RenameTablePartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code renameTablePartition}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitRenameTablePartition(SparkScriptSqlParser.RenameTablePartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code dropTablePartitions}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterDropTablePartitions(SparkScriptSqlParser.DropTablePartitionsContext ctx);

    /**
     * Exit a parse tree produced by the {@code dropTablePartitions}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitDropTablePartitions(SparkScriptSqlParser.DropTablePartitionsContext ctx);

    /**
     * Enter a parse tree produced by the {@code setTableLocation}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterSetTableLocation(SparkScriptSqlParser.SetTableLocationContext ctx);

    /**
     * Exit a parse tree produced by the {@code setTableLocation}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitSetTableLocation(SparkScriptSqlParser.SetTableLocationContext ctx);

    /**
     * Enter a parse tree produced by the {@code dropTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterDropTable(SparkScriptSqlParser.DropTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code dropTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitDropTable(SparkScriptSqlParser.DropTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code createView}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateView(SparkScriptSqlParser.CreateViewContext ctx);

    /**
     * Exit a parse tree produced by the {@code createView}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateView(SparkScriptSqlParser.CreateViewContext ctx);

    /**
     * Enter a parse tree produced by the {@code createTempViewUsing}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTempViewUsing(SparkScriptSqlParser.CreateTempViewUsingContext ctx);

    /**
     * Exit a parse tree produced by the {@code createTempViewUsing}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTempViewUsing(SparkScriptSqlParser.CreateTempViewUsingContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterViewQuery}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterAlterViewQuery(SparkScriptSqlParser.AlterViewQueryContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterViewQuery}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitAlterViewQuery(SparkScriptSqlParser.AlterViewQueryContext ctx);

    /**
     * Enter a parse tree produced by the {@code createFunction}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCreateFunction(SparkScriptSqlParser.CreateFunctionContext ctx);

    /**
     * Exit a parse tree produced by the {@code createFunction}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCreateFunction(SparkScriptSqlParser.CreateFunctionContext ctx);

    /**
     * Enter a parse tree produced by the {@code dropFunction}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterDropFunction(SparkScriptSqlParser.DropFunctionContext ctx);

    /**
     * Exit a parse tree produced by the {@code dropFunction}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitDropFunction(SparkScriptSqlParser.DropFunctionContext ctx);

    /**
     * Enter a parse tree produced by the {@code explain}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterExplain(SparkScriptSqlParser.ExplainContext ctx);

    /**
     * Exit a parse tree produced by the {@code explain}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitExplain(SparkScriptSqlParser.ExplainContext ctx);

    /**
     * Enter a parse tree produced by the {@code showTables}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterShowTables(SparkScriptSqlParser.ShowTablesContext ctx);

    /**
     * Exit a parse tree produced by the {@code showTables}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitShowTables(SparkScriptSqlParser.ShowTablesContext ctx);

    /**
     * Enter a parse tree produced by the {@code showDatabases}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterShowDatabases(SparkScriptSqlParser.ShowDatabasesContext ctx);

    /**
     * Exit a parse tree produced by the {@code showDatabases}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitShowDatabases(SparkScriptSqlParser.ShowDatabasesContext ctx);

    /**
     * Enter a parse tree produced by the {@code showTblProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterShowTblProperties(SparkScriptSqlParser.ShowTblPropertiesContext ctx);

    /**
     * Exit a parse tree produced by the {@code showTblProperties}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitShowTblProperties(SparkScriptSqlParser.ShowTblPropertiesContext ctx);

    /**
     * Enter a parse tree produced by the {@code showColumns}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterShowColumns(SparkScriptSqlParser.ShowColumnsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showColumns}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitShowColumns(SparkScriptSqlParser.ShowColumnsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showPartitions}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterShowPartitions(SparkScriptSqlParser.ShowPartitionsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showPartitions}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitShowPartitions(SparkScriptSqlParser.ShowPartitionsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showFunctions}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterShowFunctions(SparkScriptSqlParser.ShowFunctionsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showFunctions}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitShowFunctions(SparkScriptSqlParser.ShowFunctionsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showCreateTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterShowCreateTable(SparkScriptSqlParser.ShowCreateTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code showCreateTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitShowCreateTable(SparkScriptSqlParser.ShowCreateTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code describeFunction}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterDescribeFunction(SparkScriptSqlParser.DescribeFunctionContext ctx);

    /**
     * Exit a parse tree produced by the {@code describeFunction}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitDescribeFunction(SparkScriptSqlParser.DescribeFunctionContext ctx);

    /**
     * Enter a parse tree produced by the {@code describeDatabase}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterDescribeDatabase(SparkScriptSqlParser.DescribeDatabaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code describeDatabase}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitDescribeDatabase(SparkScriptSqlParser.DescribeDatabaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code describeTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterDescribeTable(SparkScriptSqlParser.DescribeTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code describeTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitDescribeTable(SparkScriptSqlParser.DescribeTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code refreshTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterRefreshTable(SparkScriptSqlParser.RefreshTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code refreshTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitRefreshTable(SparkScriptSqlParser.RefreshTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code refreshResource}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterRefreshResource(SparkScriptSqlParser.RefreshResourceContext ctx);

    /**
     * Exit a parse tree produced by the {@code refreshResource}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitRefreshResource(SparkScriptSqlParser.RefreshResourceContext ctx);

    /**
     * Enter a parse tree produced by the {@code cacheTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterCacheTable(SparkScriptSqlParser.CacheTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code cacheTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitCacheTable(SparkScriptSqlParser.CacheTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code uncacheTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterUncacheTable(SparkScriptSqlParser.UncacheTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code uncacheTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitUncacheTable(SparkScriptSqlParser.UncacheTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code clearCache}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterClearCache(SparkScriptSqlParser.ClearCacheContext ctx);

    /**
     * Exit a parse tree produced by the {@code clearCache}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitClearCache(SparkScriptSqlParser.ClearCacheContext ctx);

    /**
     * Enter a parse tree produced by the {@code loadData}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterLoadData(SparkScriptSqlParser.LoadDataContext ctx);

    /**
     * Exit a parse tree produced by the {@code loadData}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitLoadData(SparkScriptSqlParser.LoadDataContext ctx);

    /**
     * Enter a parse tree produced by the {@code truncateTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterTruncateTable(SparkScriptSqlParser.TruncateTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code truncateTable}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitTruncateTable(SparkScriptSqlParser.TruncateTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code manageResource}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterManageResource(SparkScriptSqlParser.ManageResourceContext ctx);

    /**
     * Exit a parse tree produced by the {@code manageResource}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitManageResource(SparkScriptSqlParser.ManageResourceContext ctx);

    /**
     * Enter a parse tree produced by the {@code failNativeCommand}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterFailNativeCommand(SparkScriptSqlParser.FailNativeCommandContext ctx);

    /**
     * Exit a parse tree produced by the {@code failNativeCommand}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitFailNativeCommand(SparkScriptSqlParser.FailNativeCommandContext ctx);

    /**
     * Enter a parse tree produced by the {@code setConfiguration}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterSetConfiguration(SparkScriptSqlParser.SetConfigurationContext ctx);

    /**
     * Exit a parse tree produced by the {@code setConfiguration}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitSetConfiguration(SparkScriptSqlParser.SetConfigurationContext ctx);

    /**
     * Enter a parse tree produced by the {@code resetConfiguration}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterResetConfiguration(SparkScriptSqlParser.ResetConfigurationContext ctx);

    /**
     * Exit a parse tree produced by the {@code resetConfiguration}
     * labeled alternative in {@link SparkScriptSqlParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitResetConfiguration(SparkScriptSqlParser.ResetConfigurationContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#unsupportedHiveNativeCommands}.
     *
     * @param ctx the parse tree
     */
    void enterUnsupportedHiveNativeCommands(SparkScriptSqlParser.UnsupportedHiveNativeCommandsContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#unsupportedHiveNativeCommands}.
     *
     * @param ctx the parse tree
     */
    void exitUnsupportedHiveNativeCommands(SparkScriptSqlParser.UnsupportedHiveNativeCommandsContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#createTableHeader}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTableHeader(SparkScriptSqlParser.CreateTableHeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#createTableHeader}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTableHeader(SparkScriptSqlParser.CreateTableHeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#bucketSpec}.
     *
     * @param ctx the parse tree
     */
    void enterBucketSpec(SparkScriptSqlParser.BucketSpecContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#bucketSpec}.
     *
     * @param ctx the parse tree
     */
    void exitBucketSpec(SparkScriptSqlParser.BucketSpecContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#skewSpec}.
     *
     * @param ctx the parse tree
     */
    void enterSkewSpec(SparkScriptSqlParser.SkewSpecContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#skewSpec}.
     *
     * @param ctx the parse tree
     */
    void exitSkewSpec(SparkScriptSqlParser.SkewSpecContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#locationSpec}.
     *
     * @param ctx the parse tree
     */
    void enterLocationSpec(SparkScriptSqlParser.LocationSpecContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#locationSpec}.
     *
     * @param ctx the parse tree
     */
    void exitLocationSpec(SparkScriptSqlParser.LocationSpecContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#query}.
     *
     * @param ctx the parse tree
     */
    void enterQuery(SparkScriptSqlParser.QueryContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#query}.
     *
     * @param ctx the parse tree
     */
    void exitQuery(SparkScriptSqlParser.QueryContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#insertInto}.
     *
     * @param ctx the parse tree
     */
    void enterInsertInto(SparkScriptSqlParser.InsertIntoContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#insertInto}.
     *
     * @param ctx the parse tree
     */
    void exitInsertInto(SparkScriptSqlParser.InsertIntoContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#partitionSpecLocation}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionSpecLocation(SparkScriptSqlParser.PartitionSpecLocationContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#partitionSpecLocation}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionSpecLocation(SparkScriptSqlParser.PartitionSpecLocationContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#partitionSpec}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionSpec(SparkScriptSqlParser.PartitionSpecContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#partitionSpec}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionSpec(SparkScriptSqlParser.PartitionSpecContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#partitionVal}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionVal(SparkScriptSqlParser.PartitionValContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#partitionVal}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionVal(SparkScriptSqlParser.PartitionValContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#describeFuncName}.
     *
     * @param ctx the parse tree
     */
    void enterDescribeFuncName(SparkScriptSqlParser.DescribeFuncNameContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#describeFuncName}.
     *
     * @param ctx the parse tree
     */
    void exitDescribeFuncName(SparkScriptSqlParser.DescribeFuncNameContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#describeColName}.
     *
     * @param ctx the parse tree
     */
    void enterDescribeColName(SparkScriptSqlParser.DescribeColNameContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#describeColName}.
     *
     * @param ctx the parse tree
     */
    void exitDescribeColName(SparkScriptSqlParser.DescribeColNameContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#ctes}.
     *
     * @param ctx the parse tree
     */
    void enterCtes(SparkScriptSqlParser.CtesContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#ctes}.
     *
     * @param ctx the parse tree
     */
    void exitCtes(SparkScriptSqlParser.CtesContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#namedQuery}.
     *
     * @param ctx the parse tree
     */
    void enterNamedQuery(SparkScriptSqlParser.NamedQueryContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#namedQuery}.
     *
     * @param ctx the parse tree
     */
    void exitNamedQuery(SparkScriptSqlParser.NamedQueryContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#tableProvider}.
     *
     * @param ctx the parse tree
     */
    void enterTableProvider(SparkScriptSqlParser.TableProviderContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#tableProvider}.
     *
     * @param ctx the parse tree
     */
    void exitTableProvider(SparkScriptSqlParser.TableProviderContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#tablePropertyList}.
     *
     * @param ctx the parse tree
     */
    void enterTablePropertyList(SparkScriptSqlParser.TablePropertyListContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#tablePropertyList}.
     *
     * @param ctx the parse tree
     */
    void exitTablePropertyList(SparkScriptSqlParser.TablePropertyListContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#tableProperty}.
     *
     * @param ctx the parse tree
     */
    void enterTableProperty(SparkScriptSqlParser.TablePropertyContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#tableProperty}.
     *
     * @param ctx the parse tree
     */
    void exitTableProperty(SparkScriptSqlParser.TablePropertyContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#tablePropertyKey}.
     *
     * @param ctx the parse tree
     */
    void enterTablePropertyKey(SparkScriptSqlParser.TablePropertyKeyContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#tablePropertyKey}.
     *
     * @param ctx the parse tree
     */
    void exitTablePropertyKey(SparkScriptSqlParser.TablePropertyKeyContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#tablePropertyValue}.
     *
     * @param ctx the parse tree
     */
    void enterTablePropertyValue(SparkScriptSqlParser.TablePropertyValueContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#tablePropertyValue}.
     *
     * @param ctx the parse tree
     */
    void exitTablePropertyValue(SparkScriptSqlParser.TablePropertyValueContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#constantList}.
     *
     * @param ctx the parse tree
     */
    void enterConstantList(SparkScriptSqlParser.ConstantListContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#constantList}.
     *
     * @param ctx the parse tree
     */
    void exitConstantList(SparkScriptSqlParser.ConstantListContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#nestedConstantList}.
     *
     * @param ctx the parse tree
     */
    void enterNestedConstantList(SparkScriptSqlParser.NestedConstantListContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#nestedConstantList}.
     *
     * @param ctx the parse tree
     */
    void exitNestedConstantList(SparkScriptSqlParser.NestedConstantListContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#createFileFormat}.
     *
     * @param ctx the parse tree
     */
    void enterCreateFileFormat(SparkScriptSqlParser.CreateFileFormatContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#createFileFormat}.
     *
     * @param ctx the parse tree
     */
    void exitCreateFileFormat(SparkScriptSqlParser.CreateFileFormatContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableFileFormat}
     * labeled alternative in {@link SparkScriptSqlParser#fileFormat}.
     *
     * @param ctx the parse tree
     */
    void enterTableFileFormat(SparkScriptSqlParser.TableFileFormatContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableFileFormat}
     * labeled alternative in {@link SparkScriptSqlParser#fileFormat}.
     *
     * @param ctx the parse tree
     */
    void exitTableFileFormat(SparkScriptSqlParser.TableFileFormatContext ctx);

    /**
     * Enter a parse tree produced by the {@code genericFileFormat}
     * labeled alternative in {@link SparkScriptSqlParser#fileFormat}.
     *
     * @param ctx the parse tree
     */
    void enterGenericFileFormat(SparkScriptSqlParser.GenericFileFormatContext ctx);

    /**
     * Exit a parse tree produced by the {@code genericFileFormat}
     * labeled alternative in {@link SparkScriptSqlParser#fileFormat}.
     *
     * @param ctx the parse tree
     */
    void exitGenericFileFormat(SparkScriptSqlParser.GenericFileFormatContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#storageHandler}.
     *
     * @param ctx the parse tree
     */
    void enterStorageHandler(SparkScriptSqlParser.StorageHandlerContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#storageHandler}.
     *
     * @param ctx the parse tree
     */
    void exitStorageHandler(SparkScriptSqlParser.StorageHandlerContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#resource}.
     *
     * @param ctx the parse tree
     */
    void enterResource(SparkScriptSqlParser.ResourceContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#resource}.
     *
     * @param ctx the parse tree
     */
    void exitResource(SparkScriptSqlParser.ResourceContext ctx);

    /**
     * Enter a parse tree produced by the {@code singleInsertQuery}
     * labeled alternative in {@link SparkScriptSqlParser#queryNoWith}.
     *
     * @param ctx the parse tree
     */
    void enterSingleInsertQuery(SparkScriptSqlParser.SingleInsertQueryContext ctx);

    /**
     * Exit a parse tree produced by the {@code singleInsertQuery}
     * labeled alternative in {@link SparkScriptSqlParser#queryNoWith}.
     *
     * @param ctx the parse tree
     */
    void exitSingleInsertQuery(SparkScriptSqlParser.SingleInsertQueryContext ctx);

    /**
     * Enter a parse tree produced by the {@code multiInsertQuery}
     * labeled alternative in {@link SparkScriptSqlParser#queryNoWith}.
     *
     * @param ctx the parse tree
     */
    void enterMultiInsertQuery(SparkScriptSqlParser.MultiInsertQueryContext ctx);

    /**
     * Exit a parse tree produced by the {@code multiInsertQuery}
     * labeled alternative in {@link SparkScriptSqlParser#queryNoWith}.
     *
     * @param ctx the parse tree
     */
    void exitMultiInsertQuery(SparkScriptSqlParser.MultiInsertQueryContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#queryOrganization}.
     *
     * @param ctx the parse tree
     */
    void enterQueryOrganization(SparkScriptSqlParser.QueryOrganizationContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#queryOrganization}.
     *
     * @param ctx the parse tree
     */
    void exitQueryOrganization(SparkScriptSqlParser.QueryOrganizationContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#multiInsertQueryBody}.
     *
     * @param ctx the parse tree
     */
    void enterMultiInsertQueryBody(SparkScriptSqlParser.MultiInsertQueryBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#multiInsertQueryBody}.
     *
     * @param ctx the parse tree
     */
    void exitMultiInsertQueryBody(SparkScriptSqlParser.MultiInsertQueryBodyContext ctx);

    /**
     * Enter a parse tree produced by the {@code queryTermDefault}
     * labeled alternative in {@link SparkScriptSqlParser#queryTerm}.
     *
     * @param ctx the parse tree
     */
    void enterQueryTermDefault(SparkScriptSqlParser.QueryTermDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code queryTermDefault}
     * labeled alternative in {@link SparkScriptSqlParser#queryTerm}.
     *
     * @param ctx the parse tree
     */
    void exitQueryTermDefault(SparkScriptSqlParser.QueryTermDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code setOperation}
     * labeled alternative in {@link SparkScriptSqlParser#queryTerm}.
     *
     * @param ctx the parse tree
     */
    void enterSetOperation(SparkScriptSqlParser.SetOperationContext ctx);

    /**
     * Exit a parse tree produced by the {@code setOperation}
     * labeled alternative in {@link SparkScriptSqlParser#queryTerm}.
     *
     * @param ctx the parse tree
     */
    void exitSetOperation(SparkScriptSqlParser.SetOperationContext ctx);

    /**
     * Enter a parse tree produced by the {@code queryPrimaryDefault}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterQueryPrimaryDefault(SparkScriptSqlParser.QueryPrimaryDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code queryPrimaryDefault}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitQueryPrimaryDefault(SparkScriptSqlParser.QueryPrimaryDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code table}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterTable(SparkScriptSqlParser.TableContext ctx);

    /**
     * Exit a parse tree produced by the {@code table}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitTable(SparkScriptSqlParser.TableContext ctx);

    /**
     * Enter a parse tree produced by the {@code inlineTableDefault1}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterInlineTableDefault1(SparkScriptSqlParser.InlineTableDefault1Context ctx);

    /**
     * Exit a parse tree produced by the {@code inlineTableDefault1}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitInlineTableDefault1(SparkScriptSqlParser.InlineTableDefault1Context ctx);

    /**
     * Enter a parse tree produced by the {@code subquery}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterSubquery(SparkScriptSqlParser.SubqueryContext ctx);

    /**
     * Exit a parse tree produced by the {@code subquery}
     * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitSubquery(SparkScriptSqlParser.SubqueryContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#sortItem}.
     *
     * @param ctx the parse tree
     */
    void enterSortItem(SparkScriptSqlParser.SortItemContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#sortItem}.
     *
     * @param ctx the parse tree
     */
    void exitSortItem(SparkScriptSqlParser.SortItemContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#querySpecification}.
     *
     * @param ctx the parse tree
     */
    void enterQuerySpecification(SparkScriptSqlParser.QuerySpecificationContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#querySpecification}.
     *
     * @param ctx the parse tree
     */
    void exitQuerySpecification(SparkScriptSqlParser.QuerySpecificationContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#fromClause}.
     *
     * @param ctx the parse tree
     */
    void enterFromClause(SparkScriptSqlParser.FromClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#fromClause}.
     *
     * @param ctx the parse tree
     */
    void exitFromClause(SparkScriptSqlParser.FromClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#aggregation}.
     *
     * @param ctx the parse tree
     */
    void enterAggregation(SparkScriptSqlParser.AggregationContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#aggregation}.
     *
     * @param ctx the parse tree
     */
    void exitAggregation(SparkScriptSqlParser.AggregationContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#groupingSet}.
     *
     * @param ctx the parse tree
     */
    void enterGroupingSet(SparkScriptSqlParser.GroupingSetContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#groupingSet}.
     *
     * @param ctx the parse tree
     */
    void exitGroupingSet(SparkScriptSqlParser.GroupingSetContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#lateralView}.
     *
     * @param ctx the parse tree
     */
    void enterLateralView(SparkScriptSqlParser.LateralViewContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#lateralView}.
     *
     * @param ctx the parse tree
     */
    void exitLateralView(SparkScriptSqlParser.LateralViewContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#setQuantifier}.
     *
     * @param ctx the parse tree
     */
    void enterSetQuantifier(SparkScriptSqlParser.SetQuantifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#setQuantifier}.
     *
     * @param ctx the parse tree
     */
    void exitSetQuantifier(SparkScriptSqlParser.SetQuantifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code relationDefault}
     * labeled alternative in {@link SparkScriptSqlParser#relation}.
     *
     * @param ctx the parse tree
     */
    void enterRelationDefault(SparkScriptSqlParser.RelationDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code relationDefault}
     * labeled alternative in {@link SparkScriptSqlParser#relation}.
     *
     * @param ctx the parse tree
     */
    void exitRelationDefault(SparkScriptSqlParser.RelationDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code joinRelation}
     * labeled alternative in {@link SparkScriptSqlParser#relation}.
     *
     * @param ctx the parse tree
     */
    void enterJoinRelation(SparkScriptSqlParser.JoinRelationContext ctx);

    /**
     * Exit a parse tree produced by the {@code joinRelation}
     * labeled alternative in {@link SparkScriptSqlParser#relation}.
     *
     * @param ctx the parse tree
     */
    void exitJoinRelation(SparkScriptSqlParser.JoinRelationContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#joinType}.
     *
     * @param ctx the parse tree
     */
    void enterJoinType(SparkScriptSqlParser.JoinTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#joinType}.
     *
     * @param ctx the parse tree
     */
    void exitJoinType(SparkScriptSqlParser.JoinTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#joinCriteria}.
     *
     * @param ctx the parse tree
     */
    void enterJoinCriteria(SparkScriptSqlParser.JoinCriteriaContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#joinCriteria}.
     *
     * @param ctx the parse tree
     */
    void exitJoinCriteria(SparkScriptSqlParser.JoinCriteriaContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#sample}.
     *
     * @param ctx the parse tree
     */
    void enterSample(SparkScriptSqlParser.SampleContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#sample}.
     *
     * @param ctx the parse tree
     */
    void exitSample(SparkScriptSqlParser.SampleContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#identifierList}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierList(SparkScriptSqlParser.IdentifierListContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#identifierList}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierList(SparkScriptSqlParser.IdentifierListContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#identifierSeq}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierSeq(SparkScriptSqlParser.IdentifierSeqContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#identifierSeq}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierSeq(SparkScriptSqlParser.IdentifierSeqContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#orderedIdentifierList}.
     *
     * @param ctx the parse tree
     */
    void enterOrderedIdentifierList(SparkScriptSqlParser.OrderedIdentifierListContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#orderedIdentifierList}.
     *
     * @param ctx the parse tree
     */
    void exitOrderedIdentifierList(SparkScriptSqlParser.OrderedIdentifierListContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#orderedIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterOrderedIdentifier(SparkScriptSqlParser.OrderedIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#orderedIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitOrderedIdentifier(SparkScriptSqlParser.OrderedIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#identifierCommentList}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierCommentList(SparkScriptSqlParser.IdentifierCommentListContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#identifierCommentList}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierCommentList(SparkScriptSqlParser.IdentifierCommentListContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#identifierComment}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierComment(SparkScriptSqlParser.IdentifierCommentContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#identifierComment}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierComment(SparkScriptSqlParser.IdentifierCommentContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableName}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterTableName(SparkScriptSqlParser.TableNameContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableName}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitTableName(SparkScriptSqlParser.TableNameContext ctx);

    /**
     * Enter a parse tree produced by the {@code aliasedQuery}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterAliasedQuery(SparkScriptSqlParser.AliasedQueryContext ctx);

    /**
     * Exit a parse tree produced by the {@code aliasedQuery}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitAliasedQuery(SparkScriptSqlParser.AliasedQueryContext ctx);

    /**
     * Enter a parse tree produced by the {@code aliasedRelation}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterAliasedRelation(SparkScriptSqlParser.AliasedRelationContext ctx);

    /**
     * Exit a parse tree produced by the {@code aliasedRelation}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitAliasedRelation(SparkScriptSqlParser.AliasedRelationContext ctx);

    /**
     * Enter a parse tree produced by the {@code inlineTableDefault2}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void enterInlineTableDefault2(SparkScriptSqlParser.InlineTableDefault2Context ctx);

    /**
     * Exit a parse tree produced by the {@code inlineTableDefault2}
     * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
     *
     * @param ctx the parse tree
     */
    void exitInlineTableDefault2(SparkScriptSqlParser.InlineTableDefault2Context ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#inlineTable}.
     *
     * @param ctx the parse tree
     */
    void enterInlineTable(SparkScriptSqlParser.InlineTableContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#inlineTable}.
     *
     * @param ctx the parse tree
     */
    void exitInlineTable(SparkScriptSqlParser.InlineTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code rowFormatSerde}
     * labeled alternative in {@link SparkScriptSqlParser#rowFormat}.
     *
     * @param ctx the parse tree
     */
    void enterRowFormatSerde(SparkScriptSqlParser.RowFormatSerdeContext ctx);

    /**
     * Exit a parse tree produced by the {@code rowFormatSerde}
     * labeled alternative in {@link SparkScriptSqlParser#rowFormat}.
     *
     * @param ctx the parse tree
     */
    void exitRowFormatSerde(SparkScriptSqlParser.RowFormatSerdeContext ctx);

    /**
     * Enter a parse tree produced by the {@code rowFormatDelimited}
     * labeled alternative in {@link SparkScriptSqlParser#rowFormat}.
     *
     * @param ctx the parse tree
     */
    void enterRowFormatDelimited(SparkScriptSqlParser.RowFormatDelimitedContext ctx);

    /**
     * Exit a parse tree produced by the {@code rowFormatDelimited}
     * labeled alternative in {@link SparkScriptSqlParser#rowFormat}.
     *
     * @param ctx the parse tree
     */
    void exitRowFormatDelimited(SparkScriptSqlParser.RowFormatDelimitedContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#tableIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterTableIdentifier(SparkScriptSqlParser.TableIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#tableIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitTableIdentifier(SparkScriptSqlParser.TableIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#namedExpression}.
     *
     * @param ctx the parse tree
     */
    void enterNamedExpression(SparkScriptSqlParser.NamedExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#namedExpression}.
     *
     * @param ctx the parse tree
     */
    void exitNamedExpression(SparkScriptSqlParser.NamedExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#namedExpressionSeq}.
     *
     * @param ctx the parse tree
     */
    void enterNamedExpressionSeq(SparkScriptSqlParser.NamedExpressionSeqContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#namedExpressionSeq}.
     *
     * @param ctx the parse tree
     */
    void exitNamedExpressionSeq(SparkScriptSqlParser.NamedExpressionSeqContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(SparkScriptSqlParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(SparkScriptSqlParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code logicalNot}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void enterLogicalNot(SparkScriptSqlParser.LogicalNotContext ctx);

    /**
     * Exit a parse tree produced by the {@code logicalNot}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void exitLogicalNot(SparkScriptSqlParser.LogicalNotContext ctx);

    /**
     * Enter a parse tree produced by the {@code booleanDefault}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanDefault(SparkScriptSqlParser.BooleanDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code booleanDefault}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanDefault(SparkScriptSqlParser.BooleanDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code exists}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void enterExists(SparkScriptSqlParser.ExistsContext ctx);

    /**
     * Exit a parse tree produced by the {@code exists}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void exitExists(SparkScriptSqlParser.ExistsContext ctx);

    /**
     * Enter a parse tree produced by the {@code logicalBinary}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void enterLogicalBinary(SparkScriptSqlParser.LogicalBinaryContext ctx);

    /**
     * Exit a parse tree produced by the {@code logicalBinary}
     * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
     *
     * @param ctx the parse tree
     */
    void exitLogicalBinary(SparkScriptSqlParser.LogicalBinaryContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#predicated}.
     *
     * @param ctx the parse tree
     */
    void enterPredicated(SparkScriptSqlParser.PredicatedContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#predicated}.
     *
     * @param ctx the parse tree
     */
    void exitPredicated(SparkScriptSqlParser.PredicatedContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterPredicate(SparkScriptSqlParser.PredicateContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitPredicate(SparkScriptSqlParser.PredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code valueExpressionDefault}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void enterValueExpressionDefault(SparkScriptSqlParser.ValueExpressionDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code valueExpressionDefault}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void exitValueExpressionDefault(SparkScriptSqlParser.ValueExpressionDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code comparison}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void enterComparison(SparkScriptSqlParser.ComparisonContext ctx);

    /**
     * Exit a parse tree produced by the {@code comparison}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void exitComparison(SparkScriptSqlParser.ComparisonContext ctx);

    /**
     * Enter a parse tree produced by the {@code arithmeticBinary}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void enterArithmeticBinary(SparkScriptSqlParser.ArithmeticBinaryContext ctx);

    /**
     * Exit a parse tree produced by the {@code arithmeticBinary}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void exitArithmeticBinary(SparkScriptSqlParser.ArithmeticBinaryContext ctx);

    /**
     * Enter a parse tree produced by the {@code arithmeticUnary}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void enterArithmeticUnary(SparkScriptSqlParser.ArithmeticUnaryContext ctx);

    /**
     * Exit a parse tree produced by the {@code arithmeticUnary}
     * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
     *
     * @param ctx the parse tree
     */
    void exitArithmeticUnary(SparkScriptSqlParser.ArithmeticUnaryContext ctx);

    /**
     * Enter a parse tree produced by the {@code dereference}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterDereference(SparkScriptSqlParser.DereferenceContext ctx);

    /**
     * Exit a parse tree produced by the {@code dereference}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitDereference(SparkScriptSqlParser.DereferenceContext ctx);

    /**
     * Enter a parse tree produced by the {@code simpleCase}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleCase(SparkScriptSqlParser.SimpleCaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code simpleCase}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleCase(SparkScriptSqlParser.SimpleCaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code cast}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterCast(SparkScriptSqlParser.CastContext ctx);

    /**
     * Exit a parse tree produced by the {@code cast}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitCast(SparkScriptSqlParser.CastContext ctx);

    /**
     * Enter a parse tree produced by the {@code constantDefault}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConstantDefault(SparkScriptSqlParser.ConstantDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code constantDefault}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConstantDefault(SparkScriptSqlParser.ConstantDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code columnReference}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterColumnReference(SparkScriptSqlParser.ColumnReferenceContext ctx);

    /**
     * Exit a parse tree produced by the {@code columnReference}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitColumnReference(SparkScriptSqlParser.ColumnReferenceContext ctx);

    /**
     * Enter a parse tree produced by the {@code rowConstructor}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterRowConstructor(SparkScriptSqlParser.RowConstructorContext ctx);

    /**
     * Exit a parse tree produced by the {@code rowConstructor}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitRowConstructor(SparkScriptSqlParser.RowConstructorContext ctx);

    /**
     * Enter a parse tree produced by the {@code parenthesizedExpression}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterParenthesizedExpression(SparkScriptSqlParser.ParenthesizedExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code parenthesizedExpression}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitParenthesizedExpression(SparkScriptSqlParser.ParenthesizedExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code star}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterStar(SparkScriptSqlParser.StarContext ctx);

    /**
     * Exit a parse tree produced by the {@code star}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitStar(SparkScriptSqlParser.StarContext ctx);

    /**
     * Enter a parse tree produced by the {@code subscript}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSubscript(SparkScriptSqlParser.SubscriptContext ctx);

    /**
     * Exit a parse tree produced by the {@code subscript}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSubscript(SparkScriptSqlParser.SubscriptContext ctx);

    /**
     * Enter a parse tree produced by the {@code functionCall}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCall(SparkScriptSqlParser.FunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code functionCall}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCall(SparkScriptSqlParser.FunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code searchedCase}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSearchedCase(SparkScriptSqlParser.SearchedCaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code searchedCase}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSearchedCase(SparkScriptSqlParser.SearchedCaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code subqueryExpression}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSubqueryExpression(SparkScriptSqlParser.SubqueryExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code subqueryExpression}
     * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSubqueryExpression(SparkScriptSqlParser.SubqueryExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code nullLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterNullLiteral(SparkScriptSqlParser.NullLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code nullLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitNullLiteral(SparkScriptSqlParser.NullLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code intervalLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalLiteral(SparkScriptSqlParser.IntervalLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code intervalLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalLiteral(SparkScriptSqlParser.IntervalLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code typeConstructor}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterTypeConstructor(SparkScriptSqlParser.TypeConstructorContext ctx);

    /**
     * Exit a parse tree produced by the {@code typeConstructor}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitTypeConstructor(SparkScriptSqlParser.TypeConstructorContext ctx);

    /**
     * Enter a parse tree produced by the {@code numericLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterNumericLiteral(SparkScriptSqlParser.NumericLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code numericLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitNumericLiteral(SparkScriptSqlParser.NumericLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code booleanLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanLiteral(SparkScriptSqlParser.BooleanLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code booleanLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanLiteral(SparkScriptSqlParser.BooleanLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code stringLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterStringLiteral(SparkScriptSqlParser.StringLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code stringLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitStringLiteral(SparkScriptSqlParser.StringLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void enterComparisonOperator(SparkScriptSqlParser.ComparisonOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void exitComparisonOperator(SparkScriptSqlParser.ComparisonOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#arithmeticOperator}.
     *
     * @param ctx the parse tree
     */
    void enterArithmeticOperator(SparkScriptSqlParser.ArithmeticOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#arithmeticOperator}.
     *
     * @param ctx the parse tree
     */
    void exitArithmeticOperator(SparkScriptSqlParser.ArithmeticOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#predicateOperator}.
     *
     * @param ctx the parse tree
     */
    void enterPredicateOperator(SparkScriptSqlParser.PredicateOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#predicateOperator}.
     *
     * @param ctx the parse tree
     */
    void exitPredicateOperator(SparkScriptSqlParser.PredicateOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#booleanValue}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanValue(SparkScriptSqlParser.BooleanValueContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#booleanValue}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanValue(SparkScriptSqlParser.BooleanValueContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#interval}.
     *
     * @param ctx the parse tree
     */
    void enterInterval(SparkScriptSqlParser.IntervalContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#interval}.
     *
     * @param ctx the parse tree
     */
    void exitInterval(SparkScriptSqlParser.IntervalContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#intervalField}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalField(SparkScriptSqlParser.IntervalFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#intervalField}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalField(SparkScriptSqlParser.IntervalFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#intervalValue}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalValue(SparkScriptSqlParser.IntervalValueContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#intervalValue}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalValue(SparkScriptSqlParser.IntervalValueContext ctx);

    /**
     * Enter a parse tree produced by the {@code complexDataType}
     * labeled alternative in {@link SparkScriptSqlParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterComplexDataType(SparkScriptSqlParser.ComplexDataTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code complexDataType}
     * labeled alternative in {@link SparkScriptSqlParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitComplexDataType(SparkScriptSqlParser.ComplexDataTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code primitiveDataType}
     * labeled alternative in {@link SparkScriptSqlParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitiveDataType(SparkScriptSqlParser.PrimitiveDataTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code primitiveDataType}
     * labeled alternative in {@link SparkScriptSqlParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitiveDataType(SparkScriptSqlParser.PrimitiveDataTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#colTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterColTypeList(SparkScriptSqlParser.ColTypeListContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#colTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitColTypeList(SparkScriptSqlParser.ColTypeListContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#colType}.
     *
     * @param ctx the parse tree
     */
    void enterColType(SparkScriptSqlParser.ColTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#colType}.
     *
     * @param ctx the parse tree
     */
    void exitColType(SparkScriptSqlParser.ColTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#whenClause}.
     *
     * @param ctx the parse tree
     */
    void enterWhenClause(SparkScriptSqlParser.WhenClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#whenClause}.
     *
     * @param ctx the parse tree
     */
    void exitWhenClause(SparkScriptSqlParser.WhenClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#windows}.
     *
     * @param ctx the parse tree
     */
    void enterWindows(SparkScriptSqlParser.WindowsContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#windows}.
     *
     * @param ctx the parse tree
     */
    void exitWindows(SparkScriptSqlParser.WindowsContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#namedWindow}.
     *
     * @param ctx the parse tree
     */
    void enterNamedWindow(SparkScriptSqlParser.NamedWindowContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#namedWindow}.
     *
     * @param ctx the parse tree
     */
    void exitNamedWindow(SparkScriptSqlParser.NamedWindowContext ctx);

    /**
     * Enter a parse tree produced by the {@code windowRef}
     * labeled alternative in {@link SparkScriptSqlParser#windowSpec}.
     *
     * @param ctx the parse tree
     */
    void enterWindowRef(SparkScriptSqlParser.WindowRefContext ctx);

    /**
     * Exit a parse tree produced by the {@code windowRef}
     * labeled alternative in {@link SparkScriptSqlParser#windowSpec}.
     *
     * @param ctx the parse tree
     */
    void exitWindowRef(SparkScriptSqlParser.WindowRefContext ctx);

    /**
     * Enter a parse tree produced by the {@code windowDef}
     * labeled alternative in {@link SparkScriptSqlParser#windowSpec}.
     *
     * @param ctx the parse tree
     */
    void enterWindowDef(SparkScriptSqlParser.WindowDefContext ctx);

    /**
     * Exit a parse tree produced by the {@code windowDef}
     * labeled alternative in {@link SparkScriptSqlParser#windowSpec}.
     *
     * @param ctx the parse tree
     */
    void exitWindowDef(SparkScriptSqlParser.WindowDefContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#windowFrame}.
     *
     * @param ctx the parse tree
     */
    void enterWindowFrame(SparkScriptSqlParser.WindowFrameContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#windowFrame}.
     *
     * @param ctx the parse tree
     */
    void exitWindowFrame(SparkScriptSqlParser.WindowFrameContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#frameBound}.
     *
     * @param ctx the parse tree
     */
    void enterFrameBound(SparkScriptSqlParser.FrameBoundContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#frameBound}.
     *
     * @param ctx the parse tree
     */
    void exitFrameBound(SparkScriptSqlParser.FrameBoundContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#qualifiedName}.
     *
     * @param ctx the parse tree
     */
    void enterQualifiedName(SparkScriptSqlParser.QualifiedNameContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#qualifiedName}.
     *
     * @param ctx the parse tree
     */
    void exitQualifiedName(SparkScriptSqlParser.QualifiedNameContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(SparkScriptSqlParser.IdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(SparkScriptSqlParser.IdentifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code unquotedIdentifier}
     * labeled alternative in {@link SparkScriptSqlParser#strictIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterUnquotedIdentifier(SparkScriptSqlParser.UnquotedIdentifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code unquotedIdentifier}
     * labeled alternative in {@link SparkScriptSqlParser#strictIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitUnquotedIdentifier(SparkScriptSqlParser.UnquotedIdentifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
     * labeled alternative in {@link SparkScriptSqlParser#strictIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterQuotedIdentifierAlternative(SparkScriptSqlParser.QuotedIdentifierAlternativeContext ctx);

    /**
     * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
     * labeled alternative in {@link SparkScriptSqlParser#strictIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitQuotedIdentifierAlternative(SparkScriptSqlParser.QuotedIdentifierAlternativeContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#quotedIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterQuotedIdentifier(SparkScriptSqlParser.QuotedIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#quotedIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitQuotedIdentifier(SparkScriptSqlParser.QuotedIdentifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code decimalLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterDecimalLiteral(SparkScriptSqlParser.DecimalLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code decimalLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitDecimalLiteral(SparkScriptSqlParser.DecimalLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code scientificDecimalLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterScientificDecimalLiteral(SparkScriptSqlParser.ScientificDecimalLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code scientificDecimalLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitScientificDecimalLiteral(SparkScriptSqlParser.ScientificDecimalLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code integerLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterIntegerLiteral(SparkScriptSqlParser.IntegerLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code integerLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitIntegerLiteral(SparkScriptSqlParser.IntegerLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code bigIntLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterBigIntLiteral(SparkScriptSqlParser.BigIntLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code bigIntLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitBigIntLiteral(SparkScriptSqlParser.BigIntLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code smallIntLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterSmallIntLiteral(SparkScriptSqlParser.SmallIntLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code smallIntLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitSmallIntLiteral(SparkScriptSqlParser.SmallIntLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code tinyIntLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterTinyIntLiteral(SparkScriptSqlParser.TinyIntLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code tinyIntLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitTinyIntLiteral(SparkScriptSqlParser.TinyIntLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code doubleLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterDoubleLiteral(SparkScriptSqlParser.DoubleLiteralContext ctx);

    /**
     * Exit a parse tree produced by the {@code doubleLiteral}
     * labeled alternative in {@link SparkScriptSqlParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitDoubleLiteral(SparkScriptSqlParser.DoubleLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link SparkScriptSqlParser#nonReserved}.
     *
     * @param ctx the parse tree
     */
    void enterNonReserved(SparkScriptSqlParser.NonReservedContext ctx);

    /**
     * Exit a parse tree produced by {@link SparkScriptSqlParser#nonReserved}.
     *
     * @param ctx the parse tree
     */
    void exitNonReserved(SparkScriptSqlParser.NonReservedContext ctx);
}