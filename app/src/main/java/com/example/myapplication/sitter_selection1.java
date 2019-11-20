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

public class sitter_selection1 extends AppCompatActivity implements View.OnClickListener {
    private Button continue_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitter_selection1);

        continue_button = (Button) findViewById(R.id.continue_button);
        continue_button.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), sitter_detials.class);
        startActivity(intent);
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.continue_button) {
            Intent intent = new Intent(this, sitter_detials.class);
            startActivity(intent);
        }
    }

}
