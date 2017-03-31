// Generated from UScriptQuerySql.g4 by ANTLR 4.5.3

   package com.uber.uscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UScriptQuerySqlParser}.
 */
public interface UScriptQuerySqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(UScriptQuerySqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(UScriptQuerySqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterJsonQueryStatementAssignment(UScriptQuerySqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitJsonQueryStatementAssignment(UScriptQuerySqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void enterJsonQueryStatementAssignment_query(UScriptQuerySqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void exitJsonQueryStatementAssignment_query(UScriptQuerySqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(UScriptQuerySqlParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(UScriptQuerySqlParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_tableAlias(UScriptQuerySqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_tableAlias(UScriptQuerySqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_queryType(UScriptQuerySqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_queryType(UScriptQuerySqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_queryEngine(UScriptQuerySqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_queryEngine(UScriptQuerySqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_query(UScriptQuerySqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_query(UScriptQuerySqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#configSetting}.
	 * @param ctx the parse tree
	 */
	void enterConfigSetting(UScriptQuerySqlParser.ConfigSettingContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#configSetting}.
	 * @param ctx the parse tree
	 */
	void exitConfigSetting(UScriptQuerySqlParser.ConfigSettingContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment(UScriptQuerySqlParser.FileAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment(UScriptQuerySqlParser.FileAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment_tableAlias(UScriptQuerySqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment_tableAlias(UScriptQuerySqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment_fileType(UScriptQuerySqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment_fileType(UScriptQuerySqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment_fileLocation(UScriptQuerySqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment_fileLocation(UScriptQuerySqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#actionStatement}.
	 * @param ctx the parse tree
	 */
	void enterActionStatement(UScriptQuerySqlParser.ActionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#actionStatement}.
	 * @param ctx the parse tree
	 */
	void exitActionStatement(UScriptQuerySqlParser.ActionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 */
	void enterActionStatement_param(UScriptQuerySqlParser.ActionStatement_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 */
	void exitActionStatement_param(UScriptQuerySqlParser.ActionStatement_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(UScriptQuerySqlParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(UScriptQuerySqlParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void enterJsonArray(UScriptQuerySqlParser.JsonArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void exitJsonArray(UScriptQuerySqlParser.JsonArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#jsonPair}.
	 * @param ctx the parse tree
	 */
	void enterJsonPair(UScriptQuerySqlParser.JsonPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#jsonPair}.
	 * @param ctx the parse tree
	 */
	void exitJsonPair(UScriptQuerySqlParser.JsonPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(UScriptQuerySqlParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(UScriptQuerySqlParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(UScriptQuerySqlParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(UScriptQuerySqlParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(UScriptQuerySqlParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(UScriptQuerySqlParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(UScriptQuerySqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(UScriptQuerySqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(UScriptQuerySqlParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(UScriptQuerySqlParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(UScriptQuerySqlParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(UScriptQuerySqlParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(UScriptQuerySqlParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(UScriptQuerySqlParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(UScriptQuerySqlParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(UScriptQuerySqlParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(UScriptQuerySqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(UScriptQuerySqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(UScriptQuerySqlParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(UScriptQuerySqlParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableUsing(UScriptQuerySqlParser.CreateTableUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableUsing(UScriptQuerySqlParser.CreateTableUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(UScriptQuerySqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(UScriptQuerySqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(UScriptQuerySqlParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(UScriptQuerySqlParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(UScriptQuerySqlParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(UScriptQuerySqlParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(UScriptQuerySqlParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(UScriptQuerySqlParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(UScriptQuerySqlParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(UScriptQuerySqlParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(UScriptQuerySqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(UScriptQuerySqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(UScriptQuerySqlParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(UScriptQuerySqlParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(UScriptQuerySqlParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(UScriptQuerySqlParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(UScriptQuerySqlParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(UScriptQuerySqlParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(UScriptQuerySqlParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(UScriptQuerySqlParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(UScriptQuerySqlParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(UScriptQuerySqlParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(UScriptQuerySqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(UScriptQuerySqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(UScriptQuerySqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(UScriptQuerySqlParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(UScriptQuerySqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(UScriptQuerySqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(UScriptQuerySqlParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(UScriptQuerySqlParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(UScriptQuerySqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(UScriptQuerySqlParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(UScriptQuerySqlParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(UScriptQuerySqlParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(UScriptQuerySqlParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(UScriptQuerySqlParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(UScriptQuerySqlParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(UScriptQuerySqlParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(UScriptQuerySqlParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(UScriptQuerySqlParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(UScriptQuerySqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(UScriptQuerySqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(UScriptQuerySqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(UScriptQuerySqlParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(UScriptQuerySqlParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(UScriptQuerySqlParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(UScriptQuerySqlParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(UScriptQuerySqlParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(UScriptQuerySqlParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(UScriptQuerySqlParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(UScriptQuerySqlParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(UScriptQuerySqlParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(UScriptQuerySqlParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(UScriptQuerySqlParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(UScriptQuerySqlParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(UScriptQuerySqlParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(UScriptQuerySqlParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(UScriptQuerySqlParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(UScriptQuerySqlParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(UScriptQuerySqlParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(UScriptQuerySqlParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(UScriptQuerySqlParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(UScriptQuerySqlParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(UScriptQuerySqlParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(UScriptQuerySqlParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(UScriptQuerySqlParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(UScriptQuerySqlParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(UScriptQuerySqlParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(UScriptQuerySqlParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(UScriptQuerySqlParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(UScriptQuerySqlParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(UScriptQuerySqlParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(UScriptQuerySqlParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(UScriptQuerySqlParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(UScriptQuerySqlParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(UScriptQuerySqlParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(UScriptQuerySqlParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(UScriptQuerySqlParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(UScriptQuerySqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(UScriptQuerySqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(UScriptQuerySqlParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(UScriptQuerySqlParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(UScriptQuerySqlParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(UScriptQuerySqlParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(UScriptQuerySqlParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(UScriptQuerySqlParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(UScriptQuerySqlParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(UScriptQuerySqlParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(UScriptQuerySqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(UScriptQuerySqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(UScriptQuerySqlParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(UScriptQuerySqlParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(UScriptQuerySqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(UScriptQuerySqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(UScriptQuerySqlParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(UScriptQuerySqlParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(UScriptQuerySqlParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(UScriptQuerySqlParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(UScriptQuerySqlParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(UScriptQuerySqlParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(UScriptQuerySqlParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(UScriptQuerySqlParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(UScriptQuerySqlParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(UScriptQuerySqlParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(UScriptQuerySqlParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(UScriptQuerySqlParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(UScriptQuerySqlParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(UScriptQuerySqlParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(UScriptQuerySqlParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(UScriptQuerySqlParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(UScriptQuerySqlParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(UScriptQuerySqlParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(UScriptQuerySqlParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(UScriptQuerySqlParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(UScriptQuerySqlParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(UScriptQuerySqlParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(UScriptQuerySqlParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(UScriptQuerySqlParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(UScriptQuerySqlParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(UScriptQuerySqlParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(UScriptQuerySqlParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(UScriptQuerySqlParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(UScriptQuerySqlParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(UScriptQuerySqlParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(UScriptQuerySqlParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(UScriptQuerySqlParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(UScriptQuerySqlParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(UScriptQuerySqlParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(UScriptQuerySqlParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(UScriptQuerySqlParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(UScriptQuerySqlParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(UScriptQuerySqlParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(UScriptQuerySqlParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(UScriptQuerySqlParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(UScriptQuerySqlParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(UScriptQuerySqlParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(UScriptQuerySqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(UScriptQuerySqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(UScriptQuerySqlParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(UScriptQuerySqlParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(UScriptQuerySqlParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(UScriptQuerySqlParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(UScriptQuerySqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(UScriptQuerySqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(UScriptQuerySqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(UScriptQuerySqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(UScriptQuerySqlParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(UScriptQuerySqlParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(UScriptQuerySqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(UScriptQuerySqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(UScriptQuerySqlParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(UScriptQuerySqlParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(UScriptQuerySqlParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(UScriptQuerySqlParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(UScriptQuerySqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(UScriptQuerySqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(UScriptQuerySqlParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(UScriptQuerySqlParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(UScriptQuerySqlParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(UScriptQuerySqlParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(UScriptQuerySqlParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(UScriptQuerySqlParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(UScriptQuerySqlParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(UScriptQuerySqlParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(UScriptQuerySqlParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(UScriptQuerySqlParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(UScriptQuerySqlParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(UScriptQuerySqlParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(UScriptQuerySqlParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(UScriptQuerySqlParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(UScriptQuerySqlParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(UScriptQuerySqlParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(UScriptQuerySqlParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(UScriptQuerySqlParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(UScriptQuerySqlParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(UScriptQuerySqlParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(UScriptQuerySqlParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(UScriptQuerySqlParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(UScriptQuerySqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(UScriptQuerySqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(UScriptQuerySqlParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(UScriptQuerySqlParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(UScriptQuerySqlParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(UScriptQuerySqlParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(UScriptQuerySqlParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(UScriptQuerySqlParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(UScriptQuerySqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(UScriptQuerySqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(UScriptQuerySqlParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(UScriptQuerySqlParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(UScriptQuerySqlParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(UScriptQuerySqlParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(UScriptQuerySqlParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(UScriptQuerySqlParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(UScriptQuerySqlParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(UScriptQuerySqlParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(UScriptQuerySqlParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(UScriptQuerySqlParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(UScriptQuerySqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(UScriptQuerySqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(UScriptQuerySqlParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(UScriptQuerySqlParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(UScriptQuerySqlParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(UScriptQuerySqlParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(UScriptQuerySqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(UScriptQuerySqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UScriptQuerySqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UScriptQuerySqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(UScriptQuerySqlParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(UScriptQuerySqlParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(UScriptQuerySqlParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(UScriptQuerySqlParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(UScriptQuerySqlParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(UScriptQuerySqlParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(UScriptQuerySqlParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(UScriptQuerySqlParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(UScriptQuerySqlParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(UScriptQuerySqlParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(UScriptQuerySqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(UScriptQuerySqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(UScriptQuerySqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(UScriptQuerySqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(UScriptQuerySqlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(UScriptQuerySqlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(UScriptQuerySqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(UScriptQuerySqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(UScriptQuerySqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(UScriptQuerySqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(UScriptQuerySqlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(UScriptQuerySqlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(UScriptQuerySqlParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(UScriptQuerySqlParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(UScriptQuerySqlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(UScriptQuerySqlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(UScriptQuerySqlParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(UScriptQuerySqlParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(UScriptQuerySqlParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(UScriptQuerySqlParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(UScriptQuerySqlParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(UScriptQuerySqlParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(UScriptQuerySqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(UScriptQuerySqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(UScriptQuerySqlParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(UScriptQuerySqlParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(UScriptQuerySqlParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(UScriptQuerySqlParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UScriptQuerySqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UScriptQuerySqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(UScriptQuerySqlParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(UScriptQuerySqlParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(UScriptQuerySqlParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(UScriptQuerySqlParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(UScriptQuerySqlParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(UScriptQuerySqlParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(UScriptQuerySqlParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(UScriptQuerySqlParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(UScriptQuerySqlParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(UScriptQuerySqlParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(UScriptQuerySqlParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(UScriptQuerySqlParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(UScriptQuerySqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(UScriptQuerySqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(UScriptQuerySqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(UScriptQuerySqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(UScriptQuerySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(UScriptQuerySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(UScriptQuerySqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(UScriptQuerySqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(UScriptQuerySqlParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(UScriptQuerySqlParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(UScriptQuerySqlParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(UScriptQuerySqlParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(UScriptQuerySqlParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(UScriptQuerySqlParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(UScriptQuerySqlParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(UScriptQuerySqlParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(UScriptQuerySqlParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(UScriptQuerySqlParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(UScriptQuerySqlParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(UScriptQuerySqlParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(UScriptQuerySqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(UScriptQuerySqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(UScriptQuerySqlParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(UScriptQuerySqlParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(UScriptQuerySqlParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(UScriptQuerySqlParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(UScriptQuerySqlParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(UScriptQuerySqlParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(UScriptQuerySqlParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(UScriptQuerySqlParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(UScriptQuerySqlParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(UScriptQuerySqlParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(UScriptQuerySqlParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(UScriptQuerySqlParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(UScriptQuerySqlParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(UScriptQuerySqlParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(UScriptQuerySqlParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(UScriptQuerySqlParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(UScriptQuerySqlParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(UScriptQuerySqlParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(UScriptQuerySqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(UScriptQuerySqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(UScriptQuerySqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(UScriptQuerySqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(UScriptQuerySqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(UScriptQuerySqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(UScriptQuerySqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(UScriptQuerySqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(UScriptQuerySqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(UScriptQuerySqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(UScriptQuerySqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(UScriptQuerySqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterScientificDecimalLiteral(UScriptQuerySqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitScientificDecimalLiteral(UScriptQuerySqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(UScriptQuerySqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(UScriptQuerySqlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(UScriptQuerySqlParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(UScriptQuerySqlParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(UScriptQuerySqlParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(UScriptQuerySqlParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(UScriptQuerySqlParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(UScriptQuerySqlParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(UScriptQuerySqlParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(UScriptQuerySqlParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQuerySqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(UScriptQuerySqlParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQuerySqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(UScriptQuerySqlParser.NonReservedContext ctx);
}