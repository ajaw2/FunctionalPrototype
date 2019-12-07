package com.example.myapplication;

import android.app.ActionBar;
import android.view.Menu;
import android.os.Build;
import android.view.MenuItem;

import androidx.annotation.RequiresApi;
import androidx.core.app.NavUtils;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.drm.DrmStore;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SittersNearMe2 extends AppCompatActivity implements View.OnClickListener{
    private ImageButton sitterFilter;
    private Button sitter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitters_near_me2);

        sitterFilter = (ImageButton) findViewById(R.id.sitter_filter2);
        sitterFilter.setOnClickListener(this);

        sitter = (Button) findViewById(R.id.Image_imp2);
        sitter.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.settings_mini){
            Intent intent = new Intent(this, AccountPage.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(getApplicationContext(), Searching_for.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Image_imp2) {
            Intent intent = new Intent(this, ContactSitter.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.sitter_filter2) {
            Intent intent = new Intent(this, Filter.class);
            startActivity(intent);
        }
    }
}
