package com.springworkshop.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.springworkshop.dbflute.allcommon.*;
import com.springworkshop.dbflute.exentity.*;

/**
 * The DB meta of master_category. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MasterCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MasterCategoryDbm _instance = new MasterCategoryDbm();
    private MasterCategoryDbm() {}
    public static MasterCategoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MasterCategory)et).getId(), (et, vl) -> ((MasterCategory)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((MasterCategory)et).getLabel(), (et, vl) -> ((MasterCategory)et).setLabel((String)vl), "label");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "master_category";
    protected final String _tableDispName = "master_category";
    protected final String _tablePropertyName = "masterCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("test_database.master_category", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, "userList", null, false);
    protected final ColumnInfo _columnLabel = cci("label", "label", null, null, String.class, "label", null, false, false, false, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * label: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabel() { return _columnLabel; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnLabel());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * user by category_id, named 'userList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), UserDbm.getInstance().columnCategoryId());
        return cri("user_ibfk_1", "userList", this, UserDbm.getInstance(), mp, false, "masterCategory");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.springworkshop.dbflute.exentity.MasterCategory"; }
    public String getConditionBeanTypeName() { return "com.springworkshop.dbflute.cbean.MasterCategoryCB"; }
    public String getBehaviorTypeName() { return "com.springworkshop.dbflute.exbhv.MasterCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MasterCategory> getEntityType() { return MasterCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MasterCategory newEntity() { return new MasterCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MasterCategory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MasterCategory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
