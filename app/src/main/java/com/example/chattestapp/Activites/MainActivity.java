package com.example.chattestapp.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chattestapp.R;
import com.example.chattestapp.Utils.ChatUtils;

public class MainActivity extends AppCompatActivity {

    EditText et_login_email, et_login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiliatize();
    }

    private void intiliatize() {
        et_login_email = findViewById(R.id.Login_Email);
        et_login_password = findViewById(R.id.Login_Password);
    }

    public void login(View view) {
        ChatUtils.maketoast(getApplicationContext(), "In Progress Yet to implement the functionality");
    }

    public void Register(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}