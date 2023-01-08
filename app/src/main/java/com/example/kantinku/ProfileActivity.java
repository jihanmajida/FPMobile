package com.example.kantinku;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kantinku.util.PreferencesHelper;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {
    PreferencesHelper preferencesHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        preferencesHelper = PreferencesHelper.getInstance(getApplicationContext());
        TextView tvNama = findViewById(R.id.tvNama);
        TextView tvMail = findViewById(R.id.tvMail);

        tvNama.setText(preferencesHelper.getNama());
        tvMail.setText(preferencesHelper.getMail());
    }
}
