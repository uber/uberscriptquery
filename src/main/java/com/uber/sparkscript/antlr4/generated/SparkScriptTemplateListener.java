// Generated from SparkScriptTemplate.g4 by ANTLR 4.5.3

   package com.uber.sparkscript.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkScriptTemplateParser}.
 */
public interface SparkScriptTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SparkScriptTemplateParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SparkScriptTemplateParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentWithSemicolon(SparkScriptTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentWithSemicolon(SparkScriptTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(SparkScriptTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(SparkScriptTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment_variableName(SparkScriptTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment_variableName(SparkScriptTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(SparkScriptTemplateParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(SparkScriptTemplateParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(SparkScriptTemplateParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(SparkScriptTemplateParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SparkScriptTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SparkScriptTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(SparkScriptTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(SparkScriptTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SparkScriptTemplateParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SparkScriptTemplateParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableUsing(SparkScriptTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableUsing(SparkScriptTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SparkScriptTemplateParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SparkScriptTemplateParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(SparkScriptTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(SparkScriptTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(SparkScriptTemplateParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(SparkScriptTemplateParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SparkScriptTemplateParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SparkScriptTemplateParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(SparkScriptTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(SparkScriptTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(SparkScriptTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(SparkScriptTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(SparkScriptTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(SparkScriptTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(SparkScriptTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(SparkScriptTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(SparkScriptTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(SparkScriptTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(SparkScriptTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(SparkScriptTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(SparkScriptTemplateParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(SparkScriptTemplateParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SparkScriptTemplateParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SparkScriptTemplateParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SparkScriptTemplateParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SparkScriptTemplateParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(SparkScriptTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(SparkScriptTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(SparkScriptTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(SparkScriptTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SparkScriptTemplateParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SparkScriptTemplateParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SparkScriptTemplateParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SparkScriptTemplateParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SparkScriptTemplateParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SparkScriptTemplateParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(SparkScriptTemplateParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(SparkScriptTemplateParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(SparkScriptTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(SparkScriptTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(SparkScriptTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(SparkScriptTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SparkScriptTemplateParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SparkScriptTemplateParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(SparkScriptTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(SparkScriptTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(SparkScriptTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(SparkScriptTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(SparkScriptTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(SparkScriptTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(SparkScriptTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(SparkScriptTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(SparkScriptTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(SparkScriptTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(SparkScriptTemplateParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(SparkScriptTemplateParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(SparkScriptTemplateParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(SparkScriptTemplateParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(SparkScriptTemplateParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(SparkScriptTemplateParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(SparkScriptTemplateParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(SparkScriptTemplateParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(SparkScriptTemplateParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(SparkScriptTemplateParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(SparkScriptTemplateParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(SparkScriptTemplateParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(SparkScriptTemplateParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(SparkScriptTemplateParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SparkScriptTemplateParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SparkScriptTemplateParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(SparkScriptTemplateParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(SparkScriptTemplateParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(SparkScriptTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(SparkScriptTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(SparkScriptTemplateParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(SparkScriptTemplateParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(SparkScriptTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkScriptTemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(SparkScriptTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(SparkScriptTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(SparkScriptTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(SparkScriptTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(SparkScriptTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(SparkScriptTemplateParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(SparkScriptTemplateParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(SparkScriptTemplateParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(SparkScriptTemplateParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(SparkScriptTemplateParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(SparkScriptTemplateParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SparkScriptTemplateParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SparkScriptTemplateParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(SparkScriptTemplateParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(SparkScriptTemplateParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(SparkScriptTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(SparkScriptTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(SparkScriptTemplateParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(SparkScriptTemplateParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(SparkScriptTemplateParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(SparkScriptTemplateParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(SparkScriptTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(SparkScriptTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(SparkScriptTemplateParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(SparkScriptTemplateParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(SparkScriptTemplateParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(SparkScriptTemplateParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(SparkScriptTemplateParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(SparkScriptTemplateParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(SparkScriptTemplateParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(SparkScriptTemplateParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(SparkScriptTemplateParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(SparkScriptTemplateParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(SparkScriptTemplateParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(SparkScriptTemplateParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(SparkScriptTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(SparkScriptTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(SparkScriptTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(SparkScriptTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(SparkScriptTemplateParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(SparkScriptTemplateParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(SparkScriptTemplateParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(SparkScriptTemplateParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(SparkScriptTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(SparkScriptTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkScriptTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(SparkScriptTemplateParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkScriptTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(SparkScriptTemplateParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkScriptTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(SparkScriptTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkScriptTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(SparkScriptTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(SparkScriptTemplateParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(SparkScriptTemplateParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SparkScriptTemplateParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SparkScriptTemplateParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(SparkScriptTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(SparkScriptTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(SparkScriptTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(SparkScriptTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(SparkScriptTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(SparkScriptTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(SparkScriptTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(SparkScriptTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(SparkScriptTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(SparkScriptTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(SparkScriptTemplateParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(SparkScriptTemplateParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(SparkScriptTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(SparkScriptTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(SparkScriptTemplateParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(SparkScriptTemplateParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(SparkScriptTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(SparkScriptTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SparkScriptTemplateParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SparkScriptTemplateParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(SparkScriptTemplateParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(SparkScriptTemplateParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(SparkScriptTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(SparkScriptTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SparkScriptTemplateParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SparkScriptTemplateParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(SparkScriptTemplateParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(SparkScriptTemplateParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(SparkScriptTemplateParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(SparkScriptTemplateParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(SparkScriptTemplateParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(SparkScriptTemplateParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(SparkScriptTemplateParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(SparkScriptTemplateParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(SparkScriptTemplateParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(SparkScriptTemplateParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SparkScriptTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(SparkScriptTemplateParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SparkScriptTemplateParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(SparkScriptTemplateParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SparkScriptTemplateParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SparkScriptTemplateParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(SparkScriptTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(SparkScriptTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(SparkScriptTemplateParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(SparkScriptTemplateParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SparkScriptTemplateParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SparkScriptTemplateParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(SparkScriptTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(SparkScriptTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(SparkScriptTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(SparkScriptTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(SparkScriptTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(SparkScriptTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(SparkScriptTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(SparkScriptTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(SparkScriptTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(SparkScriptTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SparkScriptTemplateParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SparkScriptTemplateParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(SparkScriptTemplateParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(SparkScriptTemplateParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(SparkScriptTemplateParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(SparkScriptTemplateParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(SparkScriptTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(SparkScriptTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(SparkScriptTemplateParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(SparkScriptTemplateParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkScriptTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(SparkScriptTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkScriptTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(SparkScriptTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkScriptTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(SparkScriptTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkScriptTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(SparkScriptTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(SparkScriptTemplateParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(SparkScriptTemplateParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(SparkScriptTemplateParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(SparkScriptTemplateParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(SparkScriptTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(SparkScriptTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SparkScriptTemplateParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SparkScriptTemplateParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SparkScriptTemplateParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SparkScriptTemplateParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(SparkScriptTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(SparkScriptTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(SparkScriptTemplateParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(SparkScriptTemplateParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SparkScriptTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SparkScriptTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SparkScriptTemplateParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SparkScriptTemplateParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SparkScriptTemplateParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SparkScriptTemplateParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SparkScriptTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SparkScriptTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SparkScriptTemplateParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SparkScriptTemplateParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SparkScriptTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SparkScriptTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SparkScriptTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SparkScriptTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SparkScriptTemplateParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SparkScriptTemplateParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SparkScriptTemplateParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SparkScriptTemplateParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(SparkScriptTemplateParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(SparkScriptTemplateParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(SparkScriptTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(SparkScriptTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SparkScriptTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SparkScriptTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(SparkScriptTemplateParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(SparkScriptTemplateParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SparkScriptTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SparkScriptTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(SparkScriptTemplateParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(SparkScriptTemplateParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SparkScriptTemplateParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SparkScriptTemplateParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SparkScriptTemplateParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SparkScriptTemplateParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(SparkScriptTemplateParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(SparkScriptTemplateParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(SparkScriptTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(SparkScriptTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SparkScriptTemplateParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SparkScriptTemplateParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(SparkScriptTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(SparkScriptTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SparkScriptTemplateParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SparkScriptTemplateParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SparkScriptTemplateParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SparkScriptTemplateParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SparkScriptTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SparkScriptTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SparkScriptTemplateParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SparkScriptTemplateParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SparkScriptTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SparkScriptTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(SparkScriptTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(SparkScriptTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(SparkScriptTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(SparkScriptTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SparkScriptTemplateParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SparkScriptTemplateParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(SparkScriptTemplateParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(SparkScriptTemplateParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(SparkScriptTemplateParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(SparkScriptTemplateParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(SparkScriptTemplateParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(SparkScriptTemplateParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkScriptTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(SparkScriptTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkScriptTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(SparkScriptTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkScriptTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(SparkScriptTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkScriptTemplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(SparkScriptTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(SparkScriptTemplateParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(SparkScriptTemplateParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(SparkScriptTemplateParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(SparkScriptTemplateParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SparkScriptTemplateParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SparkScriptTemplateParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(SparkScriptTemplateParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(SparkScriptTemplateParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(SparkScriptTemplateParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(SparkScriptTemplateParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkScriptTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(SparkScriptTemplateParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkScriptTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(SparkScriptTemplateParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkScriptTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(SparkScriptTemplateParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkScriptTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(SparkScriptTemplateParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(SparkScriptTemplateParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(SparkScriptTemplateParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(SparkScriptTemplateParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(SparkScriptTemplateParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SparkScriptTemplateParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SparkScriptTemplateParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SparkScriptTemplateParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SparkScriptTemplateParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkScriptTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SparkScriptTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkScriptTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SparkScriptTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkScriptTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SparkScriptTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkScriptTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SparkScriptTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SparkScriptTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SparkScriptTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SparkScriptTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SparkScriptTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterScientificDecimalLiteral(SparkScriptTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitScientificDecimalLiteral(SparkScriptTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SparkScriptTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SparkScriptTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(SparkScriptTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(SparkScriptTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(SparkScriptTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(SparkScriptTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(SparkScriptTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(SparkScriptTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SparkScriptTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkScriptTemplateParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SparkScriptTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkScriptTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SparkScriptTemplateParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkScriptTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SparkScriptTemplateParser.NonReservedContext ctx);
}