package com.example.kantinku.room;

import android.arch.persistence.room.Database;

@Database(entities = {KantinKu.class}, version =1)
public abstract class AppDatabase {
    public abstract KantinDao userDao();
}
