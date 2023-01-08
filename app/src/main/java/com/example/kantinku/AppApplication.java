package com.example.kantinku;

import android.app.Application;
import androidx.room.Room;

import com.example.kantinku.room.AppDatabase;

public class AppApplication extends Application {
    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"mahasiswa").allowMainThreadQueries().build();

    }
}
