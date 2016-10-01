package com.example.danielasanchezollervides.sounds;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mpboom;
    MediaPlayer mpalarm;
    MediaPlayer mpboing;
    MediaPlayer mpomg;
    MediaPlayer mpchicken;
    MediaPlayer mpbadjoke;
    MediaPlayer mplaugh;
    MediaPlayer mptdfw;
    MediaPlayer mpwtf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soundboom(View view) {
        Button button_boom = (Button) findViewById(R.id.button_boom);

        MediaPlayer mpboom = MediaPlayer.create(this, R.raw.boom);

        mpboom.start();
    }

    public void soundalarm(View view) {
        Button button_alarm = (Button) findViewById(R.id.button_alarm);

        MediaPlayer mpalarm = MediaPlayer.create(this, R.raw.alarm);

        mpalarm.start();
    }

    public void soundboing (View view){
        Button button_boing = (Button) findViewById(R.id.button_boing);

        MediaPlayer mpboing = MediaPlayer.create(this, R.raw.boing);

        mpboing.start();
    }

    public void soundomg (View view){
        Button button_omg = (Button) findViewById(R.id.button_omg);

        MediaPlayer mpomg = MediaPlayer.create(this, R.raw.omg);

        mpomg.start();
    }

    public void soundchicken (View view){
        Button button_chicken = (Button) findViewById(R.id.button_chicken);

        MediaPlayer mpchicken = MediaPlayer.create(this, R.raw.chicken);

        mpchicken.start();
    }

    public void soundbadjoke (View view){
        Button button_badjoke = (Button) findViewById(R.id.button_badjoke);

        MediaPlayer mpbadjoke = MediaPlayer.create(this, R.raw.badjoke);

        mpbadjoke.start();
    }

    public void soundlaugh (View view) {
        Button button_laugh = (Button) findViewById(R.id.button_laugh);

        MediaPlayer mplaugh = MediaPlayer.create(this, R.raw.laugh);

        mplaugh.start();
    }

    public void soundtdfw (View view) {
        Button button_tdfw = (Button) findViewById(R.id.button_tdfw);

        MediaPlayer mptdfw = MediaPlayer.create(this, R.raw.tdfw);

        mptdfw.start();
    }
    public void soundwtf (View view) {
        Button button_wtf = (Button) findViewById(R.id.button_wtf);

        MediaPlayer mpwtf = MediaPlayer.create(this, R.raw.wtf);

        mpwtf.start();
    }


}