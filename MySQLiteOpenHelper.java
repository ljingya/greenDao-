package com.greendao.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.greendao.db.green.DaoMaster;
import com.greendao.db.green.UserDao;

import org.greenrobot.greendao.database.Database;


public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
    public MySQLiteOpenHelper(Context context, String name) {
        super(context, name);
    }

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        MigrationHelper.getInstance().migrate(db, UserDao.class);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}
