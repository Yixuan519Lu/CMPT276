package com.example.quartz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        startButton();
        pauseButton();
        resetButtom();
    }

    private void pauseButton() {
        Button pause = (Button) findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            }
        });
    }

    private void startButton() {
        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            }
        });
    }

    private void resetButtom() {
        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            }
        });
    }

    public static Intent makeIntent(Context context){
        return new Intent(context, TimerActivity.class);
    }
}