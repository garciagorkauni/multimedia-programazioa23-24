package com.example.multikontadorea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int kontadorea1;
    int kontadorea2;
    int kontadorea3;
    int kontadorea4;
    int kontadoreOrokorra = kontadorea1 + kontadorea2 + kontadorea3 + kontadorea4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        binding.ResetOrokorra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1 = 0;
                kontadorea2 = 0;
                kontadorea3 = 0;
                kontadorea4 = 0;
                binding.KontagailuBat.setText(kontadorea1);
                binding.KontagailuBi.setText(kontadorea2);
                binding.KontagailuHiru.setText(kontadorea3);
                binding.KontagailuLau.setText(kontadorea4);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.ResetBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1 = 0;
                binding.KontagailuBat.setText(kontadorea1);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.ResetBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea2 = 0;
                binding.KontagailuBi.setText(kontadorea2);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.ResetHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea3 = 0;
                binding.KontagailuHiru.setText(kontadorea3);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.ResetLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea4 = 0;
                binding.KontagailuLau.setText(kontadorea4);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.GehituBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea1++;
                binding.KontagailuBat.setText(kontadorea1);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.GehituBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea2++;
                binding.KontagailuBi.setText(kontadorea2);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.GehituHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea3++;
                binding.KontagailuHiru.setText(kontadorea3);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });

        binding.GehituLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontadorea4++;
                binding.KontagailuLau.setText(kontadorea4);
                binding.KontagailuOrokorra.setText(kontadoreOrokorra);
            }
        });
    }
}