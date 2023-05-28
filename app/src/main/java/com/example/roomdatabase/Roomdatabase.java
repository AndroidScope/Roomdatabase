package com.example.roomdatabase;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
@Database(entities = {Person.class,Person2.class},version = 2,exportSchema = false)
abstract class  Roomdatabase extends RoomDatabase {
    private static Roomdatabase database;
    public abstract Data Data();
    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE IF NOT EXISTS 'Person2' (  `user_id` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL);");
        }
    };

    static Roomdatabase get(Context con) {
        if (database == null) {
            database = Room.databaseBuilder(con, Roomdatabase.class, "health")
                    .addCallback(new RoomDatabase.Callback() {
                        @Override
                        public void onOpen(@NonNull SupportSQLiteDatabase db) {
                            super.onOpen(db);
                        }
                    })
                    .allowMainThreadQueries()
                    .addMigrations(MIGRATION_1_2)
                    .build();
        }
        return database;
    }
}
