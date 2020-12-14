package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Starting numbers Activity on click
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
            Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
            startActivity(numbersIntent);
            }
        });

        //Starting colors activity on click
        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //Starring family activity on click
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        //Starting phrases activity on click
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phraseIntent);
            }
        });


    }

}