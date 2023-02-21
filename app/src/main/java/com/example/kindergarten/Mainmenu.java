package com.example.kindergarten;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;


import androidx.appcompat.app.AppCompatActivity;

public class Mainmenu extends AppCompatActivity {

    VideoView videoview;
    ImageView alphabaticactivity,numericactivity,birdsactivity,coloractivity,shapesactivity,animalsactivity,rhymesactivity,barakhadiactivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        getSupportActionBar().hide();

        alphabaticactivity=findViewById(R.id.alphabaticactivity);
        numericactivity=findViewById(R.id.numericactivity);
        birdsactivity=findViewById(R.id.birdsactivity);
        coloractivity=findViewById(R.id.coloractivity);
        shapesactivity=findViewById(R.id.shapesactivity);
        animalsactivity=findViewById(R.id.animalsactivity);
        rhymesactivity=findViewById(R.id.rhymesactivity);
        barakhadiactivity=findViewById(R.id.barakhadiactivity);

        videoview = findViewById(R.id.videoview);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bgvideo);
        videoview.setVideoURI(uri);
        videoview.start();

        alphabaticactivity.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       openAlphabates();
    }
});
        numericactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumeric();
            }
        });
        shapesactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapes();
            }
        });
        animalsactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnimals();
            }
        });
        birdsactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBirds();
            }
        });
        barakhadiactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBarakhadi();
            }
        });
        coloractivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColours();
            }
        });
        rhymesactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRhymes();
            }
        });
    videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }

    private void openRhymes() {
        Intent mainIntent = new Intent(this, Rhymes.class);

        startActivity(mainIntent);
    }

    private void openAnimals() {
        Intent mainIntent = new Intent(this, Animals.class);

        startActivity(mainIntent);
    }

    private void openBirds() {
        Intent mainIntent = new Intent(this, Birds.class);

        startActivity(mainIntent);
    }

    private void openColours() {
        Intent mainIntent = new Intent(this, Colours.class);

        startActivity(mainIntent);
    }

    private void openBarakhadi() {
        Intent mainIntent = new Intent(this, Barakhadi.class);

        startActivity(mainIntent);
    }

    private void openShapes() {
        Intent mainIntent = new Intent(this, Shapes.class);

        startActivity(mainIntent);

    }

    private void openNumeric() {
        Intent mainIntent = new Intent(this, Number.class);

        startActivity(mainIntent);
    }

    public void openAlphabates(){
        Intent mainIntent = new Intent(this, Alphabates.class);

        startActivity(mainIntent);
    }

    @Override
    protected void onResume() {
        videoview.resume();
        super.onResume();
    }

    @Override
    protected void onRestart() {
        videoview.start();
        super.onRestart();
    }

    @Override
    protected void onPause() {
        videoview.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        videoview.stopPlayback();
        super.onDestroy();
    }
}