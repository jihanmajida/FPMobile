package com.example.kantinku.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface KantinDao {
    @Query("SELECT *FROM kantinku")
    List<KantinKu> getAll();

    @Query("SELECT *FROM kantinku WHERE nama LIKE :nama")
    KantinKu findByName (String nama);

    @Insert
    void insertAll (KantinKu kantinku);

    @Delete
    public void deleteUsers (KantinKu users);

    @Update
    public void update (KantinKu kantinKu);

    @Delete
    public void deleteAll (KantinKu user1, KantinKu user2);
}
