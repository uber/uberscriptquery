// Generated from SparkScriptSql.g4 by ANTLR 4.5.3

   package com.uber.sparkscript.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkScriptSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkScriptSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SparkScriptSqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment(SparkScriptSqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment_query(SparkScriptSqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(SparkScriptSqlParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_tableAlias(SparkScriptSqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryType(SparkScriptSqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryEngine(SparkScriptSqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_query(SparkScriptSqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#configSetting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigSetting(SparkScriptSqlParser.ConfigSettingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment(SparkScriptSqlParser.FileAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_tableAlias(SparkScriptSqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileType(SparkScriptSqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileLocation(SparkScriptSqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#actionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement(SparkScriptSqlParser.ActionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement_param(SparkScriptSqlParser.ActionStatement_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(SparkScriptSqlParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#jsonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(SparkScriptSqlParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#jsonPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPair(SparkScriptSqlParser.JsonPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(SparkScriptSqlParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SparkScriptSqlParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(SparkScriptSqlParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(SparkScriptSqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(SparkScriptSqlParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SparkScriptSqlParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SparkScriptSqlParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(SparkScriptSqlParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(SparkScriptSqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(SparkScriptSqlParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableUsing(SparkScriptSqlParser.CreateTableUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SparkScriptSqlParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(SparkScriptSqlParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(SparkScriptSqlParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SparkScriptSqlParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(SparkScriptSqlParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(SparkScriptSqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(SparkScriptSqlParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(SparkScriptSqlParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(SparkScriptSqlParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(SparkScriptSqlParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(SparkScriptSqlParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SparkScriptSqlParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SparkScriptSqlParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(SparkScriptSqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(SparkScriptSqlParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SparkScriptSqlParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SparkScriptSqlParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SparkScriptSqlParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(SparkScriptSqlParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(SparkScriptSqlParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(SparkScriptSqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(SparkScriptSqlParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(SparkScriptSqlParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(SparkScriptSqlParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(SparkScriptSqlParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(SparkScriptSqlParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(SparkScriptSqlParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(SparkScriptSqlParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(SparkScriptSqlParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(SparkScriptSqlParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(SparkScriptSqlParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(SparkScriptSqlParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(SparkScriptSqlParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(SparkScriptSqlParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SparkScriptSqlParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(SparkScriptSqlParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(SparkScriptSqlParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(SparkScriptSqlParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkScriptSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(SparkScriptSqlParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(SparkScriptSqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(SparkScriptSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(SparkScriptSqlParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(SparkScriptSqlParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(SparkScriptSqlParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SparkScriptSqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(SparkScriptSqlParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(SparkScriptSqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(SparkScriptSqlParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(SparkScriptSqlParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(SparkScriptSqlParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(SparkScriptSqlParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(SparkScriptSqlParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(SparkScriptSqlParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(SparkScriptSqlParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(SparkScriptSqlParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(SparkScriptSqlParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(SparkScriptSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(SparkScriptSqlParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(SparkScriptSqlParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(SparkScriptSqlParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(SparkScriptSqlParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkScriptSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(SparkScriptSqlParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkScriptSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(SparkScriptSqlParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(SparkScriptSqlParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SparkScriptSqlParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkScriptSqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(SparkScriptSqlParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkScriptSqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(SparkScriptSqlParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(SparkScriptSqlParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(SparkScriptSqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkScriptSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(SparkScriptSqlParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkScriptSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(SparkScriptSqlParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(SparkScriptSqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SparkScriptSqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(SparkScriptSqlParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkScriptSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SparkScriptSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SparkScriptSqlParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SparkScriptSqlParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SparkScriptSqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(SparkScriptSqlParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(SparkScriptSqlParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(SparkScriptSqlParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SparkScriptSqlParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SparkScriptSqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(SparkScriptSqlParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SparkScriptSqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(SparkScriptSqlParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SparkScriptSqlParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(SparkScriptSqlParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(SparkScriptSqlParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SparkScriptSqlParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(SparkScriptSqlParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(SparkScriptSqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(SparkScriptSqlParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(SparkScriptSqlParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(SparkScriptSqlParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SparkScriptSqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(SparkScriptSqlParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(SparkScriptSqlParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkScriptSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(SparkScriptSqlParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(SparkScriptSqlParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkScriptSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(SparkScriptSqlParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkScriptSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(SparkScriptSqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(SparkScriptSqlParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(SparkScriptSqlParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(SparkScriptSqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparkScriptSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SparkScriptSqlParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(SparkScriptSqlParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SparkScriptSqlParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkScriptSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SparkScriptSqlParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SparkScriptSqlParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SparkScriptSqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SparkScriptSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SparkScriptSqlParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SparkScriptSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkScriptSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SparkScriptSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SparkScriptSqlParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SparkScriptSqlParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(SparkScriptSqlParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(SparkScriptSqlParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SparkScriptSqlParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(SparkScriptSqlParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SparkScriptSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(SparkScriptSqlParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(SparkScriptSqlParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SparkScriptSqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(SparkScriptSqlParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkScriptSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SparkScriptSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SparkScriptSqlParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(SparkScriptSqlParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkScriptSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SparkScriptSqlParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SparkScriptSqlParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SparkScriptSqlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SparkScriptSqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SparkScriptSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SparkScriptSqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(SparkScriptSqlParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SparkScriptSqlParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SparkScriptSqlParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(SparkScriptSqlParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(SparkScriptSqlParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkScriptSqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(SparkScriptSqlParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkScriptSqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(SparkScriptSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(SparkScriptSqlParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(SparkScriptSqlParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SparkScriptSqlParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(SparkScriptSqlParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(SparkScriptSqlParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkScriptSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(SparkScriptSqlParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkScriptSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(SparkScriptSqlParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(SparkScriptSqlParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(SparkScriptSqlParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SparkScriptSqlParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SparkScriptSqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkScriptSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SparkScriptSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkScriptSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(SparkScriptSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SparkScriptSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SparkScriptSqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificDecimalLiteral(SparkScriptSqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SparkScriptSqlParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(SparkScriptSqlParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(SparkScriptSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(SparkScriptSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkScriptSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SparkScriptSqlParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkScriptSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(SparkScriptSqlParser.NonReservedContext ctx);
}