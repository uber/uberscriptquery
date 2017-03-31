// Generated from UScriptQueryTemplate.g4 by ANTLR 4.5.3

   package com.uber.uscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UScriptQueryTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UScriptQueryTemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(UScriptQueryTemplateParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#assignmentWithSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentWithSemicolon(UScriptQueryTemplateParser.AssignmentWithSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(UScriptQueryTemplateParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#variableAssignment_variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment_variableName(UScriptQueryTemplateParser.VariableAssignment_variableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(UScriptQueryTemplateParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(UScriptQueryTemplateParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(UScriptQueryTemplateParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(UScriptQueryTemplateParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(UScriptQueryTemplateParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableUsing(UScriptQueryTemplateParser.CreateTableUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(UScriptQueryTemplateParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(UScriptQueryTemplateParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(UScriptQueryTemplateParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(UScriptQueryTemplateParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(UScriptQueryTemplateParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(UScriptQueryTemplateParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(UScriptQueryTemplateParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(UScriptQueryTemplateParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(UScriptQueryTemplateParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(UScriptQueryTemplateParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(UScriptQueryTemplateParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(UScriptQueryTemplateParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(UScriptQueryTemplateParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(UScriptQueryTemplateParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(UScriptQueryTemplateParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(UScriptQueryTemplateParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(UScriptQueryTemplateParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(UScriptQueryTemplateParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(UScriptQueryTemplateParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(UScriptQueryTemplateParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(UScriptQueryTemplateParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(UScriptQueryTemplateParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(UScriptQueryTemplateParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(UScriptQueryTemplateParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(UScriptQueryTemplateParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(UScriptQueryTemplateParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(UScriptQueryTemplateParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(UScriptQueryTemplateParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(UScriptQueryTemplateParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(UScriptQueryTemplateParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(UScriptQueryTemplateParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(UScriptQueryTemplateParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(UScriptQueryTemplateParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(UScriptQueryTemplateParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(UScriptQueryTemplateParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(UScriptQueryTemplateParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(UScriptQueryTemplateParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(UScriptQueryTemplateParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link UScriptQueryTemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(UScriptQueryTemplateParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(UScriptQueryTemplateParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(UScriptQueryTemplateParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(UScriptQueryTemplateParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(UScriptQueryTemplateParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(UScriptQueryTemplateParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(UScriptQueryTemplateParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(UScriptQueryTemplateParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(UScriptQueryTemplateParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(UScriptQueryTemplateParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(UScriptQueryTemplateParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(UScriptQueryTemplateParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(UScriptQueryTemplateParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(UScriptQueryTemplateParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(UScriptQueryTemplateParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(UScriptQueryTemplateParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(UScriptQueryTemplateParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(UScriptQueryTemplateParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(UScriptQueryTemplateParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(UScriptQueryTemplateParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(UScriptQueryTemplateParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(UScriptQueryTemplateParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(UScriptQueryTemplateParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link UScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(UScriptQueryTemplateParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link UScriptQueryTemplateParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(UScriptQueryTemplateParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(UScriptQueryTemplateParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(UScriptQueryTemplateParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(UScriptQueryTemplateParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(UScriptQueryTemplateParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(UScriptQueryTemplateParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(UScriptQueryTemplateParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(UScriptQueryTemplateParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(UScriptQueryTemplateParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(UScriptQueryTemplateParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(UScriptQueryTemplateParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(UScriptQueryTemplateParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(UScriptQueryTemplateParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(UScriptQueryTemplateParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(UScriptQueryTemplateParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(UScriptQueryTemplateParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(UScriptQueryTemplateParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(UScriptQueryTemplateParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(UScriptQueryTemplateParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(UScriptQueryTemplateParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(UScriptQueryTemplateParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(UScriptQueryTemplateParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(UScriptQueryTemplateParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(UScriptQueryTemplateParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(UScriptQueryTemplateParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(UScriptQueryTemplateParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(UScriptQueryTemplateParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(UScriptQueryTemplateParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(UScriptQueryTemplateParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(UScriptQueryTemplateParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(UScriptQueryTemplateParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(UScriptQueryTemplateParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(UScriptQueryTemplateParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(UScriptQueryTemplateParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link UScriptQueryTemplateParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(UScriptQueryTemplateParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(UScriptQueryTemplateParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link UScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(UScriptQueryTemplateParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link UScriptQueryTemplateParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(UScriptQueryTemplateParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(UScriptQueryTemplateParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(UScriptQueryTemplateParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(UScriptQueryTemplateParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UScriptQueryTemplateParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(UScriptQueryTemplateParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(UScriptQueryTemplateParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(UScriptQueryTemplateParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(UScriptQueryTemplateParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(UScriptQueryTemplateParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(UScriptQueryTemplateParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(UScriptQueryTemplateParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(UScriptQueryTemplateParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(UScriptQueryTemplateParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link UScriptQueryTemplateParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(UScriptQueryTemplateParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(UScriptQueryTemplateParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(UScriptQueryTemplateParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(UScriptQueryTemplateParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(UScriptQueryTemplateParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(UScriptQueryTemplateParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(UScriptQueryTemplateParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(UScriptQueryTemplateParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(UScriptQueryTemplateParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(UScriptQueryTemplateParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(UScriptQueryTemplateParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(UScriptQueryTemplateParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link UScriptQueryTemplateParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(UScriptQueryTemplateParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(UScriptQueryTemplateParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(UScriptQueryTemplateParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(UScriptQueryTemplateParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(UScriptQueryTemplateParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(UScriptQueryTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(UScriptQueryTemplateParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(UScriptQueryTemplateParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(UScriptQueryTemplateParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(UScriptQueryTemplateParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(UScriptQueryTemplateParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(UScriptQueryTemplateParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(UScriptQueryTemplateParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(UScriptQueryTemplateParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link UScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(UScriptQueryTemplateParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link UScriptQueryTemplateParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(UScriptQueryTemplateParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(UScriptQueryTemplateParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(UScriptQueryTemplateParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(UScriptQueryTemplateParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(UScriptQueryTemplateParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(UScriptQueryTemplateParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link UScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(UScriptQueryTemplateParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link UScriptQueryTemplateParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(UScriptQueryTemplateParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(UScriptQueryTemplateParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(UScriptQueryTemplateParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(UScriptQueryTemplateParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(UScriptQueryTemplateParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link UScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(UScriptQueryTemplateParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link UScriptQueryTemplateParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(UScriptQueryTemplateParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(UScriptQueryTemplateParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(UScriptQueryTemplateParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificDecimalLiteral(UScriptQueryTemplateParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(UScriptQueryTemplateParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(UScriptQueryTemplateParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(UScriptQueryTemplateParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(UScriptQueryTemplateParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link UScriptQueryTemplateParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(UScriptQueryTemplateParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UScriptQueryTemplateParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(UScriptQueryTemplateParser.NonReservedContext ctx);
}