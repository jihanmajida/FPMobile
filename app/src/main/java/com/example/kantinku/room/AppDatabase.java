package com.example.kantinku.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {KantinKu.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract KantinDao userDao();
    public static AppDatabase INSTANCE;

    //check db
    public static  AppDatabase getDbInstance(Context context) {
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "my_database.db")
                    .allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
}

