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

    public ImageView arms, eyes, eyebrows, mouth, hat, moustache, ears, shoes, glasses, nose;
    boolean outstateMade = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        if (savedInstanceState != null) {
            int visibilityArmsRestored = savedInstanceState.getInt("arms");
            int visibilityMouthRestored = savedInstanceState.getInt("mouth");
            int visibilityHatRestored = savedInstanceState.getInt("hat");
            int visibilityEyebrowsRestored = savedInstanceState.getInt("eyebrows");
            int visibilityMoustacheRestored = savedInstanceState.getInt("moustache");
            int visibilityEarsRestored = savedInstanceState.getInt("ears");
            int visibilityShoesRestored = savedInstanceState.getInt("shoes");
            int visibilityGlassesRestored = savedInstanceState.getInt("glasses");
            int visibilityNoseRestored = savedInstanceState.getInt("nose");
            int visibilityEyesRestored = savedInstanceState.getInt("eyes");

            if (visibilityArmsRestored == View.VISIBLE)
                arms.setVisibility(View.VISIBLE);
            else
                arms.setVisibility(View.INVISIBLE);

            if (visibilityMouthRestored == View.VISIBLE)
                mouth.setVisibility(View.VISIBLE);
            else
                mouth.setVisibility(View.INVISIBLE);

            if (visibilityHatRestored == View.VISIBLE)
                hat.setVisibility(View.VISIBLE);
            else
                hat.setVisibility(View.INVISIBLE);

            if (visibilityEyebrowsRestored == View.VISIBLE)
                eyebrows.setVisibility(View.VISIBLE);
            else
                eyebrows.setVisibility(View.INVISIBLE);

            if (visibilityMoustacheRestored == View.VISIBLE)
                moustache.setVisibility(View.VISIBLE);
            else
                moustache.setVisibility(View.INVISIBLE);

            if (visibilityEarsRestored == View.VISIBLE)
                ears.setVisibility(View.VISIBLE);
            else
                ears.setVisibility(View.INVISIBLE);

            if (visibilityShoesRestored == View.VISIBLE)
                shoes.setVisibility(View.VISIBLE);
            else
                shoes.setVisibility(View.INVISIBLE);

            if (visibilityGlassesRestored == View.VISIBLE)
                glasses.setVisibility(View.VISIBLE);
            else
                glasses.setVisibility(View.INVISIBLE);

            if (visibilityNoseRestored == View.VISIBLE)
                nose.setVisibility(View.VISIBLE);
            else
                nose.setVisibility(View.INVISIBLE);

            if (visibilityEyesRestored == View.VISIBLE)
                eyes.setVisibility(View.VISIBLE);
            else
                eyes.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

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

        int VisibilityArms = arms.getVisibility();
        int VisibilityEyebrows = eyebrows.getVisibility();
        int VisibilityMouth = mouth.getVisibility();
        int VisibilityHat = hat.getVisibility();
        int VisibilityMoustache = moustache.getVisibility();
        int VisibilityEars = ears.getVisibility();
        int VisibilityShoes = shoes.getVisibility();
        int VisibilityGlasses = glasses.getVisibility();
        int VisibilityNose = nose.getVisibility();
        int VisibilityEyes = eyes.getVisibility();

        outState.putInt("arms", VisibilityArms);
        outState.putInt("eyebrows", VisibilityEyebrows);
        outState.putInt("mouth", VisibilityMouth);
        outState.putInt("hat", VisibilityHat);
        outState.putInt("moustache", VisibilityMoustache);
        outState.putInt("ears", VisibilityEars);
        outState.putInt("shoes", VisibilityShoes);
        outState.putInt("glasses", VisibilityGlasses);
        outState.putInt("nose", VisibilityNose);
        outState.putInt("eyes", VisibilityEyes);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked");
        CheckBox checkbox = (CheckBox) v;
        String textcheck = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();

        switch(textcheck) {
            case "arms":
                ImageView arms = (ImageView) findViewById(R.id.arms);
                if (checked) {
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case "eyes":
                ImageView eyes = (ImageView) findViewById(R.id.eyes);
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case "eyebrows":
                ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case "mouth":
                ImageView mouth = (ImageView) findViewById(R.id.mouth);
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case "hat":
                ImageView hat = (ImageView) findViewById(R.id.hat);
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case "moustache":
                ImageView moustache = (ImageView) findViewById(R.id.moustache);
                if (checked) {
                    moustache.setVisibility(View.VISIBLE);
                }
                else {
                    moustache.setVisibility(View.INVISIBLE);
                }
                break;
            case "ears":
                ImageView ears = (ImageView) findViewById(R.id.ears);
                if (checked) {
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case "shoes":
                ImageView shoes = (ImageView) findViewById(R.id.shoes);
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case "glasses":
                ImageView glasses = (ImageView) findViewById(R.id.glasses);
                if (checked) {
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    glasses. setVisibility(View.INVISIBLE);
                }
                break;
            case "nose":
                ImageView nose = (ImageView) findViewById(R.id.nose);
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