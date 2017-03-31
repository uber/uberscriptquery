// Generated from UberScriptQueryTemplate.g4 by ANTLR 4.5.3

   package com.uber.uberscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UberScriptQueryTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UberScriptQueryTemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(UberScriptQueryTemplateParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentWithSemicolon(UberScriptQueryTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(UberScriptQueryTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment_variableName(UberScriptQueryTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(UberScriptQueryTemplateParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(UberScriptQueryTemplateParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(UberScriptQueryTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(UberScriptQueryTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(UberScriptQueryTemplateParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableUsing(UberScriptQueryTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(UberScriptQueryTemplateParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(UberScriptQueryTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(UberScriptQueryTemplateParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(UberScriptQueryTemplateParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(UberScriptQueryTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(UberScriptQueryTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(UberScriptQueryTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(UberScriptQueryTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(UberScriptQueryTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(UberScriptQueryTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(UberScriptQueryTemplateParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(UberScriptQueryTemplateParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(UberScriptQueryTemplateParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(UberScriptQueryTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(UberScriptQueryTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(UberScriptQueryTemplateParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(UberScriptQueryTemplateParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(UberScriptQueryTemplateParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(UberScriptQueryTemplateParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(UberScriptQueryTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(UberScriptQueryTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(UberScriptQueryTemplateParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(UberScriptQueryTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(UberScriptQueryTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(UberScriptQueryTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(UberScriptQueryTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(UberScriptQueryTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(UberScriptQueryTemplateParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(UberScriptQueryTemplateParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(UberScriptQueryTemplateParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(UberScriptQueryTemplateParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(UberScriptQueryTemplateParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(UberScriptQueryTemplateParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(UberScriptQueryTemplateParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(UberScriptQueryTemplateParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(UberScriptQueryTemplateParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(UberScriptQueryTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(UberScriptQueryTemplateParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(UberScriptQueryTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(UberScriptQueryTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(UberScriptQueryTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(UberScriptQueryTemplateParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(UberScriptQueryTemplateParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(UberScriptQueryTemplateParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(UberScriptQueryTemplateParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(UberScriptQueryTemplateParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(UberScriptQueryTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(UberScriptQueryTemplateParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(UberScriptQueryTemplateParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(UberScriptQueryTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(UberScriptQueryTemplateParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(UberScriptQueryTemplateParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(UberScriptQueryTemplateParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(UberScriptQueryTemplateParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(UberScriptQueryTemplateParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(UberScriptQueryTemplateParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(UberScriptQueryTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(UberScriptQueryTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(UberScriptQueryTemplateParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(UberScriptQueryTemplateParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(UberScriptQueryTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(UberScriptQueryTemplateParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(UberScriptQueryTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(UberScriptQueryTemplateParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(UberScriptQueryTemplateParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(UberScriptQueryTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(UberScriptQueryTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(UberScriptQueryTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(UberScriptQueryTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(UberScriptQueryTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(UberScriptQueryTemplateParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(UberScriptQueryTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(UberScriptQueryTemplateParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(UberScriptQueryTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(UberScriptQueryTemplateParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(UberScriptQueryTemplateParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(UberScriptQueryTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(UberScriptQueryTemplateParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(UberScriptQueryTemplateParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(UberScriptQueryTemplateParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(UberScriptQueryTemplateParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(UberScriptQueryTemplateParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(UberScriptQueryTemplateParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(UberScriptQueryTemplateParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(UberScriptQueryTemplateParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(UberScriptQueryTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(UberScriptQueryTemplateParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(UberScriptQueryTemplateParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(UberScriptQueryTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(UberScriptQueryTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(UberScriptQueryTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(UberScriptQueryTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(UberScriptQueryTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(UberScriptQueryTemplateParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(UberScriptQueryTemplateParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(UberScriptQueryTemplateParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(UberScriptQueryTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(UberScriptQueryTemplateParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(UberScriptQueryTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(UberScriptQueryTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(UberScriptQueryTemplateParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(UberScriptQueryTemplateParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(UberScriptQueryTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UberScriptQueryTemplateParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(UberScriptQueryTemplateParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(UberScriptQueryTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(UberScriptQueryTemplateParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(UberScriptQueryTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(UberScriptQueryTemplateParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(UberScriptQueryTemplateParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(UberScriptQueryTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(UberScriptQueryTemplateParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(UberScriptQueryTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(UberScriptQueryTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(UberScriptQueryTemplateParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(UberScriptQueryTemplateParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(UberScriptQueryTemplateParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(UberScriptQueryTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(UberScriptQueryTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(UberScriptQueryTemplateParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(UberScriptQueryTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(UberScriptQueryTemplateParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(UberScriptQueryTemplateParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(UberScriptQueryTemplateParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(UberScriptQueryTemplateParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(UberScriptQueryTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(UberScriptQueryTemplateParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(UberScriptQueryTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(UberScriptQueryTemplateParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(UberScriptQueryTemplateParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(UberScriptQueryTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(UberScriptQueryTemplateParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(UberScriptQueryTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(UberScriptQueryTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(UberScriptQueryTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(UberScriptQueryTemplateParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(UberScriptQueryTemplateParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(UberScriptQueryTemplateParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(UberScriptQueryTemplateParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(UberScriptQueryTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(UberScriptQueryTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(UberScriptQueryTemplateParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(UberScriptQueryTemplateParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(UberScriptQueryTemplateParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(UberScriptQueryTemplateParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(UberScriptQueryTemplateParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(UberScriptQueryTemplateParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(UberScriptQueryTemplateParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(UberScriptQueryTemplateParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(UberScriptQueryTemplateParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(UberScriptQueryTemplateParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(UberScriptQueryTemplateParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(UberScriptQueryTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(UberScriptQueryTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(UberScriptQueryTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(UberScriptQueryTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificDecimalLiteral(UberScriptQueryTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(UberScriptQueryTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(UberScriptQueryTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(UberScriptQueryTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(UberScriptQueryTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UberScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(UberScriptQueryTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UberScriptQueryTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(UberScriptQueryTemplateParser.NonReservedContext ctx);
}