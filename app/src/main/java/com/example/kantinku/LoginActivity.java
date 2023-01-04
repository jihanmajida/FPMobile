package com.example.kantinku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void OpenHome(View view) {
        if (view.getId() == R.id.btnLogin) {
            Intent moveIntent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(moveIntent);
        }
    }
}