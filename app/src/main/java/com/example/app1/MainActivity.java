package com.example.app1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    // Create imageview variables
    public ImageView arms, eyes, eyebrows, mouth, hat, moustache, ears, shoes, glasses, nose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find imageviews
        arms = findViewById(R.id.arms);
        eyebrows = findViewById(R.id.eyebrows);
        mouth = findViewById(R.id.mouth);
        hat = findViewById(R.id.hat);
        moustache = findViewById(R.id.moustache);
        ears = findViewById(R.id.ears);
        shoes = findViewById(R.id.shoes);
        glasses = findViewById(R.id.glasses);
        nose = findViewById(R.id.nose);
        eyes = findViewById(R.id.eyes);

        // If the saved instance state is not empty get and set visibility
        if (savedInstanceState != null) {
            arms.setVisibility(savedInstanceState.getInt("arms"));
            mouth.setVisibility(savedInstanceState.getInt("mouth"));
            hat.setVisibility(savedInstanceState.getInt("hat"));
            eyebrows.setVisibility(savedInstanceState.getInt("eyebrows"));
            moustache.setVisibility(savedInstanceState.getInt("moustache"));
            ears.setVisibility(savedInstanceState.getInt("ears"));
            shoes.setVisibility(savedInstanceState.getInt("shoes"));
            glasses.setVisibility(savedInstanceState.getInt("glasses"));
            nose.setVisibility(savedInstanceState.getInt("nose"));
            eyes.setVisibility(savedInstanceState.getInt("eyes"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Put the visibility in the outstate bundle
        outState.putInt("arms", arms.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("moustache", moustache.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
    }

    public void checkClicked(View v) {
        // Print log message if a checkbox is clicked
        Log.d("potato", "checkClicked");

        // Create variables
        CheckBox checkbox = (CheckBox) v;
        String textcheck = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();

        // Change visibility of the image depending on the checkbox
        switch(textcheck) {
            case "arms":
                if (checked) {
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case "eyes":
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case "eyebrows":
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case "mouth":
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case "hat":
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case "moustache":
                if (checked) {
                    moustache.setVisibility(View.VISIBLE);
                }
                else {
                    moustache.setVisibility(View.INVISIBLE);
                }
                break;
            case "ears":
                if (checked) {
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case "shoes":
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case "glasses":
                if (checked) {
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    glasses. setVisibility(View.INVISIBLE);
                }
                break;
            case "nose":
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}