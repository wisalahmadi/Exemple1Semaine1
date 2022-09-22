package com.example.exercice2semaine4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AffichageActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);
        Intent deuxiemeIntent = getIntent();

        String message = deuxiemeIntent.getStringExtra("HELLO_MESSAGE");

        TextView nom = (TextView)findViewById(R.id.tv_nom);

        nom.setText(message);

    }
}