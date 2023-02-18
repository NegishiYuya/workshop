package com.springworkshop.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.springworkshop.dbflute.cbean.cq.ciq.*;
import com.springworkshop.dbflute.cbean.*;
import com.springworkshop.dbflute.cbean.cq.*;

/**
 * The base condition-query of master_category.
 * @author DBFlute(AutoGenerator)
 */
public class BsMasterCategoryCQ extends AbstractBsMasterCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MasterCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMasterCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from master_category) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MasterCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MasterCategoryCIQ xcreateCIQ() {
        MasterCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MasterCategoryCIQ xnewCIQ() {
        return new MasterCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join master_category on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MasterCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MasterCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, UserCQ> xdfgetId_ExistsReferrer_UserList() { return xgetSQueMap("id_ExistsReferrer_UserList"); }
    public String keepId_ExistsReferrer_UserList(UserCQ sq) { return xkeepSQue("id_ExistsReferrer_UserList", sq); }

    public Map<String, UserCQ> xdfgetId_NotExistsReferrer_UserList() { return xgetSQueMap("id_NotExistsReferrer_UserList"); }
    public String keepId_NotExistsReferrer_UserList(UserCQ sq) { return xkeepSQue("id_NotExistsReferrer_UserList", sq); }

    public Map<String, UserCQ> xdfgetId_SpecifyDerivedReferrer_UserList() { return xgetSQueMap("id_SpecifyDerivedReferrer_UserList"); }
    public String keepId_SpecifyDerivedReferrer_UserList(UserCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_UserList", sq); }

    public Map<String, UserCQ> xdfgetId_QueryDerivedReferrer_UserList() { return xgetSQueMap("id_QueryDerivedReferrer_UserList"); }
    public String keepId_QueryDerivedReferrer_UserList(UserCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_UserList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_UserListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_UserList"); }
    public String keepId_QueryDerivedReferrer_UserListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_UserList", pm); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsMasterCategoryCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsMasterCategoryCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _label;
    public ConditionValue xdfgetLabel()
    { if (_label == null) { _label = nCV(); }
      return _label; }
    protected ConditionValue xgetCValueLabel() { return xdfgetLabel(); }

    /**
     * Add order-by as ascend. <br>
     * label: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsMasterCategoryCQ addOrderBy_Label_Asc() { regOBA("label"); return this; }

    /**
     * Add order-by as descend. <br>
     * label: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsMasterCategoryCQ addOrderBy_Label_Desc() { regOBD("label"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMasterCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMasterCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MasterCategoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MasterCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MasterCategoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MasterCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MasterCategoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MasterCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MasterCategoryCQ> _myselfExistsMap;
    public Map<String, MasterCategoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MasterCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MasterCategoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MasterCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MasterCategoryCB.class.getName(); }
    protected String xCQ() { return MasterCategoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
