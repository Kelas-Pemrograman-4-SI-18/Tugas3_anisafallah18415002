package com.anisanurulfallah.aplikasipenjualanperabot.users;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.anisanurulfallah.aplikasipenjualanperabot.R;
import com.ornach.nobobutton.NoboButton;

public class RegistrasiActivity extends AppCompatActivity {

    NoboButton btnRegistrasi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        getSupportActionBar().hide();

        btnRegistrasi = (NoboButton) findViewById(R.id.btnpindah);

        btnRegistrasi .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}