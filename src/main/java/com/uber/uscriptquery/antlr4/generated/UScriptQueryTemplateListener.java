// Generated from UScriptQueryTemplate.g4 by ANTLR 4.5.3

   package com.uber.uscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UScriptQueryTemplateParser}.
 */
public interface UScriptQueryTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(UScriptQueryTemplateParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(UScriptQueryTemplateParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentWithSemicolon(UScriptQueryTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentWithSemicolon(UScriptQueryTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(UScriptQueryTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(UScriptQueryTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment_variableName(UScriptQueryTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment_variableName(UScriptQueryTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(UScriptQueryTemplateParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(UScriptQueryTemplateParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(UScriptQueryTemplateParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(UScriptQueryTemplateParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(UScriptQueryTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(UScriptQueryTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(UScriptQueryTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(UScriptQueryTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(UScriptQueryTemplateParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(UScriptQueryTemplateParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableUsing(UScriptQueryTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableUsing(UScriptQueryTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(UScriptQueryTemplateParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(UScriptQueryTemplateParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(UScriptQueryTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(UScriptQueryTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(UScriptQueryTemplateParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(UScriptQueryTemplateParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(UScriptQueryTemplateParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(UScriptQueryTemplateParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(UScriptQueryTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(UScriptQueryTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(UScriptQueryTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(UScriptQueryTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(UScriptQueryTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(UScriptQueryTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(UScriptQueryTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(UScriptQueryTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(UScriptQueryTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(UScriptQueryTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(UScriptQueryTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(UScriptQueryTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(UScriptQueryTemplateParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(UScriptQueryTemplateParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(UScriptQueryTemplateParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(UScriptQueryTemplateParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(UScriptQueryTemplateParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(UScriptQueryTemplateParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(UScriptQueryTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(UScriptQueryTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(UScriptQueryTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(UScriptQueryTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(UScriptQueryTemplateParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(UScriptQueryTemplateParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(UScriptQueryTemplateParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(UScriptQueryTemplateParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(UScriptQueryTemplateParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(UScriptQueryTemplateParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(UScriptQueryTemplateParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(UScriptQueryTemplateParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(UScriptQueryTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(UScriptQueryTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(UScriptQueryTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(UScriptQueryTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(UScriptQueryTemplateParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(UScriptQueryTemplateParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(UScriptQueryTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(UScriptQueryTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(UScriptQueryTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(UScriptQueryTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(UScriptQueryTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(UScriptQueryTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(UScriptQueryTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(UScriptQueryTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(UScriptQueryTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(UScriptQueryTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(UScriptQueryTemplateParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(UScriptQueryTemplateParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(UScriptQueryTemplateParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(UScriptQueryTemplateParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(UScriptQueryTemplateParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(UScriptQueryTemplateParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(UScriptQueryTemplateParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(UScriptQueryTemplateParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(UScriptQueryTemplateParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(UScriptQueryTemplateParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(UScriptQueryTemplateParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(UScriptQueryTemplateParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(UScriptQueryTemplateParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(UScriptQueryTemplateParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(UScriptQueryTemplateParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(UScriptQueryTemplateParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(UScriptQueryTemplateParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(UScriptQueryTemplateParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(UScriptQueryTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(UScriptQueryTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(UScriptQueryTemplateParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(UScriptQueryTemplateParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(UScriptQueryTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(UScriptQueryTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(UScriptQueryTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(UScriptQueryTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(UScriptQueryTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(UScriptQueryTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(UScriptQueryTemplateParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(UScriptQueryTemplateParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(UScriptQueryTemplateParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(UScriptQueryTemplateParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(UScriptQueryTemplateParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(UScriptQueryTemplateParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(UScriptQueryTemplateParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(UScriptQueryTemplateParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(UScriptQueryTemplateParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(UScriptQueryTemplateParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(UScriptQueryTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(UScriptQueryTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(UScriptQueryTemplateParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(UScriptQueryTemplateParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(UScriptQueryTemplateParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(UScriptQueryTemplateParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(UScriptQueryTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(UScriptQueryTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(UScriptQueryTemplateParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(UScriptQueryTemplateParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(UScriptQueryTemplateParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(UScriptQueryTemplateParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(UScriptQueryTemplateParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(UScriptQueryTemplateParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(UScriptQueryTemplateParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(UScriptQueryTemplateParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(UScriptQueryTemplateParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(UScriptQueryTemplateParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(UScriptQueryTemplateParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(UScriptQueryTemplateParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(UScriptQueryTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(UScriptQueryTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(UScriptQueryTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(UScriptQueryTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(UScriptQueryTemplateParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(UScriptQueryTemplateParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(UScriptQueryTemplateParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(UScriptQueryTemplateParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(UScriptQueryTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(UScriptQueryTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(UScriptQueryTemplateParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(UScriptQueryTemplateParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(UScriptQueryTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(UScriptQueryTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(UScriptQueryTemplateParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(UScriptQueryTemplateParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(UScriptQueryTemplateParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(UScriptQueryTemplateParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(UScriptQueryTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(UScriptQueryTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(UScriptQueryTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(UScriptQueryTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(UScriptQueryTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(UScriptQueryTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(UScriptQueryTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(UScriptQueryTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(UScriptQueryTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(UScriptQueryTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(UScriptQueryTemplateParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(UScriptQueryTemplateParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(UScriptQueryTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(UScriptQueryTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(UScriptQueryTemplateParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(UScriptQueryTemplateParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(UScriptQueryTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(UScriptQueryTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(UScriptQueryTemplateParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(UScriptQueryTemplateParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(UScriptQueryTemplateParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(UScriptQueryTemplateParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(UScriptQueryTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(UScriptQueryTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(UScriptQueryTemplateParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(UScriptQueryTemplateParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(UScriptQueryTemplateParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(UScriptQueryTemplateParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(UScriptQueryTemplateParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(UScriptQueryTemplateParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(UScriptQueryTemplateParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(UScriptQueryTemplateParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(UScriptQueryTemplateParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(UScriptQueryTemplateParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(UScriptQueryTemplateParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(UScriptQueryTemplateParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(UScriptQueryTemplateParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(UScriptQueryTemplateParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(UScriptQueryTemplateParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(UScriptQueryTemplateParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(UScriptQueryTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(UScriptQueryTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(UScriptQueryTemplateParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(UScriptQueryTemplateParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(UScriptQueryTemplateParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(UScriptQueryTemplateParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(UScriptQueryTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(UScriptQueryTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(UScriptQueryTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(UScriptQueryTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(UScriptQueryTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(UScriptQueryTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(UScriptQueryTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(UScriptQueryTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(UScriptQueryTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(UScriptQueryTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(UScriptQueryTemplateParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(UScriptQueryTemplateParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(UScriptQueryTemplateParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(UScriptQueryTemplateParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(UScriptQueryTemplateParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(UScriptQueryTemplateParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(UScriptQueryTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(UScriptQueryTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(UScriptQueryTemplateParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(UScriptQueryTemplateParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(UScriptQueryTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(UScriptQueryTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(UScriptQueryTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(UScriptQueryTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(UScriptQueryTemplateParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(UScriptQueryTemplateParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(UScriptQueryTemplateParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(UScriptQueryTemplateParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(UScriptQueryTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(UScriptQueryTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UScriptQueryTemplateParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UScriptQueryTemplateParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(UScriptQueryTemplateParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(UScriptQueryTemplateParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(UScriptQueryTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(UScriptQueryTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(UScriptQueryTemplateParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(UScriptQueryTemplateParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(UScriptQueryTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(UScriptQueryTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(UScriptQueryTemplateParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(UScriptQueryTemplateParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(UScriptQueryTemplateParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(UScriptQueryTemplateParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(UScriptQueryTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(UScriptQueryTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(UScriptQueryTemplateParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(UScriptQueryTemplateParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(UScriptQueryTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(UScriptQueryTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(UScriptQueryTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(UScriptQueryTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(UScriptQueryTemplateParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(UScriptQueryTemplateParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(UScriptQueryTemplateParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(UScriptQueryTemplateParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(UScriptQueryTemplateParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(UScriptQueryTemplateParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(UScriptQueryTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(UScriptQueryTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(UScriptQueryTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(UScriptQueryTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(UScriptQueryTemplateParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(UScriptQueryTemplateParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(UScriptQueryTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(UScriptQueryTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(UScriptQueryTemplateParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(UScriptQueryTemplateParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(UScriptQueryTemplateParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(UScriptQueryTemplateParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UScriptQueryTemplateParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UScriptQueryTemplateParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(UScriptQueryTemplateParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(UScriptQueryTemplateParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(UScriptQueryTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(UScriptQueryTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(UScriptQueryTemplateParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(UScriptQueryTemplateParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(UScriptQueryTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(UScriptQueryTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(UScriptQueryTemplateParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(UScriptQueryTemplateParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(UScriptQueryTemplateParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(UScriptQueryTemplateParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(UScriptQueryTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(UScriptQueryTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(UScriptQueryTemplateParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(UScriptQueryTemplateParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(UScriptQueryTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(UScriptQueryTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(UScriptQueryTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(UScriptQueryTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(UScriptQueryTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(UScriptQueryTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(UScriptQueryTemplateParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(UScriptQueryTemplateParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(UScriptQueryTemplateParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(UScriptQueryTemplateParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(UScriptQueryTemplateParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(UScriptQueryTemplateParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(UScriptQueryTemplateParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(UScriptQueryTemplateParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(UScriptQueryTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(UScriptQueryTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(UScriptQueryTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(UScriptQueryTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(UScriptQueryTemplateParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(UScriptQueryTemplateParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(UScriptQueryTemplateParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(UScriptQueryTemplateParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(UScriptQueryTemplateParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(UScriptQueryTemplateParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(UScriptQueryTemplateParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(UScriptQueryTemplateParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(UScriptQueryTemplateParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(UScriptQueryTemplateParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(UScriptQueryTemplateParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(UScriptQueryTemplateParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(UScriptQueryTemplateParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(UScriptQueryTemplateParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(UScriptQueryTemplateParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(UScriptQueryTemplateParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(UScriptQueryTemplateParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(UScriptQueryTemplateParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(UScriptQueryTemplateParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(UScriptQueryTemplateParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(UScriptQueryTemplateParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(UScriptQueryTemplateParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(UScriptQueryTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(UScriptQueryTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(UScriptQueryTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(UScriptQueryTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(UScriptQueryTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(UScriptQueryTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(UScriptQueryTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(UScriptQueryTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterScientificDecimalLiteral(UScriptQueryTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitScientificDecimalLiteral(UScriptQueryTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(UScriptQueryTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(UScriptQueryTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(UScriptQueryTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(UScriptQueryTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(UScriptQueryTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(UScriptQueryTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(UScriptQueryTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(UScriptQueryTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(UScriptQueryTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(UScriptQueryTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UScriptQueryTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(UScriptQueryTemplateParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link UScriptQueryTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(UScriptQueryTemplateParser.NonReservedContext ctx);
}