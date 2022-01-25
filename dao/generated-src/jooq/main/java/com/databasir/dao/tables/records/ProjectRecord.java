/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.records;


import com.databasir.dao.tables.Project;
import com.databasir.dao.tables.pojos.ProjectPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectRecord extends UpdatableRecordImpl<ProjectRecord> implements Record6<Integer, String, String, Integer, Boolean, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>databasir.project.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>databasir.project.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>databasir.project.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>databasir.project.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>databasir.project.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>databasir.project.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>databasir.project.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>databasir.project.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>databasir.project.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>databasir.project.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>databasir.project.create_at</code>.
     */
    public void setCreateAt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>databasir.project.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Integer, Boolean, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, Integer, Boolean, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Project.PROJECT.ID;
    }

    @Override
    public Field<String> field2() {
        return Project.PROJECT.NAME;
    }

    @Override
    public Field<String> field3() {
        return Project.PROJECT.DESCRIPTION;
    }

    @Override
    public Field<Integer> field4() {
        return Project.PROJECT.GROUP_ID;
    }

    @Override
    public Field<Boolean> field5() {
        return Project.PROJECT.DELETED;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Project.PROJECT.CREATE_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer component4() {
        return getGroupId();
    }

    @Override
    public Boolean component5() {
        return getDeleted();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Integer value4() {
        return getGroupId();
    }

    @Override
    public Boolean value5() {
        return getDeleted();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateAt();
    }

    @Override
    public ProjectRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ProjectRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ProjectRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ProjectRecord value4(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public ProjectRecord value5(Boolean value) {
        setDeleted(value);
        return this;
    }

    @Override
    public ProjectRecord value6(LocalDateTime value) {
        setCreateAt(value);
        return this;
    }

    @Override
    public ProjectRecord values(Integer value1, String value2, String value3, Integer value4, Boolean value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProjectRecord
     */
    public ProjectRecord() {
        super(Project.PROJECT);
    }

    /**
     * Create a detached, initialised ProjectRecord
     */
    public ProjectRecord(Integer id, String name, String description, Integer groupId, Boolean deleted, LocalDateTime createAt) {
        super(Project.PROJECT);

        setId(id);
        setName(name);
        setDescription(description);
        setGroupId(groupId);
        setDeleted(deleted);
        setCreateAt(createAt);
    }

    /**
     * Create a detached, initialised ProjectRecord
     */
    public ProjectRecord(ProjectPojo value) {
        super(Project.PROJECT);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setDescription(value.getDescription());
            setGroupId(value.getGroupId());
            setDeleted(value.getDeleted());
            setCreateAt(value.getCreateAt());
        }
    }
}