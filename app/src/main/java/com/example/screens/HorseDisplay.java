package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class HorseDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horse_display);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int number = extras.getInt("number");

            TextView nameOnHorse = findViewById(R.id.horseName);
            nameOnHorse.setText("Namn: "+name);

            TextView numberOnHorse = findViewById(R.id.horseNumber);
            numberOnHorse.setText("Nummer: "+number);
        }
    }
}