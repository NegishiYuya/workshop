package com.springworkshop.dbflute.cbean.nss;

import com.springworkshop.dbflute.cbean.cq.UserCQ;

/**
 * The nest select set-upper of user.
 * @author DBFlute(AutoGenerator)
 */
public class UserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final UserCQ _query;
    public UserNss(UserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * master_category by my category_id, named 'masterCategory'.
     */
    public void withMasterCategory() {
        _query.xdoNss(() -> _query.queryMasterCategory());
    }
}
