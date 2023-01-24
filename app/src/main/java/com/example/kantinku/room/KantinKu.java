package com.example.kantinku.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "user")
public class KantinKu {

    @PrimaryKey (autoGenerate = true)
    @NonNull
    int id;
    @ColumnInfo (name = "nama")
    String nama;
    @ColumnInfo (name = "noHp")
    String noHp;
    @ColumnInfo (name = "eMail")
    String eMail;
    @ColumnInfo (name = "password")
    String password;
    @ColumnInfo (name = "konfirm")
    String konfirm;
    @ColumnInfo (name = "jumlah")
    int jumlah;
    @ColumnInfo (name = "meja")
    String meja;
    @ColumnInfo(name = "note")
    String note;


    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNoHp() {
        return noHp;
    }
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getPass() {
        return password;
    }
    public void setPass(String pass) {
        this.password = pass;
    }
    public String getKonfirm() {
        return konfirm;
    }
    public void setKonfirm(String konfirm) {
        this.konfirm = konfirm;
    }
    public Integer getJumlah() {
        return jumlah;
    }
    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
    public String getMeja() {
        return meja;
    }
    public void setMeja(String meja) {
        this.meja = meja;
    }
    public String getNote() {
        return note;
    }
    public void setNote (String note) {
        this.note = note;
    }
}
