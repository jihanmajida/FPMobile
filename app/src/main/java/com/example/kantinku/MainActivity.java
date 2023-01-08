package com.example.kantinku;

import static com.example.kantinku.AppApplication.db;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kantinku.room.KantinKu;

public class MainActivity extends AppCompatActivity {
    private Button btnRegis;
    private EditText etNama, etNoHp, etMail, etPass, etKonfirm;
    KantinKu kantinKu;

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
                if (!etNama.getText().toString().isEmpty()&&!etPass.getText().toString().isEmpty()&&
                !etMail.getText().toString().isEmpty()&&!etNoHp.getText().toString().isEmpty()&&!etKonfirm.getText().toString().isEmpty()) {

                    kantinKu = new KantinKu();
                    kantinKu.setNama(etNama.getText().toString());
                    kantinKu.seteMail(etMail.getText().toString());
                    kantinKu.setPass(etPass.getText().toString());
                    kantinKu.setNoHp(etNoHp.getText().toString());
                    kantinKu.setKonfirm(etKonfirm.getText().toString());

                    db.userDao().insertAll(kantinKu);
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "Mohon masukkan dengan benar", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


//    public void OpenHome(View view) {
//        if (view.getId() == R.id.imgbtnHome) {
//            Intent moveIntent = new Intent(MainActivity.this, HomeActivity.class);
//            startActivity(moveIntent);
//        }
//    }


//    public void OpenPayment(View view) {
//        if (view.getId() == R.id.imgbtnPayment) {
//            Intent moveIntent = new Intent(MainActivity.this, PaymentActivity.class);
//            startActivity(moveIntent);
//        }
//    }

//    public void OpenProfile(View view) {
//        if (view.getId() == R.id.imgbtnprofile) {
//            Intent moveIntent = new Intent(MainActivity.this, PaymentActivity.class);
//            startActivity(moveIntent);
//        }
//    }

}