package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    // Define the variables which will be used
    TextInputEditText websiteInput, locationInput, textInput;
    Button websiteButton, locationButton, textButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Match the variables with their ids
        websiteInput = findViewById(R.id.websiteInput);
        locationInput = findViewById(R.id.locationInput);
        textInput = findViewById(R.id.textInput);

        websiteButton = findViewById(R.id.websiteButton);
        locationButton = findViewById(R.id.locationButton);
        textButton = findViewById(R.id.textButton);

        Resources resources = getResources();
        String websiteButtonText = resources.getString(R.string.website_button_text);
        websiteButton.setText(websiteButtonText);

        String locationButtonText = resources.getString(R.string.location_button_text);
        locationButton.setText(locationButtonText);

        String textButtonText = resources.getString(R.string.text_button_text);
        textButton.setText(textButtonText);

        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get the url of the site
                Uri web = Uri.parse(websiteInput.getText().toString());

                //Create the intent
                Intent intent = new Intent(Intent.ACTION_VIEW, web);

                // Start the activity
                startActivity(intent);

                /*
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                 */
            }
        });

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get the url of the site
                Uri web = Uri.parse("http://www.google.com/maps/place/" + locationInput.getText().toString());

                //Create the intent
                Intent intent = new Intent(Intent.ACTION_VIEW, web);

                // Start the activity
                startActivity(intent);

                /*
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                 */
            }
        });

        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create the intent
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, textInput.getText().toString());
                intent.setType("text/plain");

                // Start the activity
                Intent prt = Intent.createChooser(intent, null);
                startActivity(prt);
            }
        });
    }
}