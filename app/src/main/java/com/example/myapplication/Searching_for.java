package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Searching_for extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching_for);
    }

    public void search_pet(View view)
    {
        Intent intent = new Intent(this, pet_selection.class);
        startActivity(intent);
    }

    public void search_sitter(View view)
    {
        Intent intent = new Intent(this, sitter_selection1.class);
        startActivity(intent);
    }
}
