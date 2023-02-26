package com.springworkshop.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.springworkshop.dbflute.exbhv.*;
import com.springworkshop.dbflute.exentity.*;
import com.springworkshop.dbflute.cbean.*;

/**
 * The referrer loader of master_category as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMasterCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MasterCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected MasterCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMasterCategory ready(List<MasterCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MasterCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MasterCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<User> _referrerUser;

    /**
     * Load referrer of userList by the set-upper of referrer. <br>
     * user by category_id, named 'userList'.
     * <pre>
     * <span style="color: #0000C0">masterCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">masterCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadUser</span>(<span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">userCB</span>.setupSelect...
     *         <span style="color: #553000">userCB</span>.query().set...
     *         <span style="color: #553000">userCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">userLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    userLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MasterCategory masterCategory : <span style="color: #553000">masterCategoryList</span>) {
     *     ... = masterCategory.<span style="color: #CC4747">getUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCategoryId_InScope(pkList);
     * cb.query().addOrderBy_CategoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUser> loadUser(ReferrerConditionSetupper<UserCB> refCBLambda) {
        myBhv().loadUser(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUser = refLs);
        return hd -> hd.handle(new LoaderOfUser().ready(_referrerUser, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MasterCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
