package com.example.secondactivityv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText messageInput;
    Button sendButton;
    TextView replyText, tittleReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageInput = findViewById(R.id.replyInput);
        sendButton = findViewById(R.id.sendButton);
        replyText = findViewById(R.id.messageText);
        tittleReply = findViewById(R.id.tittleMessage);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        replyText.setText(message);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("message", messageInput.getText().toString());
                startActivity(intent);
            }
        });
    }
}