package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    public static Context context;

    // Media player variables

    public static MediaPlayer sound_alert;
    public static MediaPlayer sound_victory;
    public static MediaPlayer sound_capitalism;
    public static MediaPlayer sound_longtime;
    public static MediaPlayer sound_birdbird;
    public static MediaPlayer sound_fatherspace;
    public static MediaPlayer sound_glassshark;
    public static MediaPlayer sound_takelemon;
    public static MediaPlayer sound_yeahlemon;
    public static MediaPlayer sound_science;
    public static MediaPlayer sound_potato;
    public static MediaPlayer sound_shrimp;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        sound_alert = MediaPlayer.create(context, R.raw.alert);
        sound_victory = MediaPlayer.create(context, R.raw.victory);
        sound_capitalism = MediaPlayer.create(context, R.raw.capitalism);
        sound_longtime = MediaPlayer.create(context, R.raw.longtime);
        sound_birdbird = MediaPlayer.create(context, R.raw.birdbird);
        sound_fatherspace = MediaPlayer.create(context, R.raw.spaaace);
        sound_glassshark = MediaPlayer.create(context, R.raw.glassshark);
        sound_takelemon = MediaPlayer.create(context, R.raw.takethelemonsback);
        sound_yeahlemon = MediaPlayer.create(context, R.raw.yeahtakethelemons);
        sound_science = MediaPlayer.create(context, R.raw.science);
        sound_potato = MediaPlayer.create(context, R.raw.potato);
        sound_shrimp = MediaPlayer.create(context, R.raw.shrimpheaven2);

        // Button variables
        final Button button_alert = findViewById(R.id.alert);
        final Button button_victory = findViewById(R.id.victory);
        final Button button_capitalism = findViewById(R.id.capitalism);
        final Button button_longtime = findViewById(R.id.longtime);
        final Button button_birdbird = findViewById(R.id.birdbird);
        final Button button_fatherspace = findViewById(R.id.fatherspace);
        final Button button_glassshark = findViewById(R.id.glassshark);
        final Button button_yeahlemon = findViewById(R.id.yeahthelemons);
        final Button button_takelemon = findViewById(R.id.takethelemons);
        final Button button_science = findViewById(R.id.science);
        final Button button_potato = findViewById(R.id.potato);
        final Button button_shrimp = findViewById(R.id.shrimpheaven);

        button_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_alert.start();
            }
        });

        button_victory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_victory.start();
            }
        });

        button_capitalism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_capitalism.start();
            }
        });

        button_longtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_longtime.start();
            }
        });

        button_birdbird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_birdbird.start();
            }
        });

        button_fatherspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_fatherspace.start();
            }
        });

        button_glassshark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_glassshark.start();
            }
        });

        button_takelemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_takelemon.start();
            }
        });

        button_yeahlemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_yeahlemon.start();
            }
        });

        button_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_science.start();
            }
        });

        button_potato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_potato.start();
            }
        });

        button_shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_shrimp.start();
            }
        });

    }
}
