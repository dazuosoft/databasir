/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao;


import com.databasir.dao.tables.DataSource;
import com.databasir.dao.tables.DataSourceProperty;
import com.databasir.dao.tables.DatabaseDocument;
import com.databasir.dao.tables.DatabaseType;
import com.databasir.dao.tables.DocumentRemark;
import com.databasir.dao.tables.Group;
import com.databasir.dao.tables.Login;
import com.databasir.dao.tables.OauthApp;
import com.databasir.dao.tables.OperationLog;
import com.databasir.dao.tables.Project;
import com.databasir.dao.tables.ProjectSyncRule;
import com.databasir.dao.tables.SysKey;
import com.databasir.dao.tables.SysMail;
import com.databasir.dao.tables.TableColumnDocument;
import com.databasir.dao.tables.TableDocument;
import com.databasir.dao.tables.TableIndexDocument;
import com.databasir.dao.tables.TableTriggerDocument;
import com.databasir.dao.tables.User;
import com.databasir.dao.tables.UserFavoriteProject;
import com.databasir.dao.tables.UserRole;
import com.databasir.dao.tables.records.DataSourcePropertyRecord;
import com.databasir.dao.tables.records.DataSourceRecord;
import com.databasir.dao.tables.records.DatabaseDocumentRecord;
import com.databasir.dao.tables.records.DatabaseTypeRecord;
import com.databasir.dao.tables.records.DocumentRemarkRecord;
import com.databasir.dao.tables.records.GroupRecord;
import com.databasir.dao.tables.records.LoginRecord;
import com.databasir.dao.tables.records.OauthAppRecord;
import com.databasir.dao.tables.records.OperationLogRecord;
import com.databasir.dao.tables.records.ProjectRecord;
import com.databasir.dao.tables.records.ProjectSyncRuleRecord;
import com.databasir.dao.tables.records.SysKeyRecord;
import com.databasir.dao.tables.records.SysMailRecord;
import com.databasir.dao.tables.records.TableColumnDocumentRecord;
import com.databasir.dao.tables.records.TableDocumentRecord;
import com.databasir.dao.tables.records.TableIndexDocumentRecord;
import com.databasir.dao.tables.records.TableTriggerDocumentRecord;
import com.databasir.dao.tables.records.UserFavoriteProjectRecord;
import com.databasir.dao.tables.records.UserRecord;
import com.databasir.dao.tables.records.UserRoleRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * databasir.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DataSourceRecord> KEY_DATA_SOURCE_PRIMARY = Internal.createUniqueKey(DataSource.DATA_SOURCE, DSL.name("KEY_data_source_PRIMARY"), new TableField[] { DataSource.DATA_SOURCE.ID }, true);
    public static final UniqueKey<DataSourceRecord> KEY_DATA_SOURCE_UK_PROJECT_ID = Internal.createUniqueKey(DataSource.DATA_SOURCE, DSL.name("KEY_data_source_uk_project_id"), new TableField[] { DataSource.DATA_SOURCE.PROJECT_ID }, true);
    public static final UniqueKey<DataSourcePropertyRecord> KEY_DATA_SOURCE_PROPERTY_PRIMARY = Internal.createUniqueKey(DataSourceProperty.DATA_SOURCE_PROPERTY, DSL.name("KEY_data_source_property_PRIMARY"), new TableField[] { DataSourceProperty.DATA_SOURCE_PROPERTY.ID }, true);
    public static final UniqueKey<DatabaseDocumentRecord> KEY_DATABASE_DOCUMENT_PRIMARY = Internal.createUniqueKey(DatabaseDocument.DATABASE_DOCUMENT, DSL.name("KEY_database_document_PRIMARY"), new TableField[] { DatabaseDocument.DATABASE_DOCUMENT.ID }, true);
    public static final UniqueKey<DatabaseTypeRecord> KEY_DATABASE_TYPE_PRIMARY = Internal.createUniqueKey(DatabaseType.DATABASE_TYPE, DSL.name("KEY_database_type_PRIMARY"), new TableField[] { DatabaseType.DATABASE_TYPE.ID }, true);
    public static final UniqueKey<DatabaseTypeRecord> KEY_DATABASE_TYPE_UK_DATABASE_TYPE_DELETED_DELETED_TOKEN = Internal.createUniqueKey(DatabaseType.DATABASE_TYPE, DSL.name("KEY_database_type_uk_database_type_deleted_deleted_token"), new TableField[] { DatabaseType.DATABASE_TYPE.DATABASE_TYPE_, DatabaseType.DATABASE_TYPE.DELETED, DatabaseType.DATABASE_TYPE.DELETED_TOKEN }, true);
    public static final UniqueKey<DocumentRemarkRecord> KEY_DOCUMENT_REMARK_PRIMARY = Internal.createUniqueKey(DocumentRemark.DOCUMENT_REMARK, DSL.name("KEY_document_remark_PRIMARY"), new TableField[] { DocumentRemark.DOCUMENT_REMARK.ID }, true);
    public static final UniqueKey<GroupRecord> KEY_GROUP_PRIMARY = Internal.createUniqueKey(Group.GROUP, DSL.name("KEY_group_PRIMARY"), new TableField[] { Group.GROUP.ID }, true);
    public static final UniqueKey<LoginRecord> KEY_LOGIN_PRIMARY = Internal.createUniqueKey(Login.LOGIN, DSL.name("KEY_login_PRIMARY"), new TableField[] { Login.LOGIN.ID }, true);
    public static final UniqueKey<LoginRecord> KEY_LOGIN_UK_USER_ID = Internal.createUniqueKey(Login.LOGIN, DSL.name("KEY_login_uk_user_id"), new TableField[] { Login.LOGIN.USER_ID }, true);
    public static final UniqueKey<OauthAppRecord> KEY_OAUTH_APP_PRIMARY = Internal.createUniqueKey(OauthApp.OAUTH_APP, DSL.name("KEY_oauth_app_PRIMARY"), new TableField[] { OauthApp.OAUTH_APP.ID }, true);
    public static final UniqueKey<OauthAppRecord> KEY_OAUTH_APP_UK_REGISTRATION_ID = Internal.createUniqueKey(OauthApp.OAUTH_APP, DSL.name("KEY_oauth_app_uk_registration_id"), new TableField[] { OauthApp.OAUTH_APP.REGISTRATION_ID }, true);
    public static final UniqueKey<OperationLogRecord> KEY_OPERATION_LOG_PRIMARY = Internal.createUniqueKey(OperationLog.OPERATION_LOG, DSL.name("KEY_operation_log_PRIMARY"), new TableField[] { OperationLog.OPERATION_LOG.ID }, true);
    public static final UniqueKey<ProjectRecord> KEY_PROJECT_PRIMARY = Internal.createUniqueKey(Project.PROJECT, DSL.name("KEY_project_PRIMARY"), new TableField[] { Project.PROJECT.ID }, true);
    public static final UniqueKey<ProjectRecord> KEY_PROJECT_UK_GROUP_ID_NAME_DELETED_TOKEN = Internal.createUniqueKey(Project.PROJECT, DSL.name("KEY_project_uk_group_id_name_deleted_token"), new TableField[] { Project.PROJECT.GROUP_ID, Project.PROJECT.NAME, Project.PROJECT.DELETED_TOKEN }, true);
    public static final UniqueKey<ProjectSyncRuleRecord> KEY_PROJECT_SYNC_RULE_PRIMARY = Internal.createUniqueKey(ProjectSyncRule.PROJECT_SYNC_RULE, DSL.name("KEY_project_sync_rule_PRIMARY"), new TableField[] { ProjectSyncRule.PROJECT_SYNC_RULE.ID }, true);
    public static final UniqueKey<ProjectSyncRuleRecord> KEY_PROJECT_SYNC_RULE_UK_PROJECT_ID = Internal.createUniqueKey(ProjectSyncRule.PROJECT_SYNC_RULE, DSL.name("KEY_project_sync_rule_uk_project_id"), new TableField[] { ProjectSyncRule.PROJECT_SYNC_RULE.PROJECT_ID }, true);
    public static final UniqueKey<SysKeyRecord> KEY_SYS_KEY_PRIMARY = Internal.createUniqueKey(SysKey.SYS_KEY, DSL.name("KEY_sys_key_PRIMARY"), new TableField[] { SysKey.SYS_KEY.ID }, true);
    public static final UniqueKey<SysMailRecord> KEY_SYS_MAIL_PRIMARY = Internal.createUniqueKey(SysMail.SYS_MAIL, DSL.name("KEY_sys_mail_PRIMARY"), new TableField[] { SysMail.SYS_MAIL.ID }, true);
    public static final UniqueKey<TableColumnDocumentRecord> KEY_TABLE_COLUMN_DOCUMENT_PRIMARY = Internal.createUniqueKey(TableColumnDocument.TABLE_COLUMN_DOCUMENT, DSL.name("KEY_table_column_document_PRIMARY"), new TableField[] { TableColumnDocument.TABLE_COLUMN_DOCUMENT.ID }, true);
    public static final UniqueKey<TableDocumentRecord> KEY_TABLE_DOCUMENT_PRIMARY = Internal.createUniqueKey(TableDocument.TABLE_DOCUMENT, DSL.name("KEY_table_document_PRIMARY"), new TableField[] { TableDocument.TABLE_DOCUMENT.ID }, true);
    public static final UniqueKey<TableIndexDocumentRecord> KEY_TABLE_INDEX_DOCUMENT_PRIMARY = Internal.createUniqueKey(TableIndexDocument.TABLE_INDEX_DOCUMENT, DSL.name("KEY_table_index_document_PRIMARY"), new TableField[] { TableIndexDocument.TABLE_INDEX_DOCUMENT.ID }, true);
    public static final UniqueKey<TableTriggerDocumentRecord> KEY_TABLE_TRIGGER_DOCUMENT_PRIMARY = Internal.createUniqueKey(TableTriggerDocument.TABLE_TRIGGER_DOCUMENT, DSL.name("KEY_table_trigger_document_PRIMARY"), new TableField[] { TableTriggerDocument.TABLE_TRIGGER_DOCUMENT.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_UK_EMAIL = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_uk_email"), new TableField[] { User.USER.EMAIL }, true);
    public static final UniqueKey<UserRecord> KEY_USER_UK_USERNAME = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_uk_username"), new TableField[] { User.USER.USERNAME }, true);
    public static final UniqueKey<UserFavoriteProjectRecord> KEY_USER_FAVORITE_PROJECT_PRIMARY = Internal.createUniqueKey(UserFavoriteProject.USER_FAVORITE_PROJECT, DSL.name("KEY_user_favorite_project_PRIMARY"), new TableField[] { UserFavoriteProject.USER_FAVORITE_PROJECT.ID }, true);
    public static final UniqueKey<UserFavoriteProjectRecord> KEY_USER_FAVORITE_PROJECT_UK_USER_ID_PROJECT_ID = Internal.createUniqueKey(UserFavoriteProject.USER_FAVORITE_PROJECT, DSL.name("KEY_user_favorite_project_uk_user_id_project_id"), new TableField[] { UserFavoriteProject.USER_FAVORITE_PROJECT.USER_ID, UserFavoriteProject.USER_FAVORITE_PROJECT.PROJECT_ID }, true);
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = Internal.createUniqueKey(UserRole.USER_ROLE, DSL.name("KEY_user_role_PRIMARY"), new TableField[] { UserRole.USER_ROLE.ID }, true);
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_UK_USER_ID_GROUP_ID_ROLE = Internal.createUniqueKey(UserRole.USER_ROLE, DSL.name("KEY_user_role_uk_user_id_group_id_role"), new TableField[] { UserRole.USER_ROLE.USER_ID, UserRole.USER_ROLE.GROUP_ID, UserRole.USER_ROLE.ROLE }, true);
}
