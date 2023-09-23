package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView messageText, tittleText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        messageText = findViewById(R.id.messageText);
        tittleText = findViewById(R.id.tittleText);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        messageText.setText(message);
    }
}