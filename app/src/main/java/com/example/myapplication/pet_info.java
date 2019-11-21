package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class pet_info extends AppCompatActivity implements View.OnClickListener {
    private Button contact_owner_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_info);

        contact_owner_Button = (Button) findViewById(R.id.contact_owner);
        contact_owner_Button.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.contact_owner) {
            Intent intent = new Intent(pet_info.this, message.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), PetDetails.class);
        startActivity(intent);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
