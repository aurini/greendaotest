package com.example.aurini.greendaotest.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ARTICLE".
*/
public class ArticleDao extends AbstractDao<Article, Long> {

    public static final String TABLENAME = "ARTICLE";

    /**
     * Properties of entity Article.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property  Ariticle_id = new Property(1, Long.class, " ariticle_id", false, " ARITICLE_ID");
        public final static Property Category = new Property(2, String.class, "category", false, "CATEGORY");
        public final static Property Text_comment = new Property(3, String.class, "text_comment", false, "TEXT_COMMENT");
        public final static Property Img_link_server = new Property(4, String.class, "img_link_server", false, "IMG_LINK_SERVER");
        public final static Property Img_link_local = new Property(5, String.class, "img_link_local", false, "IMG_LINK_LOCAL");
        public final static Property Week_id = new Property(6, Integer.class, "week_id", false, "WEEK_ID");
        public final static Property Weblink = new Property(7, String.class, "weblink", false, "WEBLINK");
        public final static Property Show_enabled = new Property(8, Boolean.class, "show_enabled", false, "SHOW_ENABLED");
    }


    public ArticleDao(DaoConfig config) {
        super(config);
    }
    
    public ArticleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ARTICLE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\" ARITICLE_ID\" INTEGER," + // 1:  ariticle_id
                "\"CATEGORY\" TEXT," + // 2: category
                "\"TEXT_COMMENT\" TEXT," + // 3: text_comment
                "\"IMG_LINK_SERVER\" TEXT," + // 4: img_link_server
                "\"IMG_LINK_LOCAL\" TEXT," + // 5: img_link_local
                "\"WEEK_ID\" INTEGER," + // 6: week_id
                "\"WEBLINK\" TEXT," + // 7: weblink
                "\"SHOW_ENABLED\" INTEGER);"); // 8: show_enabled
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ARTICLE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Article entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long  ariticle_id = entity.get Ariticle_id();
        if ( ariticle_id != null) {
            stmt.bindLong(2,  ariticle_id);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(3, category);
        }
 
        String text_comment = entity.getText_comment();
        if (text_comment != null) {
            stmt.bindString(4, text_comment);
        }
 
        String img_link_server = entity.getImg_link_server();
        if (img_link_server != null) {
            stmt.bindString(5, img_link_server);
        }
 
        String img_link_local = entity.getImg_link_local();
        if (img_link_local != null) {
            stmt.bindString(6, img_link_local);
        }
 
        Integer week_id = entity.getWeek_id();
        if (week_id != null) {
            stmt.bindLong(7, week_id);
        }
 
        String weblink = entity.getWeblink();
        if (weblink != null) {
            stmt.bindString(8, weblink);
        }
 
        Boolean show_enabled = entity.getShow_enabled();
        if (show_enabled != null) {
            stmt.bindLong(9, show_enabled ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Article entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long  ariticle_id = entity.get Ariticle_id();
        if ( ariticle_id != null) {
            stmt.bindLong(2,  ariticle_id);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(3, category);
        }
 
        String text_comment = entity.getText_comment();
        if (text_comment != null) {
            stmt.bindString(4, text_comment);
        }
 
        String img_link_server = entity.getImg_link_server();
        if (img_link_server != null) {
            stmt.bindString(5, img_link_server);
        }
 
        String img_link_local = entity.getImg_link_local();
        if (img_link_local != null) {
            stmt.bindString(6, img_link_local);
        }
 
        Integer week_id = entity.getWeek_id();
        if (week_id != null) {
            stmt.bindLong(7, week_id);
        }
 
        String weblink = entity.getWeblink();
        if (weblink != null) {
            stmt.bindString(8, weblink);
        }
 
        Boolean show_enabled = entity.getShow_enabled();
        if (show_enabled != null) {
            stmt.bindLong(9, show_enabled ? 1L: 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Article readEntity(Cursor cursor, int offset) {
        Article entity = new Article( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), //  ariticle_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // category
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // text_comment
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // img_link_server
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // img_link_local
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // week_id
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // weblink
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0 // show_enabled
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Article entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.set Ariticle_id(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setCategory(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setText_comment(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImg_link_server(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setImg_link_local(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setWeek_id(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setWeblink(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setShow_enabled(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Article entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Article entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Article entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}