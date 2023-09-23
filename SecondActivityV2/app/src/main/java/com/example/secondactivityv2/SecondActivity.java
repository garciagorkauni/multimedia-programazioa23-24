package com.example.secondactivityv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class SecondActivity extends AppCompatActivity {

    TextInputEditText replyInput;
    Button sendButton;
    TextView messageText, tittleMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        replyInput = findViewById(R.id.replyInput);
        sendButton = findViewById(R.id.sendButton);
        messageText = findViewById(R.id.messageText);
        tittleMessage = findViewById(R.id.tittleMessage);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        messageText.setText(message);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("message", replyInput.getText().toString());
                startActivity(intent);
            }
        });
    }
}