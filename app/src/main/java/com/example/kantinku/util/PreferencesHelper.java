package com.example.kantinku.util;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferencesHelper(Context context){
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("com.example.myapplication", Context.MODE_PRIVATE);
    }

    public static PreferencesHelper getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PreferencesHelper(context);
        }
        return INSTANCE;
    }

    public SharedPreferences preferences() {
        return sharedPreferences;
    }

    public void setLogin(boolean islogin){
        sharedPreferences.edit().putBoolean("isLogin", islogin).apply();
    }

    public Boolean isLogin() {
        return sharedPreferences.getBoolean("isLogin", false);
    }

    public void setNama(String nama) {
        sharedPreferences.edit().putString("nama", nama).apply();
    }

    public void setMail(String mail) {sharedPreferences.edit().putString("mail", mail).apply();}

    public String getNama() {
        return sharedPreferences.getString("nama", "Jhon Doe");
    }

    public String getMail() { return sharedPreferences.getString("mail", "suhajiihan@students.amikom.ac.id");
    }
}
