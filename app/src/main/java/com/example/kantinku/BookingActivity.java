package com.example.kantinku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
    }

    public void OpenPayment(View view) {
        if (view.getId() == R.id.btnPayMent) {
            Intent moveIntent = new Intent(BookingActivity.this, PaymentActivity.class);
            startActivity(moveIntent);
        }
    }
}