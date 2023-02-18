package com.springworkshop.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.springworkshop.dbflute.allcommon.DBMetaInstanceHandler;
import com.springworkshop.dbflute.exentity.*;

/**
 * The entity of user as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity {

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

    /** name: {VARCHAR(20)} */
    protected String _name;

    /** category_id: {IX, INT(10), FK to master_category} */
    protected Integer _categoryId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "user";
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
    /** master_category by my category_id, named 'masterCategory'. */
    protected OptionalEntity<MasterCategory> _masterCategory;

    /**
     * [get] master_category by my category_id, named 'masterCategory'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'masterCategory'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MasterCategory> getMasterCategory() {
        if (_masterCategory == null) { _masterCategory = OptionalEntity.relationEmpty(this, "masterCategory"); }
        return _masterCategory;
    }

    /**
     * [set] master_category by my category_id, named 'masterCategory'.
     * @param masterCategory The entity of foreign property 'masterCategory'. (NullAllowed)
     */
    public void setMasterCategory(OptionalEntity<MasterCategory> masterCategory) {
        _masterCategory = masterCategory;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
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
        if (_masterCategory != null && _masterCategory.isPresent())
        { sb.append(li).append(xbRDS(_masterCategory, "masterCategory")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_categoryId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_masterCategory != null && _masterCategory.isPresent())
        { sb.append(dm).append("masterCategory"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public User clone() {
        return (User)super.clone();
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
     * [get] name: {VARCHAR(20)} <br>
     * @return The value of the column 'name'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {VARCHAR(20)} <br>
     * @param name The value of the column 'name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] category_id: {IX, INT(10), FK to master_category} <br>
     * @return The value of the column 'category_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCategoryId() {
        checkSpecifiedProperty("categoryId");
        return _categoryId;
    }

    /**
     * [set] category_id: {IX, INT(10), FK to master_category} <br>
     * @param categoryId The value of the column 'category_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCategoryId(Integer categoryId) {
        registerModifiedProperty("categoryId");
        _categoryId = categoryId;
    }
}
