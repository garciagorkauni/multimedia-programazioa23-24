package com.example.multikontadorea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView KontagailuOrokorra, KontagailuBat, KontagailuBi, KontagailuHiru, KontagailuLau;

    Button ResetOrokorra, ResetBat, ResetBi, ResetHiru, ResetLau;
    Button GehituBat, GehituBi, GehituHiru, GehituLau;


    int kontadorea1;
    int kontadorea2;
    int kontadorea3;
    int kontadorea4;
    int kontadoreOrokorra;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key", "value");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Kontagailuak
        KontagailuOrokorra = findViewById(R.id.KontagailuOrokorra);
        KontagailuBat = findViewById(R.id.KontagailuBat);
        KontagailuBi = findViewById(R.id.KontagailuBi);
        KontagailuHiru = findViewById(R.id.KontagailuHiru);
        KontagailuLau = findViewById(R.id.KontagailuLau);

        // Reset botoiak
        ResetOrokorra = findViewById(R.id.ResetOrokorra);
        ResetBat = findViewById(R.id.ResetBat);
        ResetBi = findViewById(R.id.ResetBi);
        ResetHiru = findViewById(R.id.ResetHiru);
        ResetLau = findViewById(R.id.ResetLau);

        // Gehitzeko botoiak
        GehituBat = findViewById(R.id.GehituBat);
        GehituBi = findViewById(R.id.GehituBi);
        GehituHiru = findViewById(R.id.GehituHiru);
        GehituLau = findViewById(R.id.GehituLau);

        ResetOrokorra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1 = 0;
                kontadorea2 = 0;
                kontadorea3 = 0;
                kontadorea4 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBat.setText(kontadorea1);
                KontagailuBi.setText(kontadorea2);
                KontagailuHiru.setText(kontadorea3);
                KontagailuLau.setText(kontadorea4);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        ResetBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBat.setText(kontadorea1);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        ResetBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea2 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBi.setText(kontadorea2);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        ResetHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea3 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuHiru.setText(kontadorea3);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        ResetLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea4 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuLau.setText(kontadorea4);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        GehituBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBat.setText(kontadorea1);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        GehituBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea2++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBi.setText(kontadorea2);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        GehituHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea3++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuHiru.setText(kontadorea3);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        GehituLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea4++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuLau.setText(kontadorea4);
                KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String savedValue = savedInstanceState.getString("key");
    }
}