// Generated from SparkScriptTemplate.g4 by ANTLR 4.5.3

package com.uber.sparkscript.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkScriptTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface SparkScriptTemplateVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#root}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRoot(SparkScriptTemplateParser.RootContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#assignmentWithSemicolon}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignmentWithSemicolon(SparkScriptTemplateParser.AssignmentWithSemicolonContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#variableAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableAssignment(SparkScriptTemplateParser.VariableAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#variableAssignment_variableName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableAssignment_variableName(SparkScriptTemplateParser.VariableAssignment_variableNameContext ctx);

    /**
     * Visit a parse tree produced by the {@code statementDefault}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementDefault(SparkScriptTemplateParser.StatementDefaultContext ctx);

    /**
     * Visit a parse tree produced by the {@code use}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUse(SparkScriptTemplateParser.UseContext ctx);

    /**
     * Visit a parse tree produced by the {@code createDatabase}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateDatabase(SparkScriptTemplateParser.CreateDatabaseContext ctx);

    /**
     * Visit a parse tree produced by the {@code setDatabaseProperties}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetDatabaseProperties(SparkScriptTemplateParser.SetDatabasePropertiesContext ctx);

    /**
     * Visit a parse tree produced by the {@code dropDatabase}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropDatabase(SparkScriptTemplateParser.DropDatabaseContext ctx);

    /**
     * Visit a parse tree produced by the {@code createTableUsing}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateTableUsing(SparkScriptTemplateParser.CreateTableUsingContext ctx);

    /**
     * Visit a parse tree produced by the {@code createTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateTable(SparkScriptTemplateParser.CreateTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code createTableLike}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateTableLike(SparkScriptTemplateParser.CreateTableLikeContext ctx);

    /**
     * Visit a parse tree produced by the {@code analyze}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnalyze(SparkScriptTemplateParser.AnalyzeContext ctx);

    /**
     * Visit a parse tree produced by the {@code renameTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRenameTable(SparkScriptTemplateParser.RenameTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code setTableProperties}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetTableProperties(SparkScriptTemplateParser.SetTablePropertiesContext ctx);

    /**
     * Visit a parse tree produced by the {@code unsetTableProperties}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnsetTableProperties(SparkScriptTemplateParser.UnsetTablePropertiesContext ctx);

    /**
     * Visit a parse tree produced by the {@code setTableSerDe}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetTableSerDe(SparkScriptTemplateParser.SetTableSerDeContext ctx);

    /**
     * Visit a parse tree produced by the {@code addTablePartition}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddTablePartition(SparkScriptTemplateParser.AddTablePartitionContext ctx);

    /**
     * Visit a parse tree produced by the {@code renameTablePartition}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRenameTablePartition(SparkScriptTemplateParser.RenameTablePartitionContext ctx);

    /**
     * Visit a parse tree produced by the {@code dropTablePartitions}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropTablePartitions(SparkScriptTemplateParser.DropTablePartitionsContext ctx);

    /**
     * Visit a parse tree produced by the {@code setTableLocation}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetTableLocation(SparkScriptTemplateParser.SetTableLocationContext ctx);

    /**
     * Visit a parse tree produced by the {@code dropTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropTable(SparkScriptTemplateParser.DropTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code createView}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateView(SparkScriptTemplateParser.CreateViewContext ctx);

    /**
     * Visit a parse tree produced by the {@code createTempViewUsing}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateTempViewUsing(SparkScriptTemplateParser.CreateTempViewUsingContext ctx);

    /**
     * Visit a parse tree produced by the {@code alterViewQuery}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlterViewQuery(SparkScriptTemplateParser.AlterViewQueryContext ctx);

    /**
     * Visit a parse tree produced by the {@code createFunction}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateFunction(SparkScriptTemplateParser.CreateFunctionContext ctx);

    /**
     * Visit a parse tree produced by the {@code dropFunction}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDropFunction(SparkScriptTemplateParser.DropFunctionContext ctx);

    /**
     * Visit a parse tree produced by the {@code explain}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExplain(SparkScriptTemplateParser.ExplainContext ctx);

    /**
     * Visit a parse tree produced by the {@code showTables}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowTables(SparkScriptTemplateParser.ShowTablesContext ctx);

    /**
     * Visit a parse tree produced by the {@code showDatabases}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowDatabases(SparkScriptTemplateParser.ShowDatabasesContext ctx);

    /**
     * Visit a parse tree produced by the {@code showTblProperties}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowTblProperties(SparkScriptTemplateParser.ShowTblPropertiesContext ctx);

    /**
     * Visit a parse tree produced by the {@code showColumns}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowColumns(SparkScriptTemplateParser.ShowColumnsContext ctx);

    /**
     * Visit a parse tree produced by the {@code showPartitions}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowPartitions(SparkScriptTemplateParser.ShowPartitionsContext ctx);

    /**
     * Visit a parse tree produced by the {@code showFunctions}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowFunctions(SparkScriptTemplateParser.ShowFunctionsContext ctx);

    /**
     * Visit a parse tree produced by the {@code showCreateTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShowCreateTable(SparkScriptTemplateParser.ShowCreateTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code describeFunction}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDescribeFunction(SparkScriptTemplateParser.DescribeFunctionContext ctx);

    /**
     * Visit a parse tree produced by the {@code describeDatabase}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDescribeDatabase(SparkScriptTemplateParser.DescribeDatabaseContext ctx);

    /**
     * Visit a parse tree produced by the {@code describeTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDescribeTable(SparkScriptTemplateParser.DescribeTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code refreshTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefreshTable(SparkScriptTemplateParser.RefreshTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code refreshResource}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefreshResource(SparkScriptTemplateParser.RefreshResourceContext ctx);

    /**
     * Visit a parse tree produced by the {@code cacheTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCacheTable(SparkScriptTemplateParser.CacheTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code uncacheTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUncacheTable(SparkScriptTemplateParser.UncacheTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code clearCache}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClearCache(SparkScriptTemplateParser.ClearCacheContext ctx);

    /**
     * Visit a parse tree produced by the {@code loadData}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadData(SparkScriptTemplateParser.LoadDataContext ctx);

    /**
     * Visit a parse tree produced by the {@code truncateTable}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTruncateTable(SparkScriptTemplateParser.TruncateTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code manageResource}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitManageResource(SparkScriptTemplateParser.ManageResourceContext ctx);

    /**
     * Visit a parse tree produced by the {@code failNativeCommand}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFailNativeCommand(SparkScriptTemplateParser.FailNativeCommandContext ctx);

    /**
     * Visit a parse tree produced by the {@code setConfiguration}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetConfiguration(SparkScriptTemplateParser.SetConfigurationContext ctx);

    /**
     * Visit a parse tree produced by the {@code resetConfiguration}
     * labeled alternative in {@link SparkScriptTemplateParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResetConfiguration(SparkScriptTemplateParser.ResetConfigurationContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#unsupportedHiveNativeCommands}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnsupportedHiveNativeCommands(SparkScriptTemplateParser.UnsupportedHiveNativeCommandsContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#createTableHeader}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateTableHeader(SparkScriptTemplateParser.CreateTableHeaderContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#bucketSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBucketSpec(SparkScriptTemplateParser.BucketSpecContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#skewSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSkewSpec(SparkScriptTemplateParser.SkewSpecContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#locationSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLocationSpec(SparkScriptTemplateParser.LocationSpecContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#query}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQuery(SparkScriptTemplateParser.QueryContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#insertInto}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInsertInto(SparkScriptTemplateParser.InsertIntoContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#partitionSpecLocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionSpecLocation(SparkScriptTemplateParser.PartitionSpecLocationContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#partitionSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionSpec(SparkScriptTemplateParser.PartitionSpecContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#partitionVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPartitionVal(SparkScriptTemplateParser.PartitionValContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#describeFuncName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDescribeFuncName(SparkScriptTemplateParser.DescribeFuncNameContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#describeColName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDescribeColName(SparkScriptTemplateParser.DescribeColNameContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#ctes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCtes(SparkScriptTemplateParser.CtesContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#namedQuery}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamedQuery(SparkScriptTemplateParser.NamedQueryContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#tableProvider}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableProvider(SparkScriptTemplateParser.TableProviderContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTablePropertyList(SparkScriptTemplateParser.TablePropertyListContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#tableProperty}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableProperty(SparkScriptTemplateParser.TablePropertyContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyKey}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTablePropertyKey(SparkScriptTemplateParser.TablePropertyKeyContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#tablePropertyValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTablePropertyValue(SparkScriptTemplateParser.TablePropertyValueContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#constantList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstantList(SparkScriptTemplateParser.ConstantListContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#nestedConstantList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNestedConstantList(SparkScriptTemplateParser.NestedConstantListContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#createFileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreateFileFormat(SparkScriptTemplateParser.CreateFileFormatContext ctx);

    /**
     * Visit a parse tree produced by the {@code tableFileFormat}
     * labeled alternative in {@link SparkScriptTemplateParser#fileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableFileFormat(SparkScriptTemplateParser.TableFileFormatContext ctx);

    /**
     * Visit a parse tree produced by the {@code genericFileFormat}
     * labeled alternative in {@link SparkScriptTemplateParser#fileFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGenericFileFormat(SparkScriptTemplateParser.GenericFileFormatContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#storageHandler}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStorageHandler(SparkScriptTemplateParser.StorageHandlerContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#resource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResource(SparkScriptTemplateParser.ResourceContext ctx);

    /**
     * Visit a parse tree produced by the {@code singleInsertQuery}
     * labeled alternative in {@link SparkScriptTemplateParser#queryNoWith}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSingleInsertQuery(SparkScriptTemplateParser.SingleInsertQueryContext ctx);

    /**
     * Visit a parse tree produced by the {@code multiInsertQuery}
     * labeled alternative in {@link SparkScriptTemplateParser#queryNoWith}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultiInsertQuery(SparkScriptTemplateParser.MultiInsertQueryContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#queryOrganization}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQueryOrganization(SparkScriptTemplateParser.QueryOrganizationContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#multiInsertQueryBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultiInsertQueryBody(SparkScriptTemplateParser.MultiInsertQueryBodyContext ctx);

    /**
     * Visit a parse tree produced by the {@code queryTermDefault}
     * labeled alternative in {@link SparkScriptTemplateParser#queryTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQueryTermDefault(SparkScriptTemplateParser.QueryTermDefaultContext ctx);

    /**
     * Visit a parse tree produced by the {@code setOperation}
     * labeled alternative in {@link SparkScriptTemplateParser#queryTerm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetOperation(SparkScriptTemplateParser.SetOperationContext ctx);

    /**
     * Visit a parse tree produced by the {@code queryPrimaryDefault}
     * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQueryPrimaryDefault(SparkScriptTemplateParser.QueryPrimaryDefaultContext ctx);

    /**
     * Visit a parse tree produced by the {@code table}
     * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTable(SparkScriptTemplateParser.TableContext ctx);

    /**
     * Visit a parse tree produced by the {@code inlineTableDefault1}
     * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInlineTableDefault1(SparkScriptTemplateParser.InlineTableDefault1Context ctx);

    /**
     * Visit a parse tree produced by the {@code subquery}
     * labeled alternative in {@link SparkScriptTemplateParser#queryPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubquery(SparkScriptTemplateParser.SubqueryContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#sortItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSortItem(SparkScriptTemplateParser.SortItemContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#querySpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQuerySpecification(SparkScriptTemplateParser.QuerySpecificationContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#fromClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFromClause(SparkScriptTemplateParser.FromClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#aggregation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAggregation(SparkScriptTemplateParser.AggregationContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#groupingSet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroupingSet(SparkScriptTemplateParser.GroupingSetContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#lateralView}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLateralView(SparkScriptTemplateParser.LateralViewContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#setQuantifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetQuantifier(SparkScriptTemplateParser.SetQuantifierContext ctx);

    /**
     * Visit a parse tree produced by the {@code relationDefault}
     * labeled alternative in {@link SparkScriptTemplateParser#relation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRelationDefault(SparkScriptTemplateParser.RelationDefaultContext ctx);

    /**
     * Visit a parse tree produced by the {@code joinRelation}
     * labeled alternative in {@link SparkScriptTemplateParser#relation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJoinRelation(SparkScriptTemplateParser.JoinRelationContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#joinType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJoinType(SparkScriptTemplateParser.JoinTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#joinCriteria}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJoinCriteria(SparkScriptTemplateParser.JoinCriteriaContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#sample}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSample(SparkScriptTemplateParser.SampleContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#identifierList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierList(SparkScriptTemplateParser.IdentifierListContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#identifierSeq}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierSeq(SparkScriptTemplateParser.IdentifierSeqContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#orderedIdentifierList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrderedIdentifierList(SparkScriptTemplateParser.OrderedIdentifierListContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#orderedIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrderedIdentifier(SparkScriptTemplateParser.OrderedIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#identifierCommentList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierCommentList(SparkScriptTemplateParser.IdentifierCommentListContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#identifierComment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierComment(SparkScriptTemplateParser.IdentifierCommentContext ctx);

    /**
     * Visit a parse tree produced by the {@code tableName}
     * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableName(SparkScriptTemplateParser.TableNameContext ctx);

    /**
     * Visit a parse tree produced by the {@code aliasedQuery}
     * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAliasedQuery(SparkScriptTemplateParser.AliasedQueryContext ctx);

    /**
     * Visit a parse tree produced by the {@code aliasedRelation}
     * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAliasedRelation(SparkScriptTemplateParser.AliasedRelationContext ctx);

    /**
     * Visit a parse tree produced by the {@code inlineTableDefault2}
     * labeled alternative in {@link SparkScriptTemplateParser#relationPrimary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInlineTableDefault2(SparkScriptTemplateParser.InlineTableDefault2Context ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#inlineTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInlineTable(SparkScriptTemplateParser.InlineTableContext ctx);

    /**
     * Visit a parse tree produced by the {@code rowFormatSerde}
     * labeled alternative in {@link SparkScriptTemplateParser#rowFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRowFormatSerde(SparkScriptTemplateParser.RowFormatSerdeContext ctx);

    /**
     * Visit a parse tree produced by the {@code rowFormatDelimited}
     * labeled alternative in {@link SparkScriptTemplateParser#rowFormat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRowFormatDelimited(SparkScriptTemplateParser.RowFormatDelimitedContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#tableIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTableIdentifier(SparkScriptTemplateParser.TableIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#namedExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamedExpression(SparkScriptTemplateParser.NamedExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#namedExpressionSeq}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamedExpressionSeq(SparkScriptTemplateParser.NamedExpressionSeqContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(SparkScriptTemplateParser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code logicalNot}
     * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLogicalNot(SparkScriptTemplateParser.LogicalNotContext ctx);

    /**
     * Visit a parse tree produced by the {@code booleanDefault}
     * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBooleanDefault(SparkScriptTemplateParser.BooleanDefaultContext ctx);

    /**
     * Visit a parse tree produced by the {@code exists}
     * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExists(SparkScriptTemplateParser.ExistsContext ctx);

    /**
     * Visit a parse tree produced by the {@code logicalBinary}
     * labeled alternative in {@link SparkScriptTemplateParser#booleanExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLogicalBinary(SparkScriptTemplateParser.LogicalBinaryContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#predicated}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPredicated(SparkScriptTemplateParser.PredicatedContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPredicate(SparkScriptTemplateParser.PredicateContext ctx);

    /**
     * Visit a parse tree produced by the {@code valueExpressionDefault}
     * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueExpressionDefault(SparkScriptTemplateParser.ValueExpressionDefaultContext ctx);

    /**
     * Visit a parse tree produced by the {@code comparison}
     * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparison(SparkScriptTemplateParser.ComparisonContext ctx);

    /**
     * Visit a parse tree produced by the {@code arithmeticBinary}
     * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArithmeticBinary(SparkScriptTemplateParser.ArithmeticBinaryContext ctx);

    /**
     * Visit a parse tree produced by the {@code arithmeticUnary}
     * labeled alternative in {@link SparkScriptTemplateParser#valueExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArithmeticUnary(SparkScriptTemplateParser.ArithmeticUnaryContext ctx);

    /**
     * Visit a parse tree produced by the {@code dereference}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDereference(SparkScriptTemplateParser.DereferenceContext ctx);

    /**
     * Visit a parse tree produced by the {@code simpleCase}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSimpleCase(SparkScriptTemplateParser.SimpleCaseContext ctx);

    /**
     * Visit a parse tree produced by the {@code cast}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCast(SparkScriptTemplateParser.CastContext ctx);

    /**
     * Visit a parse tree produced by the {@code constantDefault}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstantDefault(SparkScriptTemplateParser.ConstantDefaultContext ctx);

    /**
     * Visit a parse tree produced by the {@code columnReference}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumnReference(SparkScriptTemplateParser.ColumnReferenceContext ctx);

    /**
     * Visit a parse tree produced by the {@code rowConstructor}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRowConstructor(SparkScriptTemplateParser.RowConstructorContext ctx);

    /**
     * Visit a parse tree produced by the {@code parenthesizedExpression}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParenthesizedExpression(SparkScriptTemplateParser.ParenthesizedExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code star}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStar(SparkScriptTemplateParser.StarContext ctx);

    /**
     * Visit a parse tree produced by the {@code subscript}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubscript(SparkScriptTemplateParser.SubscriptContext ctx);

    /**
     * Visit a parse tree produced by the {@code functionCall}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCall(SparkScriptTemplateParser.FunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code searchedCase}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSearchedCase(SparkScriptTemplateParser.SearchedCaseContext ctx);

    /**
     * Visit a parse tree produced by the {@code subqueryExpression}
     * labeled alternative in {@link SparkScriptTemplateParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubqueryExpression(SparkScriptTemplateParser.SubqueryExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code nullLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNullLiteral(SparkScriptTemplateParser.NullLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code intervalLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntervalLiteral(SparkScriptTemplateParser.IntervalLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code typeConstructor}
     * labeled alternative in {@link SparkScriptTemplateParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeConstructor(SparkScriptTemplateParser.TypeConstructorContext ctx);

    /**
     * Visit a parse tree produced by the {@code numericLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumericLiteral(SparkScriptTemplateParser.NumericLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code booleanLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBooleanLiteral(SparkScriptTemplateParser.BooleanLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code stringLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringLiteral(SparkScriptTemplateParser.StringLiteralContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparisonOperator(SparkScriptTemplateParser.ComparisonOperatorContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#arithmeticOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArithmeticOperator(SparkScriptTemplateParser.ArithmeticOperatorContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#predicateOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPredicateOperator(SparkScriptTemplateParser.PredicateOperatorContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#booleanValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBooleanValue(SparkScriptTemplateParser.BooleanValueContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#interval}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInterval(SparkScriptTemplateParser.IntervalContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#intervalField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntervalField(SparkScriptTemplateParser.IntervalFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#intervalValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntervalValue(SparkScriptTemplateParser.IntervalValueContext ctx);

    /**
     * Visit a parse tree produced by the {@code complexDataType}
     * labeled alternative in {@link SparkScriptTemplateParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComplexDataType(SparkScriptTemplateParser.ComplexDataTypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code primitiveDataType}
     * labeled alternative in {@link SparkScriptTemplateParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimitiveDataType(SparkScriptTemplateParser.PrimitiveDataTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#colTypeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColTypeList(SparkScriptTemplateParser.ColTypeListContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#colType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColType(SparkScriptTemplateParser.ColTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#whenClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhenClause(SparkScriptTemplateParser.WhenClauseContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#windows}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindows(SparkScriptTemplateParser.WindowsContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#namedWindow}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamedWindow(SparkScriptTemplateParser.NamedWindowContext ctx);

    /**
     * Visit a parse tree produced by the {@code windowRef}
     * labeled alternative in {@link SparkScriptTemplateParser#windowSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindowRef(SparkScriptTemplateParser.WindowRefContext ctx);

    /**
     * Visit a parse tree produced by the {@code windowDef}
     * labeled alternative in {@link SparkScriptTemplateParser#windowSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindowDef(SparkScriptTemplateParser.WindowDefContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#windowFrame}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindowFrame(SparkScriptTemplateParser.WindowFrameContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#frameBound}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFrameBound(SparkScriptTemplateParser.FrameBoundContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#qualifiedName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQualifiedName(SparkScriptTemplateParser.QualifiedNameContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(SparkScriptTemplateParser.IdentifierContext ctx);

    /**
     * Visit a parse tree produced by the {@code unquotedIdentifier}
     * labeled alternative in {@link SparkScriptTemplateParser#strictIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnquotedIdentifier(SparkScriptTemplateParser.UnquotedIdentifierContext ctx);

    /**
     * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
     * labeled alternative in {@link SparkScriptTemplateParser#strictIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQuotedIdentifierAlternative(SparkScriptTemplateParser.QuotedIdentifierAlternativeContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#quotedIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitQuotedIdentifier(SparkScriptTemplateParser.QuotedIdentifierContext ctx);

    /**
     * Visit a parse tree produced by the {@code decimalLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDecimalLiteral(SparkScriptTemplateParser.DecimalLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code scientificDecimalLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitScientificDecimalLiteral(SparkScriptTemplateParser.ScientificDecimalLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code integerLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntegerLiteral(SparkScriptTemplateParser.IntegerLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code bigIntLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBigIntLiteral(SparkScriptTemplateParser.BigIntLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code smallIntLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSmallIntLiteral(SparkScriptTemplateParser.SmallIntLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code tinyIntLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTinyIntLiteral(SparkScriptTemplateParser.TinyIntLiteralContext ctx);

    /**
     * Visit a parse tree produced by the {@code doubleLiteral}
     * labeled alternative in {@link SparkScriptTemplateParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDoubleLiteral(SparkScriptTemplateParser.DoubleLiteralContext ctx);

    /**
     * Visit a parse tree produced by {@link SparkScriptTemplateParser#nonReserved}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNonReserved(SparkScriptTemplateParser.NonReservedContext ctx);
}