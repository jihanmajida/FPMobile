package com.example.kantinku;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnRegis;
    private EditText etNama, etNoHp, etMail, etPass, etKonfirm;

    @SuppressLint("MissingInflateID")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegis = findViewById(R.id.btnRegis);
        etNama = findViewById(R.id.etNama);
        etNoHp = findViewById(R.id.etNoHp);
        etMail = findViewById(R.id.etMail);
        etPass = findViewById(R.id.etPass);
        etKonfirm = findViewById(R.id.etkonfirm);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });

    }


    public void OpenHome(View view) {
        if (view.getId() == R.id.imgbtnHome) {
            Intent moveIntent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(moveIntent);
        }
    }


    public void OpenPayment(View view) {
        if (view.getId() == R.id.imgbtnPayment) {
            Intent moveIntent = new Intent(MainActivity.this, PaymentActivity.class);
            startActivity(moveIntent);
        }
    }

    public void OpenProfile(View view) {
        if (view.getId() == R.id.imgbtnprofile) {
            Intent moveIntent = new Intent(MainActivity.this, PaymentActivity.class);
            startActivity(moveIntent);
        }
    }


    public void OpenLogin(View view) {
        if (view.getId() == R.id.btnRegis) {
            Intent moveIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(moveIntent);
        }
    }

}