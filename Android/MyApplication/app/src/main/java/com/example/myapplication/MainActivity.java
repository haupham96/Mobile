package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground));
        setSupportActionBar(toolbar);
        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuSetting) {
            Toast.makeText(this, "Menu Setting", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.menuShare) {
            Toast.makeText(this, "Menu Share", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.menuSearch) {
            Toast.makeText(this, "Menu Search", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.menuEdit) {
            Toast.makeText(this, "Menu Edit", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Unknow Menu", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}