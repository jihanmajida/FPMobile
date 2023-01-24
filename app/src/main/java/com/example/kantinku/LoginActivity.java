package com.example.kantinku;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kantinku.room.AppDatabase;
import com.example.kantinku.room.KantinKu;

import java.io.Serializable;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText etMail2;
    private EditText etPass2;

    AppDatabase db;
    KantinKu kantinKu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
        etMail2 = findViewById(R.id.etMail2);
        etPass2 = findViewById(R.id.etPass2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etMail2.getText().toString().trim();
                String password = etPass2.getText().toString().trim();

                db = AppDatabase.getDbInstance(getApplicationContext());
                List<KantinKu> list_pengguna = db.userDao().getAll();


                    kantinKu = db.userDao().kantinKu(email, password);
                    if (kantinKu != null) {
                        Intent home = new Intent(LoginActivity.this, HomeActivity.class);
                        home.putExtra("Pengguna", String.valueOf(kantinKu));
                        startActivity(home);
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Something Happend", Toast.LENGTH_SHORT).show();
                    }
            }
        });

    }


}