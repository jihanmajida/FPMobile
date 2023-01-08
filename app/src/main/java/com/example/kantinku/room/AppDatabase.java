package com.example.kantinku.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {KantinKu.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract KantinDao userDao();
}

