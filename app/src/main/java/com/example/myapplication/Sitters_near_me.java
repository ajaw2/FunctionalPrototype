package com.example.myapplication;

import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sitters_near_me extends AppCompatActivity implements View.OnClickListener{
    private Button sitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitters_near_me);

        sitter = (Button) findViewById(R.id.Image);
        sitter.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.settings_mini){
            Intent intent = new Intent(this, AccountPage.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(getApplicationContext(), sitter_details.class);
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
        if (v.getId() == R.id.Image) {
            Intent intent = new Intent(this, ContactSitter.class);
            startActivity(intent);
        }
    }
}
