package com.example.testactivity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.testactivity.adapter.GridAdapter;

public class GridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        android.widget.GridView gridView = findViewById(R.id.gridview);
        gridView.setAdapter(new GridAdapter(this));
        gridView.setNumColumns(3);

        gridView.setOnItemClickListener((parent, view, index, id) -> {
            Toast.makeText(GridView.this, "You clicked index: " + index + " / id=" + id, Toast.LENGTH_LONG).show();
        });
    }
}