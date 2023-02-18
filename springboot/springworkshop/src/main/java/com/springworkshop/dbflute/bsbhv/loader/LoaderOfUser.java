package com.springworkshop.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.springworkshop.dbflute.exbhv.*;
import com.springworkshop.dbflute.exentity.*;

/**
 * The referrer loader of user as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<User> _selectedList;
    protected BehaviorSelector _selector;
    protected UserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUser ready(List<User> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMasterCategory _foreignMasterCategoryLoader;
    public LoaderOfMasterCategory pulloutMasterCategory() {
        if (_foreignMasterCategoryLoader == null)
        { _foreignMasterCategoryLoader = new LoaderOfMasterCategory().ready(myBhv().pulloutMasterCategory(_selectedList), _selector); }
        return _foreignMasterCategoryLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<User> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
