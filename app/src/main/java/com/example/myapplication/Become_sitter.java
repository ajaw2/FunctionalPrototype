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

public class Become_sitter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_sitter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), AccountPage.class);
        startActivity(intent);
        return true;
    }
}
