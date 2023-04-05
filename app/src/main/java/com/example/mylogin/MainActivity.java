package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( validateEmail(email)&& password.getText().toString().equals("admin")) {
                    String inputEmail = email.getText().toString();
                    String inputPassword = password.getText().toString();
                    Intent i = new Intent(MainActivity.this,page2.class);
                    i.putExtra("keyEmail",inputEmail);
                    i.putExtra("keyPassword",inputPassword);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "LOGIN SUCESSFULL", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "UNSUCESSFULL ATTEMPT", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
        private boolean validateEmail(TextView email){
        String emailInput = email.getText().toString();
        if(!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()&&emailInput.equals("admin123@gmail.com")){
            return true;
        }
        else {
            return false;
        }
}
}