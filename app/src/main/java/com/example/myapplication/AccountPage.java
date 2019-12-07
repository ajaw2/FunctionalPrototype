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

public class AccountPage extends AppCompatActivity implements View.OnClickListener {
    private Button become_sitter;
    private Button go_to_history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page);

        become_sitter = (Button) findViewById(R.id.become_sitter);
        become_sitter.setOnClickListener(this);

        go_to_history = (Button) findViewById(R.id.go_to_history);
        go_to_history.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.become_sitter) {
            Intent intent = new Intent(this, Become_sitter.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.go_to_history) {
            Intent intent = new Intent(this, History.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return true;
    }
}
