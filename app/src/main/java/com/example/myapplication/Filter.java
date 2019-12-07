package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import static com.example.myapplication.R.id.seekbarText;

public class Filter extends AppCompatActivity{
    private Button sitterFilter;
    private Button ageButton1;
    private Button ageButton2;
    private Button ageButton3;
    private Button dogButton;
    private Button catButton;
    private Button otherButton;
    boolean dogButtonClicked=false;
    boolean catButtonClicked=false;
    boolean otherButtonClicked=false;
    private Button sizeButton1;
    private Button sizeButton2;
    private Button sizeButton3;
    private Button sizeButton4;
    boolean sizeButton1Clicked=false;
    boolean sizeButton2Clicked=false;
    boolean sizeButton3Clicked=false;
    boolean sizeButton4Clicked=false;
    private Button applyButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ageButton1= (Button) findViewById(R.id.pet_age1);
        ageButton2=(Button) findViewById(R.id.pet_age2);
        ageButton3=(Button) findViewById(R.id.pet_age3);
        dogButton=(Button) findViewById(R.id.btn_dog);
        catButton=(Button) findViewById(R.id.btn_cat);
        otherButton=(Button) findViewById(R.id.btn_other);
        sizeButton1=(Button) findViewById(R.id.button_size1);
        sizeButton2=(Button) findViewById(R.id.button_size2);
        sizeButton3=(Button) findViewById(R.id.button_size3);
        sizeButton4=(Button) findViewById(R.id.button_size4);
        applyButton = (Button) findViewById(R.id.applyButton);


        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Filter.this, SittersNearMe2.class);
                startActivity(intent);
            }
        });

        ageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ageButton1.setSelected(true);
                ageButton2.setSelected(false);
                ageButton3.setSelected(false);
            }//onClick
        });

        ageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ageButton2.setSelected(true);
                ageButton1.setSelected(false);
                ageButton3.setSelected(false);
            }//onClick
        });

        ageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ageButton3.setSelected(true);
                ageButton1.setSelected(false);
                ageButton2.setSelected(false);
            }//onClick
        });

        dogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dogButtonClicked==false){
                    dogButtonClicked=true;
                    dogButton.setSelected(true);
                }
                else{
                    dogButtonClicked=false;
                    dogButton.setSelected(false);
                }
            }//onClick
        });

        catButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (catButtonClicked==false){
                    catButtonClicked=true;
                    catButton.setSelected(true);
                }
                else{
                    catButtonClicked=false;
                    catButton.setSelected(false);
                }
            }//onClick
        });

        otherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (otherButtonClicked==false){
                    otherButtonClicked=true;
                    otherButton.setSelected(true);
                }
                else{
                    otherButtonClicked=false;
                    otherButton.setSelected(false);
                }
            }//onClick
        });

        sizeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sizeButton1Clicked==false){
                    sizeButton1Clicked=true;
                    sizeButton1.setSelected(true);
                }
                else{
                    sizeButton1Clicked=false;
                    sizeButton1.setSelected(false);
                }
            }//onClick
        });

        sizeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sizeButton2Clicked==false){
                    sizeButton2Clicked=true;
                    sizeButton2.setSelected(true);
                }
                else{
                    sizeButton2Clicked=false;
                    sizeButton2.setSelected(false);
                }
            }//onClick
        });

        sizeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sizeButton3Clicked==false){
                    sizeButton3Clicked=true;
                    sizeButton3.setSelected(true);
                }
                else{
                    sizeButton3Clicked=false;
                    sizeButton3.setSelected(false);
                }
            }//onClick
        });

        sizeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sizeButton4Clicked==false){
                    sizeButton4Clicked=true;
                    sizeButton4.setSelected(true);
                }
                else{
                    sizeButton4Clicked=false;
                    sizeButton4.setSelected(false);
                }
            }//onClick
        });

        SeekBar sk = (SeekBar) findViewById(R.id.seekBar);
        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView t=(TextView)findViewById(R.id.seekbarText);
                t.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
