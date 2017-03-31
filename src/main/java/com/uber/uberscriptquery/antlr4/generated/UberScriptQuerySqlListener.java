// Generated from UberScriptQuerySql.g4 by ANTLR 4.5.3

   package com.uber.uberscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UberScriptQuerySqlParser}.
 */
public interface UberScriptQuerySqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(UberScriptQuerySqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(UberScriptQuerySqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterJsonQueryStatementAssignment(UberScriptQuerySqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitJsonQueryStatementAssignment(UberScriptQuerySqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void enterJsonQueryStatementAssignment_query(UberScriptQuerySqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void exitJsonQueryStatementAssignment_query(UberScriptQuerySqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(UberScriptQuerySqlParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(UberScriptQuerySqlParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_tableAlias(UberScriptQuerySqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_tableAlias(UberScriptQuerySqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_queryType(UberScriptQuerySqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_queryType(UberScriptQuerySqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_queryEngine(UberScriptQuerySqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_queryEngine(UberScriptQuerySqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_query(UberScriptQuerySqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_query(UberScriptQuerySqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#configSetting}.
	 * @param ctx the parse tree
	 */
	void enterConfigSetting(UberScriptQuerySqlParser.ConfigSettingContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#configSetting}.
	 * @param ctx the parse tree
	 */
	void exitConfigSetting(UberScriptQuerySqlParser.ConfigSettingContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment(UberScriptQuerySqlParser.FileAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment(UberScriptQuerySqlParser.FileAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment_tableAlias(UberScriptQuerySqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment_tableAlias(UberScriptQuerySqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment_fileType(UberScriptQuerySqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment_fileType(UberScriptQuerySqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 */
	void enterFileAssignment_fileLocation(UberScriptQuerySqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 */
	void exitFileAssignment_fileLocation(UberScriptQuerySqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#actionStatement}.
	 * @param ctx the parse tree
	 */
	void enterActionStatement(UberScriptQuerySqlParser.ActionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#actionStatement}.
	 * @param ctx the parse tree
	 */
	void exitActionStatement(UberScriptQuerySqlParser.ActionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 */
	void enterActionStatement_param(UberScriptQuerySqlParser.ActionStatement_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 */
	void exitActionStatement_param(UberScriptQuerySqlParser.ActionStatement_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(UberScriptQuerySqlParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(UberScriptQuerySqlParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void enterJsonArray(UberScriptQuerySqlParser.JsonArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void exitJsonArray(UberScriptQuerySqlParser.JsonArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#jsonPair}.
	 * @param ctx the parse tree
	 */
	void enterJsonPair(UberScriptQuerySqlParser.JsonPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#jsonPair}.
	 * @param ctx the parse tree
	 */
	void exitJsonPair(UberScriptQuerySqlParser.JsonPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(UberScriptQuerySqlParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(UberScriptQuerySqlParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(UberScriptQuerySqlParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(UberScriptQuerySqlParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(UberScriptQuerySqlParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(UberScriptQuerySqlParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(UberScriptQuerySqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(UberScriptQuerySqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(UberScriptQuerySqlParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(UberScriptQuerySqlParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(UberScriptQuerySqlParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(UberScriptQuerySqlParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(UberScriptQuerySqlParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(UberScriptQuerySqlParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(UberScriptQuerySqlParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(UberScriptQuerySqlParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(UberScriptQuerySqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(UberScriptQuerySqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(UberScriptQuerySqlParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(UberScriptQuerySqlParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableUsing(UberScriptQuerySqlParser.CreateTableUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableUsing(UberScriptQuerySqlParser.CreateTableUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(UberScriptQuerySqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(UberScriptQuerySqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(UberScriptQuerySqlParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(UberScriptQuerySqlParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(UberScriptQuerySqlParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(UberScriptQuerySqlParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(UberScriptQuerySqlParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(UberScriptQuerySqlParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(UberScriptQuerySqlParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(UberScriptQuerySqlParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(UberScriptQuerySqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(UberScriptQuerySqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(UberScriptQuerySqlParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(UberScriptQuerySqlParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(UberScriptQuerySqlParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(UberScriptQuerySqlParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(UberScriptQuerySqlParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(UberScriptQuerySqlParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(UberScriptQuerySqlParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(UberScriptQuerySqlParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(UberScriptQuerySqlParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(UberScriptQuerySqlParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(UberScriptQuerySqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(UberScriptQuerySqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(UberScriptQuerySqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(UberScriptQuerySqlParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(UberScriptQuerySqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(UberScriptQuerySqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(UberScriptQuerySqlParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(UberScriptQuerySqlParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(UberScriptQuerySqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(UberScriptQuerySqlParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(UberScriptQuerySqlParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(UberScriptQuerySqlParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(UberScriptQuerySqlParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(UberScriptQuerySqlParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(UberScriptQuerySqlParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(UberScriptQuerySqlParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(UberScriptQuerySqlParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(UberScriptQuerySqlParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(UberScriptQuerySqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(UberScriptQuerySqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(UberScriptQuerySqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(UberScriptQuerySqlParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(UberScriptQuerySqlParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(UberScriptQuerySqlParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(UberScriptQuerySqlParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(UberScriptQuerySqlParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(UberScriptQuerySqlParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(UberScriptQuerySqlParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(UberScriptQuerySqlParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(UberScriptQuerySqlParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(UberScriptQuerySqlParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(UberScriptQuerySqlParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(UberScriptQuerySqlParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(UberScriptQuerySqlParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(UberScriptQuerySqlParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(UberScriptQuerySqlParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(UberScriptQuerySqlParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(UberScriptQuerySqlParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(UberScriptQuerySqlParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(UberScriptQuerySqlParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(UberScriptQuerySqlParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(UberScriptQuerySqlParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(UberScriptQuerySqlParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(UberScriptQuerySqlParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(UberScriptQuerySqlParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(UberScriptQuerySqlParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(UberScriptQuerySqlParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(UberScriptQuerySqlParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(UberScriptQuerySqlParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(UberScriptQuerySqlParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(UberScriptQuerySqlParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(UberScriptQuerySqlParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(UberScriptQuerySqlParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(UberScriptQuerySqlParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(UberScriptQuerySqlParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(UberScriptQuerySqlParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(UberScriptQuerySqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(UberScriptQuerySqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(UberScriptQuerySqlParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(UberScriptQuerySqlParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(UberScriptQuerySqlParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(UberScriptQuerySqlParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(UberScriptQuerySqlParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(UberScriptQuerySqlParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(UberScriptQuerySqlParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(UberScriptQuerySqlParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(UberScriptQuerySqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(UberScriptQuerySqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(UberScriptQuerySqlParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(UberScriptQuerySqlParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(UberScriptQuerySqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(UberScriptQuerySqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(UberScriptQuerySqlParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(UberScriptQuerySqlParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(UberScriptQuerySqlParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(UberScriptQuerySqlParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(UberScriptQuerySqlParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(UberScriptQuerySqlParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(UberScriptQuerySqlParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(UberScriptQuerySqlParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(UberScriptQuerySqlParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(UberScriptQuerySqlParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(UberScriptQuerySqlParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(UberScriptQuerySqlParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(UberScriptQuerySqlParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(UberScriptQuerySqlParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(UberScriptQuerySqlParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(UberScriptQuerySqlParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(UberScriptQuerySqlParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(UberScriptQuerySqlParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(UberScriptQuerySqlParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(UberScriptQuerySqlParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(UberScriptQuerySqlParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(UberScriptQuerySqlParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(UberScriptQuerySqlParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(UberScriptQuerySqlParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(UberScriptQuerySqlParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(UberScriptQuerySqlParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(UberScriptQuerySqlParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(UberScriptQuerySqlParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UberScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(UberScriptQuerySqlParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UberScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(UberScriptQuerySqlParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UberScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(UberScriptQuerySqlParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UberScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(UberScriptQuerySqlParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(UberScriptQuerySqlParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(UberScriptQuerySqlParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(UberScriptQuerySqlParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(UberScriptQuerySqlParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(UberScriptQuerySqlParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(UberScriptQuerySqlParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(UberScriptQuerySqlParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(UberScriptQuerySqlParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(UberScriptQuerySqlParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(UberScriptQuerySqlParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(UberScriptQuerySqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(UberScriptQuerySqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(UberScriptQuerySqlParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(UberScriptQuerySqlParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(UberScriptQuerySqlParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(UberScriptQuerySqlParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(UberScriptQuerySqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(UberScriptQuerySqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(UberScriptQuerySqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(UberScriptQuerySqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(UberScriptQuerySqlParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(UberScriptQuerySqlParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(UberScriptQuerySqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(UberScriptQuerySqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(UberScriptQuerySqlParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(UberScriptQuerySqlParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(UberScriptQuerySqlParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(UberScriptQuerySqlParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(UberScriptQuerySqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(UberScriptQuerySqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(UberScriptQuerySqlParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(UberScriptQuerySqlParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(UberScriptQuerySqlParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(UberScriptQuerySqlParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(UberScriptQuerySqlParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(UberScriptQuerySqlParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(UberScriptQuerySqlParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(UberScriptQuerySqlParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(UberScriptQuerySqlParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(UberScriptQuerySqlParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(UberScriptQuerySqlParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(UberScriptQuerySqlParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(UberScriptQuerySqlParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(UberScriptQuerySqlParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(UberScriptQuerySqlParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(UberScriptQuerySqlParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(UberScriptQuerySqlParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(UberScriptQuerySqlParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(UberScriptQuerySqlParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(UberScriptQuerySqlParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(UberScriptQuerySqlParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(UberScriptQuerySqlParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(UberScriptQuerySqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(UberScriptQuerySqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(UberScriptQuerySqlParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(UberScriptQuerySqlParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(UberScriptQuerySqlParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(UberScriptQuerySqlParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(UberScriptQuerySqlParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(UberScriptQuerySqlParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(UberScriptQuerySqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(UberScriptQuerySqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(UberScriptQuerySqlParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(UberScriptQuerySqlParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(UberScriptQuerySqlParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(UberScriptQuerySqlParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(UberScriptQuerySqlParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(UberScriptQuerySqlParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(UberScriptQuerySqlParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(UberScriptQuerySqlParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UberScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(UberScriptQuerySqlParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UberScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(UberScriptQuerySqlParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UberScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(UberScriptQuerySqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UberScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(UberScriptQuerySqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(UberScriptQuerySqlParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(UberScriptQuerySqlParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(UberScriptQuerySqlParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(UberScriptQuerySqlParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(UberScriptQuerySqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(UberScriptQuerySqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UberScriptQuerySqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UberScriptQuerySqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(UberScriptQuerySqlParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(UberScriptQuerySqlParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(UberScriptQuerySqlParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(UberScriptQuerySqlParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(UberScriptQuerySqlParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(UberScriptQuerySqlParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(UberScriptQuerySqlParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(UberScriptQuerySqlParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(UberScriptQuerySqlParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(UberScriptQuerySqlParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(UberScriptQuerySqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(UberScriptQuerySqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(UberScriptQuerySqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(UberScriptQuerySqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(UberScriptQuerySqlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(UberScriptQuerySqlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(UberScriptQuerySqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(UberScriptQuerySqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(UberScriptQuerySqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(UberScriptQuerySqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(UberScriptQuerySqlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(UberScriptQuerySqlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(UberScriptQuerySqlParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(UberScriptQuerySqlParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(UberScriptQuerySqlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(UberScriptQuerySqlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(UberScriptQuerySqlParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(UberScriptQuerySqlParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(UberScriptQuerySqlParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(UberScriptQuerySqlParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(UberScriptQuerySqlParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(UberScriptQuerySqlParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(UberScriptQuerySqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(UberScriptQuerySqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(UberScriptQuerySqlParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(UberScriptQuerySqlParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(UberScriptQuerySqlParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(UberScriptQuerySqlParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UberScriptQuerySqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UberScriptQuerySqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(UberScriptQuerySqlParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(UberScriptQuerySqlParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(UberScriptQuerySqlParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(UberScriptQuerySqlParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(UberScriptQuerySqlParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(UberScriptQuerySqlParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(UberScriptQuerySqlParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(UberScriptQuerySqlParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(UberScriptQuerySqlParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(UberScriptQuerySqlParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(UberScriptQuerySqlParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(UberScriptQuerySqlParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(UberScriptQuerySqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(UberScriptQuerySqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(UberScriptQuerySqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(UberScriptQuerySqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(UberScriptQuerySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(UberScriptQuerySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(UberScriptQuerySqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(UberScriptQuerySqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(UberScriptQuerySqlParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(UberScriptQuerySqlParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(UberScriptQuerySqlParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(UberScriptQuerySqlParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(UberScriptQuerySqlParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(UberScriptQuerySqlParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(UberScriptQuerySqlParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(UberScriptQuerySqlParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(UberScriptQuerySqlParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(UberScriptQuerySqlParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UberScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(UberScriptQuerySqlParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UberScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(UberScriptQuerySqlParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UberScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(UberScriptQuerySqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UberScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(UberScriptQuerySqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(UberScriptQuerySqlParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(UberScriptQuerySqlParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(UberScriptQuerySqlParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(UberScriptQuerySqlParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(UberScriptQuerySqlParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(UberScriptQuerySqlParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(UberScriptQuerySqlParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(UberScriptQuerySqlParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(UberScriptQuerySqlParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(UberScriptQuerySqlParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UberScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(UberScriptQuerySqlParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UberScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(UberScriptQuerySqlParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UberScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(UberScriptQuerySqlParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UberScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(UberScriptQuerySqlParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(UberScriptQuerySqlParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(UberScriptQuerySqlParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(UberScriptQuerySqlParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(UberScriptQuerySqlParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(UberScriptQuerySqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(UberScriptQuerySqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(UberScriptQuerySqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(UberScriptQuerySqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UberScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(UberScriptQuerySqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UberScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(UberScriptQuerySqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UberScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(UberScriptQuerySqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UberScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(UberScriptQuerySqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(UberScriptQuerySqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(UberScriptQuerySqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(UberScriptQuerySqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(UberScriptQuerySqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterScientificDecimalLiteral(UberScriptQuerySqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitScientificDecimalLiteral(UberScriptQuerySqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(UberScriptQuerySqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(UberScriptQuerySqlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(UberScriptQuerySqlParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(UberScriptQuerySqlParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(UberScriptQuerySqlParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(UberScriptQuerySqlParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(UberScriptQuerySqlParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(UberScriptQuerySqlParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(UberScriptQuerySqlParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(UberScriptQuerySqlParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQuerySqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(UberScriptQuerySqlParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQuerySqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(UberScriptQuerySqlParser.NonReservedContext ctx);
}