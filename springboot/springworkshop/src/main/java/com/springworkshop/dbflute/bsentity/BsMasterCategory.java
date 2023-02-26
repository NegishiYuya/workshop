package com.springworkshop.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.springworkshop.dbflute.allcommon.DBMetaInstanceHandler;
import com.springworkshop.dbflute.exentity.*;

/**
 * The entity of master_category as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMasterCategory extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, NotNull, INT(10)} */
    protected Integer _id;

    /** label: {VARCHAR(20)} */
    protected String _label;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "master_category";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** user by category_id, named 'userList'. */
    protected List<User> _userList;

    /**
     * [get] user by category_id, named 'userList'.
     * @return The entity list of referrer property 'userList'. (NotNull: even if no loading, returns empty list)
     */
    public List<User> getUserList() {
        if (_userList == null) { _userList = newReferrerList(); }
        return _userList;
    }

    /**
     * [set] user by category_id, named 'userList'.
     * @param userList The entity list of referrer property 'userList'. (NullAllowed)
     */
    public void setUserList(List<User> userList) {
        _userList = userList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMasterCategory) {
            BsMasterCategory other = (BsMasterCategory)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userList != null) { for (User et : _userList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_label));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userList != null && !_userList.isEmpty())
        { sb.append(dm).append("userList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MasterCategory clone() {
        return (MasterCategory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, NotNull, INT(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] label: {VARCHAR(20)} <br>
     * @return The value of the column 'label'. (NullAllowed even if selected: for no constraint)
     */
    public String getLabel() {
        checkSpecifiedProperty("label");
        return _label;
    }

    /**
     * [set] label: {VARCHAR(20)} <br>
     * @param label The value of the column 'label'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLabel(String label) {
        registerModifiedProperty("label");
        _label = label;
    }
}
