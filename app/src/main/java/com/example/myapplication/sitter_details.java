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

public class sitter_details extends AppCompatActivity implements View.OnClickListener {
    private Button cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitter_details);


        cont = (Button) findViewById(R.id.continue_button);

        cont.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), sitter_selection1.class);
        startActivity(intent);
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.continue_button) {
            Intent intent = new Intent(sitter_details.this, Sitters_near_me.class);
            startActivity(intent);
        }
    }
}
