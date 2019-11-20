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

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        return true;
    }
    public void onClick(View v) {
        if (v.getId() == R.id.login) {
            Intent intent = new Intent(Login.this, Searching_for.class);
            startActivity(intent);
        }
    }
}