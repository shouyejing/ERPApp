package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import tarce.testnew.greendao.greendaoBeans.LoginResponseBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOGIN_RESPONSE_BEAN".
*/
public class LoginResponseBeanDao extends AbstractDao<LoginResponseBean, Void> {

    public static final String TABLENAME = "LOGIN_RESPONSE_BEAN";

    /**
     * Properties of entity LoginResponseBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property User_id = new Property(0, int.class, "user_id", false, "USER_ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property GroupsName = new Property(2, String.class, "groupsName", false, "GROUPS_NAME");
        public final static Property GroupsId = new Property(3, int.class, "groupsId", false, "GROUPS_ID");
    }


    public LoginResponseBeanDao(DaoConfig config) {
        super(config);
    }
    
    public LoginResponseBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOGIN_RESPONSE_BEAN\" (" + //
                "\"USER_ID\" INTEGER NOT NULL ," + // 0: user_id
                "\"NAME\" TEXT," + // 1: name
                "\"GROUPS_NAME\" TEXT," + // 2: groupsName
                "\"GROUPS_ID\" INTEGER NOT NULL );"); // 3: groupsId
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_LOGIN_RESPONSE_BEAN_USER_ID ON LOGIN_RESPONSE_BEAN" +
                " (\"USER_ID\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_LOGIN_RESPONSE_BEAN_GROUPS_ID ON LOGIN_RESPONSE_BEAN" +
                " (\"GROUPS_ID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOGIN_RESPONSE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LoginResponseBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getUser_id());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String groupsName = entity.getGroupsName();
        if (groupsName != null) {
            stmt.bindString(3, groupsName);
        }
        stmt.bindLong(4, entity.getGroupsId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LoginResponseBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getUser_id());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String groupsName = entity.getGroupsName();
        if (groupsName != null) {
            stmt.bindString(3, groupsName);
        }
        stmt.bindLong(4, entity.getGroupsId());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public LoginResponseBean readEntity(Cursor cursor, int offset) {
        LoginResponseBean entity = new LoginResponseBean( //
            cursor.getInt(offset + 0), // user_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // groupsName
            cursor.getInt(offset + 3) // groupsId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LoginResponseBean entity, int offset) {
        entity.setUser_id(cursor.getInt(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGroupsName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setGroupsId(cursor.getInt(offset + 3));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(LoginResponseBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(LoginResponseBean entity) {
        return null;
    }

    @Override
    public boolean hasKey(LoginResponseBean entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
