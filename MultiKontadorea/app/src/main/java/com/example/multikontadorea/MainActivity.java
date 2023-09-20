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
                KontagailuBat.setText(Integer.toString(kontadorea1));
                KontagailuBi.setText(Integer.toString(kontadorea2));
                KontagailuHiru.setText(Integer.toString(kontadorea3));
                KontagailuLau.setText(Integer.toString(kontadorea4));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        ResetBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBat.setText(Integer.toString(kontadorea1));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        ResetBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea2 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBi.setText(Integer.toString(kontadorea2));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        ResetHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea3 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuHiru.setText(Integer.toString(kontadorea3));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        ResetLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea4 = 0;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuLau.setText(Integer.toString(kontadorea4));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        GehituBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBat.setText(Integer.toString(kontadorea1));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        GehituBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea2++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuBi.setText(Integer.toString(kontadorea2));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        GehituHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea3++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuHiru.setText(Integer.toString(kontadorea3));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });

        GehituLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea4++;
                kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;
                KontagailuLau.setText(Integer.toString(kontadorea4));
                KontagailuOrokorra.setText(Integer.toString(kontadoreOrokorra));
            }
        });
    }
}