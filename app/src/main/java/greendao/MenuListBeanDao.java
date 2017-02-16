package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import tarce.testnew.greendao.greendaoBeans.MenuListBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MENU_LIST_BEAN".
*/
public class MenuListBeanDao extends AbstractDao<MenuListBean, Void> {

    public static final String TABLENAME = "MENU_LIST_BEAN";

    /**
     * Properties of entity MenuListBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", false, "ID");
        public final static Property Action = new Property(1, String.class, "action", false, "ACTION");
        public final static Property Sequence = new Property(2, int.class, "sequence", false, "SEQUENCE");
        public final static Property Web_icon = new Property(3, String.class, "web_icon", false, "WEB_ICON");
        public final static Property Name = new Property(4, String.class, "name", false, "NAME");
        public final static Property User_id = new Property(5, int.class, "user_id", false, "USER_ID");
        public final static Property Parent_id = new Property(6, int.class, "parent_id", false, "PARENT_ID");
    }


    public MenuListBeanDao(DaoConfig config) {
        super(config);
    }
    
    public MenuListBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MENU_LIST_BEAN\" (" + //
                "\"ID\" INTEGER NOT NULL ," + // 0: id
                "\"ACTION\" TEXT," + // 1: action
                "\"SEQUENCE\" INTEGER NOT NULL ," + // 2: sequence
                "\"WEB_ICON\" TEXT," + // 3: web_icon
                "\"NAME\" TEXT," + // 4: name
                "\"USER_ID\" INTEGER NOT NULL ," + // 5: user_id
                "\"PARENT_ID\" INTEGER NOT NULL );"); // 6: parent_id
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_MENU_LIST_BEAN_ID ON MENU_LIST_BEAN" +
                " (\"ID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MENU_LIST_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MenuListBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String action = entity.getAction();
        if (action != null) {
            stmt.bindString(2, action);
        }
        stmt.bindLong(3, entity.getSequence());
 
        String web_icon = entity.getWeb_icon();
        if (web_icon != null) {
            stmt.bindString(4, web_icon);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
        stmt.bindLong(6, entity.getUser_id());
        stmt.bindLong(7, entity.getParent_id());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MenuListBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String action = entity.getAction();
        if (action != null) {
            stmt.bindString(2, action);
        }
        stmt.bindLong(3, entity.getSequence());
 
        String web_icon = entity.getWeb_icon();
        if (web_icon != null) {
            stmt.bindString(4, web_icon);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
        stmt.bindLong(6, entity.getUser_id());
        stmt.bindLong(7, entity.getParent_id());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public MenuListBean readEntity(Cursor cursor, int offset) {
        MenuListBean entity = new MenuListBean( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // action
            cursor.getInt(offset + 2), // sequence
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // web_icon
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // name
            cursor.getInt(offset + 5), // user_id
            cursor.getInt(offset + 6) // parent_id
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MenuListBean entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setAction(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSequence(cursor.getInt(offset + 2));
        entity.setWeb_icon(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUser_id(cursor.getInt(offset + 5));
        entity.setParent_id(cursor.getInt(offset + 6));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(MenuListBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(MenuListBean entity) {
        return null;
    }

    @Override
    public boolean hasKey(MenuListBean entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}