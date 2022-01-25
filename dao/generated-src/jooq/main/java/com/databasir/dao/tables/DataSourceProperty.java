/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables;


import com.databasir.dao.Databasir;
import com.databasir.dao.Indexes;
import com.databasir.dao.Keys;
import com.databasir.dao.tables.records.DataSourcePropertyRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataSourceProperty extends TableImpl<DataSourcePropertyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>databasir.data_source_property</code>
     */
    public static final DataSourceProperty DATA_SOURCE_PROPERTY = new DataSourceProperty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataSourcePropertyRecord> getRecordType() {
        return DataSourcePropertyRecord.class;
    }

    /**
     * The column <code>databasir.data_source_property.id</code>.
     */
    public final TableField<DataSourcePropertyRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>databasir.data_source_property.data_source_id</code>.
     */
    public final TableField<DataSourcePropertyRecord, Integer> DATA_SOURCE_ID = createField(DSL.name("data_source_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>databasir.data_source_property.key</code>.
     */
    public final TableField<DataSourcePropertyRecord, String> KEY = createField(DSL.name("key"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>databasir.data_source_property.value</code>.
     */
    public final TableField<DataSourcePropertyRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>databasir.data_source_property.create_at</code>.
     */
    public final TableField<DataSourcePropertyRecord, LocalDateTime> CREATE_AT = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private DataSourceProperty(Name alias, Table<DataSourcePropertyRecord> aliased) {
        this(alias, aliased, null);
    }

    private DataSourceProperty(Name alias, Table<DataSourcePropertyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>databasir.data_source_property</code> table
     * reference
     */
    public DataSourceProperty(String alias) {
        this(DSL.name(alias), DATA_SOURCE_PROPERTY);
    }

    /**
     * Create an aliased <code>databasir.data_source_property</code> table
     * reference
     */
    public DataSourceProperty(Name alias) {
        this(alias, DATA_SOURCE_PROPERTY);
    }

    /**
     * Create a <code>databasir.data_source_property</code> table reference
     */
    public DataSourceProperty() {
        this(DSL.name("data_source_property"), null);
    }

    public <O extends Record> DataSourceProperty(Table<O> child, ForeignKey<O, DataSourcePropertyRecord> key) {
        super(child, key, DATA_SOURCE_PROPERTY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Databasir.DATABASIR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DATA_SOURCE_PROPERTY_IDX_DATA_SOURCE_ID);
    }

    @Override
    public Identity<DataSourcePropertyRecord, Integer> getIdentity() {
        return (Identity<DataSourcePropertyRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DataSourcePropertyRecord> getPrimaryKey() {
        return Keys.KEY_DATA_SOURCE_PROPERTY_PRIMARY;
    }

    @Override
    public DataSourceProperty as(String alias) {
        return new DataSourceProperty(DSL.name(alias), this);
    }

    @Override
    public DataSourceProperty as(Name alias) {
        return new DataSourceProperty(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DataSourceProperty rename(String name) {
        return new DataSourceProperty(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DataSourceProperty rename(Name name) {
        return new DataSourceProperty(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}