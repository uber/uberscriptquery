// Generated from UberScriptQueryTemplate.g4 by ANTLR 4.5.3

   package com.uber.uberscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UberScriptQueryTemplateParser}.
 */
public interface UberScriptQueryTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(UberScriptQueryTemplateParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(UberScriptQueryTemplateParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentWithSemicolon(UberScriptQueryTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentWithSemicolon(UberScriptQueryTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(UberScriptQueryTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(UberScriptQueryTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment_variableName(UberScriptQueryTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment_variableName(UberScriptQueryTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(UberScriptQueryTemplateParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(UberScriptQueryTemplateParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(UberScriptQueryTemplateParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(UberScriptQueryTemplateParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(UberScriptQueryTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(UberScriptQueryTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(UberScriptQueryTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(UberScriptQueryTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(UberScriptQueryTemplateParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(UberScriptQueryTemplateParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableUsing(UberScriptQueryTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableUsing(UberScriptQueryTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(UberScriptQueryTemplateParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(UberScriptQueryTemplateParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(UberScriptQueryTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(UberScriptQueryTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(UberScriptQueryTemplateParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(UberScriptQueryTemplateParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(UberScriptQueryTemplateParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(UberScriptQueryTemplateParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(UberScriptQueryTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(UberScriptQueryTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(UberScriptQueryTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(UberScriptQueryTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(UberScriptQueryTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(UberScriptQueryTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(UberScriptQueryTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(UberScriptQueryTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(UberScriptQueryTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(UberScriptQueryTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(UberScriptQueryTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(UberScriptQueryTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(UberScriptQueryTemplateParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(UberScriptQueryTemplateParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(UberScriptQueryTemplateParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(UberScriptQueryTemplateParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(UberScriptQueryTemplateParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(UberScriptQueryTemplateParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(UberScriptQueryTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(UberScriptQueryTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(UberScriptQueryTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(UberScriptQueryTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(UberScriptQueryTemplateParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(UberScriptQueryTemplateParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(UberScriptQueryTemplateParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(UberScriptQueryTemplateParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(UberScriptQueryTemplateParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(UberScriptQueryTemplateParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(UberScriptQueryTemplateParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(UberScriptQueryTemplateParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(UberScriptQueryTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(UberScriptQueryTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(UberScriptQueryTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(UberScriptQueryTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(UberScriptQueryTemplateParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(UberScriptQueryTemplateParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(UberScriptQueryTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(UberScriptQueryTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(UberScriptQueryTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(UberScriptQueryTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(UberScriptQueryTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(UberScriptQueryTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(UberScriptQueryTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(UberScriptQueryTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(UberScriptQueryTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(UberScriptQueryTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(UberScriptQueryTemplateParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(UberScriptQueryTemplateParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(UberScriptQueryTemplateParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(UberScriptQueryTemplateParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(UberScriptQueryTemplateParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(UberScriptQueryTemplateParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(UberScriptQueryTemplateParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(UberScriptQueryTemplateParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(UberScriptQueryTemplateParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(UberScriptQueryTemplateParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(UberScriptQueryTemplateParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(UberScriptQueryTemplateParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(UberScriptQueryTemplateParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(UberScriptQueryTemplateParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(UberScriptQueryTemplateParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(UberScriptQueryTemplateParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(UberScriptQueryTemplateParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(UberScriptQueryTemplateParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(UberScriptQueryTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(UberScriptQueryTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(UberScriptQueryTemplateParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(UberScriptQueryTemplateParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(UberScriptQueryTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(UberScriptQueryTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(UberScriptQueryTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(UberScriptQueryTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(UberScriptQueryTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(UberScriptQueryTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(UberScriptQueryTemplateParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(UberScriptQueryTemplateParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(UberScriptQueryTemplateParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(UberScriptQueryTemplateParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(UberScriptQueryTemplateParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(UberScriptQueryTemplateParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(UberScriptQueryTemplateParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(UberScriptQueryTemplateParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(UberScriptQueryTemplateParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(UberScriptQueryTemplateParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(UberScriptQueryTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(UberScriptQueryTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(UberScriptQueryTemplateParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(UberScriptQueryTemplateParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(UberScriptQueryTemplateParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(UberScriptQueryTemplateParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(UberScriptQueryTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(UberScriptQueryTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(UberScriptQueryTemplateParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(UberScriptQueryTemplateParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(UberScriptQueryTemplateParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(UberScriptQueryTemplateParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(UberScriptQueryTemplateParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(UberScriptQueryTemplateParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(UberScriptQueryTemplateParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(UberScriptQueryTemplateParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(UberScriptQueryTemplateParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(UberScriptQueryTemplateParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(UberScriptQueryTemplateParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(UberScriptQueryTemplateParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(UberScriptQueryTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(UberScriptQueryTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(UberScriptQueryTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(UberScriptQueryTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(UberScriptQueryTemplateParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(UberScriptQueryTemplateParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(UberScriptQueryTemplateParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(UberScriptQueryTemplateParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(UberScriptQueryTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(UberScriptQueryTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(UberScriptQueryTemplateParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(UberScriptQueryTemplateParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(UberScriptQueryTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(UberScriptQueryTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(UberScriptQueryTemplateParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(UberScriptQueryTemplateParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(UberScriptQueryTemplateParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(UberScriptQueryTemplateParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(UberScriptQueryTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(UberScriptQueryTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(UberScriptQueryTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(UberScriptQueryTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(UberScriptQueryTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(UberScriptQueryTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(UberScriptQueryTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(UberScriptQueryTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(UberScriptQueryTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(UberScriptQueryTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(UberScriptQueryTemplateParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(UberScriptQueryTemplateParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(UberScriptQueryTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(UberScriptQueryTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(UberScriptQueryTemplateParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(UberScriptQueryTemplateParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(UberScriptQueryTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(UberScriptQueryTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(UberScriptQueryTemplateParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(UberScriptQueryTemplateParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(UberScriptQueryTemplateParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(UberScriptQueryTemplateParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(UberScriptQueryTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(UberScriptQueryTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(UberScriptQueryTemplateParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(UberScriptQueryTemplateParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(UberScriptQueryTemplateParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(UberScriptQueryTemplateParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(UberScriptQueryTemplateParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(UberScriptQueryTemplateParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(UberScriptQueryTemplateParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(UberScriptQueryTemplateParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(UberScriptQueryTemplateParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(UberScriptQueryTemplateParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(UberScriptQueryTemplateParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(UberScriptQueryTemplateParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(UberScriptQueryTemplateParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(UberScriptQueryTemplateParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(UberScriptQueryTemplateParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(UberScriptQueryTemplateParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(UberScriptQueryTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(UberScriptQueryTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(UberScriptQueryTemplateParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(UberScriptQueryTemplateParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(UberScriptQueryTemplateParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(UberScriptQueryTemplateParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(UberScriptQueryTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(UberScriptQueryTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(UberScriptQueryTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(UberScriptQueryTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(UberScriptQueryTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(UberScriptQueryTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(UberScriptQueryTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(UberScriptQueryTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(UberScriptQueryTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(UberScriptQueryTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(UberScriptQueryTemplateParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(UberScriptQueryTemplateParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(UberScriptQueryTemplateParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(UberScriptQueryTemplateParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(UberScriptQueryTemplateParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(UberScriptQueryTemplateParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(UberScriptQueryTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(UberScriptQueryTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(UberScriptQueryTemplateParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(UberScriptQueryTemplateParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(UberScriptQueryTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(UberScriptQueryTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(UberScriptQueryTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(UberScriptQueryTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(UberScriptQueryTemplateParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(UberScriptQueryTemplateParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(UberScriptQueryTemplateParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(UberScriptQueryTemplateParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(UberScriptQueryTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(UberScriptQueryTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UberScriptQueryTemplateParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UberScriptQueryTemplateParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(UberScriptQueryTemplateParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(UberScriptQueryTemplateParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(UberScriptQueryTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(UberScriptQueryTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(UberScriptQueryTemplateParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(UberScriptQueryTemplateParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(UberScriptQueryTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(UberScriptQueryTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(UberScriptQueryTemplateParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(UberScriptQueryTemplateParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(UberScriptQueryTemplateParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(UberScriptQueryTemplateParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(UberScriptQueryTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(UberScriptQueryTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(UberScriptQueryTemplateParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(UberScriptQueryTemplateParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(UberScriptQueryTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(UberScriptQueryTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(UberScriptQueryTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(UberScriptQueryTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(UberScriptQueryTemplateParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(UberScriptQueryTemplateParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(UberScriptQueryTemplateParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(UberScriptQueryTemplateParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(UberScriptQueryTemplateParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(UberScriptQueryTemplateParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(UberScriptQueryTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(UberScriptQueryTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(UberScriptQueryTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(UberScriptQueryTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(UberScriptQueryTemplateParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(UberScriptQueryTemplateParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(UberScriptQueryTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(UberScriptQueryTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(UberScriptQueryTemplateParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(UberScriptQueryTemplateParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(UberScriptQueryTemplateParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(UberScriptQueryTemplateParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UberScriptQueryTemplateParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UberScriptQueryTemplateParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(UberScriptQueryTemplateParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(UberScriptQueryTemplateParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(UberScriptQueryTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(UberScriptQueryTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(UberScriptQueryTemplateParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(UberScriptQueryTemplateParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(UberScriptQueryTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(UberScriptQueryTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(UberScriptQueryTemplateParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(UberScriptQueryTemplateParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(UberScriptQueryTemplateParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(UberScriptQueryTemplateParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(UberScriptQueryTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(UberScriptQueryTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(UberScriptQueryTemplateParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(UberScriptQueryTemplateParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(UberScriptQueryTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(UberScriptQueryTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(UberScriptQueryTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(UberScriptQueryTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(UberScriptQueryTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(UberScriptQueryTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(UberScriptQueryTemplateParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(UberScriptQueryTemplateParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(UberScriptQueryTemplateParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(UberScriptQueryTemplateParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(UberScriptQueryTemplateParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(UberScriptQueryTemplateParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(UberScriptQueryTemplateParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(UberScriptQueryTemplateParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(UberScriptQueryTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(UberScriptQueryTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(UberScriptQueryTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(UberScriptQueryTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(UberScriptQueryTemplateParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(UberScriptQueryTemplateParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(UberScriptQueryTemplateParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(UberScriptQueryTemplateParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(UberScriptQueryTemplateParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(UberScriptQueryTemplateParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(UberScriptQueryTemplateParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(UberScriptQueryTemplateParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(UberScriptQueryTemplateParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(UberScriptQueryTemplateParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(UberScriptQueryTemplateParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(UberScriptQueryTemplateParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(UberScriptQueryTemplateParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(UberScriptQueryTemplateParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(UberScriptQueryTemplateParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(UberScriptQueryTemplateParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(UberScriptQueryTemplateParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(UberScriptQueryTemplateParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(UberScriptQueryTemplateParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(UberScriptQueryTemplateParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(UberScriptQueryTemplateParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(UberScriptQueryTemplateParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(UberScriptQueryTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(UberScriptQueryTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(UberScriptQueryTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(UberScriptQueryTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(UberScriptQueryTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(UberScriptQueryTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(UberScriptQueryTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(UberScriptQueryTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterScientificDecimalLiteral(UberScriptQueryTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitScientificDecimalLiteral(UberScriptQueryTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(UberScriptQueryTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(UberScriptQueryTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(UberScriptQueryTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(UberScriptQueryTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(UberScriptQueryTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(UberScriptQueryTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(UberScriptQueryTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(UberScriptQueryTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(UberScriptQueryTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(UberScriptQueryTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UberScriptQueryTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(UberScriptQueryTemplateParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UberScriptQueryTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(UberScriptQueryTemplateParser.NonReservedContext ctx);
}