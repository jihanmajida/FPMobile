package com.example.kantinku.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

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
