package com.example.myapplication;

import android.app.ActionBar;
import android.view.MenuItem;
import androidx.core.app.NavUtils;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.drm.DrmStore;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Searching_for extends AppCompatActivity implements View.OnClickListener {
    private Button sitter_search;
    private Button pet_search;
    private Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching_for);

        sitter_search = (Button) findViewById(R.id.search_sitter);
        pet_search = (Button) findViewById(R.id.search_pet);
        settings = (Button) findViewById(R.id.settings);

        sitter_search.setOnClickListener(this);
        pet_search.setOnClickListener(this);
        settings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.search_sitter) {
            Intent intent = new Intent(Searching_for.this, sitter_selection1.class);
            startActivity(intent);
        } else if (v.getId() == R.id.search_pet) {
            Intent intent = new Intent(Searching_for.this, pet_selection.class);
            startActivity(intent);
        } else if (v.getId() == R.id.settings) {
            Intent intent = new Intent(this, AccountPage.class);
            startActivity(intent);
        }
    }
}
