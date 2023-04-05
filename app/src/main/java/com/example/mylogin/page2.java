package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    private TextView email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
         email = findViewById(R.id.email);
         password = findViewById(R.id.password);
         String sEmail = getIntent().getStringExtra("keyEmail");
         String sPassword = getIntent().getStringExtra("keyPassword");
         email.setText(sEmail);
         password.setText(sPassword);
    }
}