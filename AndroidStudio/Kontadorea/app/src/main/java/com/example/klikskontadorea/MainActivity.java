package com.example.klikskontadorea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int kontagailua;
    TextView klikkontagailua;
    Button handitukontagailua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klikkontagailua = findViewById(R.id.klikkontagailua);
        handitukontagailua = findViewById(R.id.handitukontagailua);

        handitukontagailua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontagailua++;
                klikkontagailua.setText(kontagailua + " aldiz klikatu duzu botoia.");
            }
        });
    }
}