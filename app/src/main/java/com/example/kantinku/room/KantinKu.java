package com.example.kantinku.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class KantinKu {

    @PrimaryKey (autoGenerate = true)
    int id;
    @ColumnInfo (name = "nama")
    String nama;
    @ColumnInfo (name = "noHp")
    String noHp;
    @ColumnInfo (name = "email")
    String eMail;
    @ColumnInfo (name = "pass")
    String pass;

    public int getId(){
        return id;
    }
    public void setId(int id) { this.id = id;}
    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}
    public String getNoHp() {return noHp;}
    public void setNoHp(String noHp) {this.noHp = noHp;}
    public String geteMail() {return eMail;}
    public void seteMail(String eMail) {this.eMail = eMail;}
    public String getPass() {return pass;}
    public void setPass(String pass) {this.pass = pass;}
}
