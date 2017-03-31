// Generated from UScriptQuerySql.g4 by ANTLR 4.5.3

   package com.uber.uscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UScriptQuerySqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UScriptQuerySqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(UScriptQuerySqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment(UScriptQuerySqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment_query(UScriptQuerySqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(UScriptQuerySqlParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_tableAlias(UScriptQuerySqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryType(UScriptQuerySqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryEngine(UScriptQuerySqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_query(UScriptQuerySqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#configSetting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigSetting(UScriptQuerySqlParser.ConfigSettingContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment(UScriptQuerySqlParser.FileAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_tableAlias(UScriptQuerySqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileType(UScriptQuerySqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileLocation(UScriptQuerySqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#actionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement(UScriptQuerySqlParser.ActionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement_param(UScriptQuerySqlParser.ActionStatement_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(UScriptQuerySqlParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#jsonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(UScriptQuerySqlParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#jsonPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPair(UScriptQuerySqlParser.JsonPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(UScriptQuerySqlParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(UScriptQuerySqlParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(UScriptQuerySqlParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(UScriptQuerySqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(UScriptQuerySqlParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(UScriptQuerySqlParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(UScriptQuerySqlParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(UScriptQuerySqlParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(UScriptQuerySqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(UScriptQuerySqlParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableUsing(UScriptQuerySqlParser.CreateTableUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(UScriptQuerySqlParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(UScriptQuerySqlParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(UScriptQuerySqlParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(UScriptQuerySqlParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(UScriptQuerySqlParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(UScriptQuerySqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(UScriptQuerySqlParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(UScriptQuerySqlParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(UScriptQuerySqlParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(UScriptQuerySqlParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(UScriptQuerySqlParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(UScriptQuerySqlParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(UScriptQuerySqlParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(UScriptQuerySqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(UScriptQuerySqlParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(UScriptQuerySqlParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(UScriptQuerySqlParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(UScriptQuerySqlParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(UScriptQuerySqlParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(UScriptQuerySqlParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(UScriptQuerySqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(UScriptQuerySqlParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(UScriptQuerySqlParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(UScriptQuerySqlParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(UScriptQuerySqlParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(UScriptQuerySqlParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(UScriptQuerySqlParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(UScriptQuerySqlParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(UScriptQuerySqlParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(UScriptQuerySqlParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(UScriptQuerySqlParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(UScriptQuerySqlParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(UScriptQuerySqlParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(UScriptQuerySqlParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(UScriptQuerySqlParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(UScriptQuerySqlParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(UScriptQuerySqlParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(UScriptQuerySqlParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(UScriptQuerySqlParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(UScriptQuerySqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(UScriptQuerySqlParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(UScriptQuerySqlParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(UScriptQuerySqlParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(UScriptQuerySqlParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(UScriptQuerySqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(UScriptQuerySqlParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(UScriptQuerySqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(UScriptQuerySqlParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(UScriptQuerySqlParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(UScriptQuerySqlParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(UScriptQuerySqlParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(UScriptQuerySqlParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(UScriptQuerySqlParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(UScriptQuerySqlParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(UScriptQuerySqlParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(UScriptQuerySqlParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(UScriptQuerySqlParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(UScriptQuerySqlParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(UScriptQuerySqlParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(UScriptQuerySqlParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(UScriptQuerySqlParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(UScriptQuerySqlParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(UScriptQuerySqlParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(UScriptQuerySqlParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(UScriptQuerySqlParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(UScriptQuerySqlParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(UScriptQuerySqlParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(UScriptQuerySqlParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(UScriptQuerySqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(UScriptQuerySqlParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(UScriptQuerySqlParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(UScriptQuerySqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(UScriptQuerySqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(UScriptQuerySqlParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(UScriptQuerySqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(UScriptQuerySqlParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(UScriptQuerySqlParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(UScriptQuerySqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(UScriptQuerySqlParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(UScriptQuerySqlParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(UScriptQuerySqlParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(UScriptQuerySqlParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(UScriptQuerySqlParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(UScriptQuerySqlParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(UScriptQuerySqlParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(UScriptQuerySqlParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(UScriptQuerySqlParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(UScriptQuerySqlParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(UScriptQuerySqlParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(UScriptQuerySqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(UScriptQuerySqlParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(UScriptQuerySqlParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(UScriptQuerySqlParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(UScriptQuerySqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(UScriptQuerySqlParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(UScriptQuerySqlParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(UScriptQuerySqlParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(UScriptQuerySqlParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(UScriptQuerySqlParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(UScriptQuerySqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(UScriptQuerySqlParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(UScriptQuerySqlParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(UScriptQuerySqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UScriptQuerySqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(UScriptQuerySqlParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(UScriptQuerySqlParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(UScriptQuerySqlParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(UScriptQuerySqlParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(UScriptQuerySqlParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(UScriptQuerySqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(UScriptQuerySqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(UScriptQuerySqlParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(UScriptQuerySqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(UScriptQuerySqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(UScriptQuerySqlParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(UScriptQuerySqlParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(UScriptQuerySqlParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(UScriptQuerySqlParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(UScriptQuerySqlParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(UScriptQuerySqlParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(UScriptQuerySqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(UScriptQuerySqlParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(UScriptQuerySqlParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(UScriptQuerySqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(UScriptQuerySqlParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(UScriptQuerySqlParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(UScriptQuerySqlParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(UScriptQuerySqlParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(UScriptQuerySqlParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(UScriptQuerySqlParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(UScriptQuerySqlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(UScriptQuerySqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(UScriptQuerySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(UScriptQuerySqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(UScriptQuerySqlParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(UScriptQuerySqlParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(UScriptQuerySqlParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(UScriptQuerySqlParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(UScriptQuerySqlParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(UScriptQuerySqlParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(UScriptQuerySqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(UScriptQuerySqlParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(UScriptQuerySqlParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(UScriptQuerySqlParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(UScriptQuerySqlParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(UScriptQuerySqlParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(UScriptQuerySqlParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(UScriptQuerySqlParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(UScriptQuerySqlParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(UScriptQuerySqlParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(UScriptQuerySqlParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(UScriptQuerySqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(UScriptQuerySqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(UScriptQuerySqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(UScriptQuerySqlParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(UScriptQuerySqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificDecimalLiteral(UScriptQuerySqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(UScriptQuerySqlParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(UScriptQuerySqlParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(UScriptQuerySqlParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(UScriptQuerySqlParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(UScriptQuerySqlParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQuerySqlParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(UScriptQuerySqlParser.NonReservedContext ctx);
}