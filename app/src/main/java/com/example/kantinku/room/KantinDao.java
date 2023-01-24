package com.example.kantinku.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.io.Serializable;
import java.util.List;

@Dao
public interface KantinDao {
    @Query("SELECT *FROM user")
    List<KantinKu> getAll();

    @Query("SELECT *FROM user  WHERE eMail LIKE :email and password = :password")
    KantinKu kantinKu(String email, String password);

    @Insert
    void insertAll (KantinKu kantinku);

    @Delete
    public void deleteUsers (KantinKu users);

    @Update
    public void update (KantinKu kantinKu);

    @Delete
    public void deleteAll (KantinKu user1, KantinKu user2);

}
