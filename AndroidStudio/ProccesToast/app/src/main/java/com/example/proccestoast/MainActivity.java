package com.example.proccestoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast("Activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();

        showToast("Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showToast("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showToast("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showToast("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("Activity destroyed");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
