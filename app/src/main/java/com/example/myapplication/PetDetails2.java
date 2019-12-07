package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class PetDetails2 extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout pet_add_detail_Button;
    private ImageButton pet_detail_filter_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details2);
        pet_add_detail_Button = (RelativeLayout) findViewById(R.id.pet_add_detail2);
        pet_add_detail_Button.setOnClickListener(this);

        pet_detail_filter_Button = findViewById(R.id.pet_detail_filter2);
        pet_detail_filter_Button.setOnClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.pet_add_detail2) {
            Intent intent = new Intent(PetDetails2.this, pet_info.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.pet_detail_filter2) {
            Intent intent = new Intent(this, filter2.class);
            startActivity(intent);
        }
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
}
