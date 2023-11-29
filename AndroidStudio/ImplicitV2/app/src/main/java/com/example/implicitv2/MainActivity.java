package com.example.implicitv2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    // Define the variables which will be used
    TextInputEditText websiteInput, locationInput, textInput;
    Button websiteButton, locationButton, textButton, photoButton;
    ImageView photoImageView;

    ActivityResultLauncher<Intent> takePictureLauncher;

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
        photoButton = findViewById(R.id.photoButton);

        photoImageView = findViewById(R.id.photoImageView);

        // Initialize ActivityResultLauncher
        takePictureLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        if (data != null) {
                            Bundle extras = data.getExtras();
                            if (extras != null) {
                                Bitmap imageBitmap = (Bitmap) extras.get("data");
                                photoImageView.setImageBitmap(imageBitmap);
                            }
                        }
                    }
                }
        );

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

        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                takePictureLauncher.launch(takePictureIntent);
            }
        });
    }
}