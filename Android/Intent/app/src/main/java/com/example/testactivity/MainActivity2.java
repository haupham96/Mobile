package com.example.testactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.nio.charset.StandardCharsets;

public class MainActivity2 extends AppCompatActivity {

    Button loginBtn;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        loginBtn = findViewById(R.id.btnLogin);

         loginBtn.setOnClickListener(v -> {
             username = findViewById(R.id.etUsername);
             password = findViewById(R.id.etPassword);

             String usernameText = username.getText().toString();
             String passwordText = password.getText().toString();
             Intent intent = new Intent(MainActivity2.this, MainActivity.class);
             intent.putExtra("username", usernameText);
             intent.putExtra("password", passwordText);
             startActivity(intent);
         });
    }
}