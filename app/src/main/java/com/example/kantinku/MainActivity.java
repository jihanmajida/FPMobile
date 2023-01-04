package com.example.kantinku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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