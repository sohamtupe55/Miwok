package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView familyMembers=findViewById(R.id.family);
        familyMembers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        TextView colors=findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent colorsIntent=new Intent(getApplicationContext(),ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
        TextView phrases=findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent phrasesIntent=new Intent(getApplicationContext(),PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

}