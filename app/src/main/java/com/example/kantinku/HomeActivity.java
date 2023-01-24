package com.example.kantinku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent home = getIntent();

        bottomNavigationView = findViewById(R.id.bottomnav);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    setContentView(R.layout.fragment_home);

                    break;
                case R.id.booking:
                    setContentView(R.layout.fragment_booking);
                    break;
                case R.id.payment:
                    setContentView(R.layout.fragment_payment);
                    break;
                case R.id.profile:
                    setContentView(R.layout.fragment_profile);
                    break;
            }

            return true;
        });
    }

    public void OpenHome(View view) {
        if (view.getId() == R.id.btnBooking) {
            Intent moveIntent = new Intent(HomeActivity.this, BookingActivity.class);
            startActivity(moveIntent);
        }
    }

}
