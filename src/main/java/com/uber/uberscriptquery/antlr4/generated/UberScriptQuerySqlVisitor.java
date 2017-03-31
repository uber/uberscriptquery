// Generated from UberScriptQuerySql.g4 by ANTLR 4.5.3

   package com.uber.uberscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UberScriptQuerySqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UberScriptQuerySqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(UberScriptQuerySqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment(UberScriptQuerySqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment_query(UberScriptQuerySqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(UberScriptQuerySqlParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_tableAlias(UberScriptQuerySqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryType(UberScriptQuerySqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryEngine(UberScriptQuerySqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_query(UberScriptQuerySqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#configSetting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigSetting(UberScriptQuerySqlParser.ConfigSettingContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment(UberScriptQuerySqlParser.FileAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_tableAlias(UberScriptQuerySqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileType(UberScriptQuerySqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileLocation(UberScriptQuerySqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#actionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement(UberScriptQuerySqlParser.ActionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement_param(UberScriptQuerySqlParser.ActionStatement_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(UberScriptQuerySqlParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#jsonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(UberScriptQuerySqlParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#jsonPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPair(UberScriptQuerySqlParser.JsonPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(UberScriptQuerySqlParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(UberScriptQuerySqlParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(UberScriptQuerySqlParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(UberScriptQuerySqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(UberScriptQuerySqlParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(UberScriptQuerySqlParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(UberScriptQuerySqlParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(UberScriptQuerySqlParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(UberScriptQuerySqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(UberScriptQuerySqlParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableUsing(UberScriptQuerySqlParser.CreateTableUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(UberScriptQuerySqlParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(UberScriptQuerySqlParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(UberScriptQuerySqlParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(UberScriptQuerySqlParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(UberScriptQuerySqlParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(UberScriptQuerySqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(UberScriptQuerySqlParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(UberScriptQuerySqlParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(UberScriptQuerySqlParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(UberScriptQuerySqlParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(UberScriptQuerySqlParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(UberScriptQuerySqlParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(UberScriptQuerySqlParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(UberScriptQuerySqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(UberScriptQuerySqlParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(UberScriptQuerySqlParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(UberScriptQuerySqlParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(UberScriptQuerySqlParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(UberScriptQuerySqlParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(UberScriptQuerySqlParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(UberScriptQuerySqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(UberScriptQuerySqlParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(UberScriptQuerySqlParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(UberScriptQuerySqlParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(UberScriptQuerySqlParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(UberScriptQuerySqlParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(UberScriptQuerySqlParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(UberScriptQuerySqlParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(UberScriptQuerySqlParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(UberScriptQuerySqlParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(UberScriptQuerySqlParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(UberScriptQuerySqlParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(UberScriptQuerySqlParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(UberScriptQuerySqlParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(UberScriptQuerySqlParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(UberScriptQuerySqlParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(UberScriptQuerySqlParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(UberScriptQuerySqlParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UberScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(UberScriptQuerySqlParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(UberScriptQuerySqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(UberScriptQuerySqlParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(UberScriptQuerySqlParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(UberScriptQuerySqlParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(UberScriptQuerySqlParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(UberScriptQuerySqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(UberScriptQuerySqlParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(UberScriptQuerySqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(UberScriptQuerySqlParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(UberScriptQuerySqlParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(UberScriptQuerySqlParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(UberScriptQuerySqlParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(UberScriptQuerySqlParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(UberScriptQuerySqlParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(UberScriptQuerySqlParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(UberScriptQuerySqlParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(UberScriptQuerySqlParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(UberScriptQuerySqlParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(UberScriptQuerySqlParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(UberScriptQuerySqlParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(UberScriptQuerySqlParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(UberScriptQuerySqlParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UberScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(UberScriptQuerySqlParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UberScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(UberScriptQuerySqlParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(UberScriptQuerySqlParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(UberScriptQuerySqlParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(UberScriptQuerySqlParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(UberScriptQuerySqlParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(UberScriptQuerySqlParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(UberScriptQuerySqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(UberScriptQuerySqlParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(UberScriptQuerySqlParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(UberScriptQuerySqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(UberScriptQuerySqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(UberScriptQuerySqlParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(UberScriptQuerySqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(UberScriptQuerySqlParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(UberScriptQuerySqlParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(UberScriptQuerySqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(UberScriptQuerySqlParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(UberScriptQuerySqlParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(UberScriptQuerySqlParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(UberScriptQuerySqlParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(UberScriptQuerySqlParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(UberScriptQuerySqlParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(UberScriptQuerySqlParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(UberScriptQuerySqlParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(UberScriptQuerySqlParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(UberScriptQuerySqlParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(UberScriptQuerySqlParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(UberScriptQuerySqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(UberScriptQuerySqlParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(UberScriptQuerySqlParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(UberScriptQuerySqlParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(UberScriptQuerySqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(UberScriptQuerySqlParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(UberScriptQuerySqlParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UberScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(UberScriptQuerySqlParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(UberScriptQuerySqlParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UberScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(UberScriptQuerySqlParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UberScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(UberScriptQuerySqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(UberScriptQuerySqlParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(UberScriptQuerySqlParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(UberScriptQuerySqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UberScriptQuerySqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(UberScriptQuerySqlParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(UberScriptQuerySqlParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(UberScriptQuerySqlParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(UberScriptQuerySqlParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(UberScriptQuerySqlParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(UberScriptQuerySqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(UberScriptQuerySqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(UberScriptQuerySqlParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(UberScriptQuerySqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UberScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(UberScriptQuerySqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(UberScriptQuerySqlParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(UberScriptQuerySqlParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(UberScriptQuerySqlParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(UberScriptQuerySqlParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(UberScriptQuerySqlParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(UberScriptQuerySqlParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(UberScriptQuerySqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(UberScriptQuerySqlParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(UberScriptQuerySqlParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(UberScriptQuerySqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(UberScriptQuerySqlParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UberScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(UberScriptQuerySqlParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(UberScriptQuerySqlParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(UberScriptQuerySqlParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(UberScriptQuerySqlParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(UberScriptQuerySqlParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(UberScriptQuerySqlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(UberScriptQuerySqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(UberScriptQuerySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(UberScriptQuerySqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(UberScriptQuerySqlParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(UberScriptQuerySqlParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(UberScriptQuerySqlParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(UberScriptQuerySqlParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(UberScriptQuerySqlParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UberScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(UberScriptQuerySqlParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UberScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(UberScriptQuerySqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(UberScriptQuerySqlParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(UberScriptQuerySqlParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(UberScriptQuerySqlParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(UberScriptQuerySqlParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(UberScriptQuerySqlParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UberScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(UberScriptQuerySqlParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UberScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(UberScriptQuerySqlParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(UberScriptQuerySqlParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(UberScriptQuerySqlParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(UberScriptQuerySqlParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(UberScriptQuerySqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UberScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(UberScriptQuerySqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UberScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(UberScriptQuerySqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(UberScriptQuerySqlParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(UberScriptQuerySqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificDecimalLiteral(UberScriptQuerySqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(UberScriptQuerySqlParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(UberScriptQuerySqlParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(UberScriptQuerySqlParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(UberScriptQuerySqlParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UberScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(UberScriptQuerySqlParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQuerySqlParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(UberScriptQuerySqlParser.NonReservedContext ctx);
}