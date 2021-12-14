package com.example.eventtrakingapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EventDatabase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "events.db";
    private static final int VERSION = 2;


    public EventDatabase (Context context) {

        super(context, DATABASE_NAME, null, VERSION);
    }

    private static final class EventTable {
        private static final String TABLE = "events";
        private static final String COL_ID = "_id";
        private static final String COL_EVENT = "event";
        private static final String COL_DateTime = "date and time";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + EventTable.TABLE + " (" +
                EventTable.COL_ID + " integer primary key autoincrement, " +
                EventTable.COL_EVENT + " text, " +
                EventTable.COL_DateTime +  " text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("drop table if EXISTS " + EventTable.TABLE);
        onCreate(db);
    }

    public long addEvent() {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(EventTable.COL_EVENT, "Wedding");
        values.put(EventTable.COL_DateTime, "Saturday, December 18th, 2021");

        long eventId = db.insert(EventTable.TABLE, null, values);
        return eventId;
    }

    public boolean deleteMovie(long id) {
        SQLiteDatabase db = getWritableDatabase();
        int rowsDeleted = db.delete(EventTable.TABLE, EventTable.COL_ID + " = ?",
                new String[] { Long.toString(id) });
        return rowsDeleted > 0;
    }
}
