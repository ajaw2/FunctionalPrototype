package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PetDetails extends AppCompatActivity implements View.OnClickListener{
    private Button pet_add_detail_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details);

        pet_add_detail_Button = (Button) findViewById(R.id.pet_add_detail);
        pet_add_detail_Button.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.pet_add_detail) {
            Intent intent = new Intent(PetDetails.this, pet_info.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), pet_selection.class);
        startActivity(intent);
        return true;
    }
}
