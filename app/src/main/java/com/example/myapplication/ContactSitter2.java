package com.example.myapplication;


import android.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.core.app.NavUtils;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.drm.DrmStore;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactSitter2 extends AppCompatActivity implements View.OnClickListener{
    private Button fire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_sitter2);
        fire = (Button) findViewById(R.id.fire);
        fire.setOnClickListener(this);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.settings_mini){
            Intent intent = new Intent(this, AccountPage.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(getApplicationContext(), Sitters_near_me.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fire) {
            Intent intent = new Intent(this, ContactSitter.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
