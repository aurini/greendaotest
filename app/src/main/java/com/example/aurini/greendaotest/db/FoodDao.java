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
 * DAO for table "FOOD".
*/
public class FoodDao extends AbstractDao<Food, Long> {

    public static final String TABLENAME = "FOOD";

    /**
     * Properties of entity Food.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Id_server = new Property(1, Long.class, "id_server", false, "ID_SERVER");
        public final static Property  Category_id = new Property(2, Long.class, " category_id", false, " CATEGORY_ID");
        public final static Property  Desc = new Property(3, String.class, " desc", false, " DESC");
        public final static Property Absolute_name = new Property(4, String.class, "absolute_name", false, "ABSOLUTE_NAME");
        public final static Property Unit = new Property(5, String.class, "unit", false, "UNIT");
        public final static Property Increament_value = new Property(6, Float.class, "increament_value", false, "INCREAMENT_VALUE");
        public final static Property Cal_per_unit_curb = new Property(7, Float.class, "cal_per_unit_curb", false, "CAL_PER_UNIT_CURB");
        public final static Property Cal_per_unit_protien = new Property(8, Float.class, "cal_per_unit_protien", false, "CAL_PER_UNIT_PROTIEN");
        public final static Property Cal_per_unit_fat = new Property(9, Float.class, "cal_per_unit_fat", false, "CAL_PER_UNIT_FAT");
        public final static Property Cal_per_unit_total; = new Property(10, Float.class, "cal_per_unit_total;", false, "CAL_PER_UNIT_TOTAL;");
    }


    public FoodDao(DaoConfig config) {
        super(config);
    }
    
    public FoodDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FOOD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ID_SERVER\" INTEGER," + // 1: id_server
                "\" CATEGORY_ID\" INTEGER," + // 2:  category_id
                "\" DESC\" TEXT," + // 3:  desc
                "\"ABSOLUTE_NAME\" TEXT," + // 4: absolute_name
                "\"UNIT\" TEXT," + // 5: unit
                "\"INCREAMENT_VALUE\" REAL," + // 6: increament_value
                "\"CAL_PER_UNIT_CURB\" REAL," + // 7: cal_per_unit_curb
                "\"CAL_PER_UNIT_PROTIEN\" REAL," + // 8: cal_per_unit_protien
                "\"CAL_PER_UNIT_FAT\" REAL," + // 9: cal_per_unit_fat
                "\"CAL_PER_UNIT_TOTAL;\" REAL);"); // 10: cal_per_unit_total;
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FOOD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Food entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long id_server = entity.getId_server();
        if (id_server != null) {
            stmt.bindLong(2, id_server);
        }
 
        Long  category_id = entity.get Category_id();
        if ( category_id != null) {
            stmt.bindLong(3,  category_id);
        }
 
        String  desc = entity.get Desc();
        if ( desc != null) {
            stmt.bindString(4,  desc);
        }
 
        String absolute_name = entity.getAbsolute_name();
        if (absolute_name != null) {
            stmt.bindString(5, absolute_name);
        }
 
        String unit = entity.getUnit();
        if (unit != null) {
            stmt.bindString(6, unit);
        }
 
        Float increament_value = entity.getIncreament_value();
        if (increament_value != null) {
            stmt.bindDouble(7, increament_value);
        }
 
        Float cal_per_unit_curb = entity.getCal_per_unit_curb();
        if (cal_per_unit_curb != null) {
            stmt.bindDouble(8, cal_per_unit_curb);
        }
 
        Float cal_per_unit_protien = entity.getCal_per_unit_protien();
        if (cal_per_unit_protien != null) {
            stmt.bindDouble(9, cal_per_unit_protien);
        }
 
        Float cal_per_unit_fat = entity.getCal_per_unit_fat();
        if (cal_per_unit_fat != null) {
            stmt.bindDouble(10, cal_per_unit_fat);
        }
 
        Float cal_per_unit_total; = entity.getCal_per_unit_total;();
        if (cal_per_unit_total; != null) {
            stmt.bindDouble(11, cal_per_unit_total;);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Food entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long id_server = entity.getId_server();
        if (id_server != null) {
            stmt.bindLong(2, id_server);
        }
 
        Long  category_id = entity.get Category_id();
        if ( category_id != null) {
            stmt.bindLong(3,  category_id);
        }
 
        String  desc = entity.get Desc();
        if ( desc != null) {
            stmt.bindString(4,  desc);
        }
 
        String absolute_name = entity.getAbsolute_name();
        if (absolute_name != null) {
            stmt.bindString(5, absolute_name);
        }
 
        String unit = entity.getUnit();
        if (unit != null) {
            stmt.bindString(6, unit);
        }
 
        Float increament_value = entity.getIncreament_value();
        if (increament_value != null) {
            stmt.bindDouble(7, increament_value);
        }
 
        Float cal_per_unit_curb = entity.getCal_per_unit_curb();
        if (cal_per_unit_curb != null) {
            stmt.bindDouble(8, cal_per_unit_curb);
        }
 
        Float cal_per_unit_protien = entity.getCal_per_unit_protien();
        if (cal_per_unit_protien != null) {
            stmt.bindDouble(9, cal_per_unit_protien);
        }
 
        Float cal_per_unit_fat = entity.getCal_per_unit_fat();
        if (cal_per_unit_fat != null) {
            stmt.bindDouble(10, cal_per_unit_fat);
        }
 
        Float cal_per_unit_total; = entity.getCal_per_unit_total;();
        if (cal_per_unit_total; != null) {
            stmt.bindDouble(11, cal_per_unit_total;);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Food readEntity(Cursor cursor, int offset) {
        Food entity = new Food( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // id_server
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), //  category_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), //  desc
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // absolute_name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // unit
            cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6), // increament_value
            cursor.isNull(offset + 7) ? null : cursor.getFloat(offset + 7), // cal_per_unit_curb
            cursor.isNull(offset + 8) ? null : cursor.getFloat(offset + 8), // cal_per_unit_protien
            cursor.isNull(offset + 9) ? null : cursor.getFloat(offset + 9), // cal_per_unit_fat
            cursor.isNull(offset + 10) ? null : cursor.getFloat(offset + 10) // cal_per_unit_total;
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Food entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setId_server(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.set Category_id(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.set Desc(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAbsolute_name(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUnit(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIncreament_value(cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6));
        entity.setCal_per_unit_curb(cursor.isNull(offset + 7) ? null : cursor.getFloat(offset + 7));
        entity.setCal_per_unit_protien(cursor.isNull(offset + 8) ? null : cursor.getFloat(offset + 8));
        entity.setCal_per_unit_fat(cursor.isNull(offset + 9) ? null : cursor.getFloat(offset + 9));
        entity.setCal_per_unit_total;(cursor.isNull(offset + 10) ? null : cursor.getFloat(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Food entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Food entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Food entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
