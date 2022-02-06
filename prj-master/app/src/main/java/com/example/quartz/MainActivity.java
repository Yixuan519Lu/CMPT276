package com.example.quartz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpManageChildButton();
        setUpCoinFlipButton();
        setUpTimerButton();
    }

    private void setUpManageChildButton() {
        Button btn = (Button) findViewById(R.id.fe1);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked ManageChildren.", Toast.LENGTH_SHORT)
                        .show();

                Intent i =new Intent(MainActivity.this,ManageChildren.class);
                startActivity(i);
            }
        });

    }

    private void setUpCoinFlipButton() {
        Button btn = (Button) findViewById(R.id.fe2);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked Flip a Coin.", Toast.LENGTH_SHORT)
                        .show();

                Intent intent = CoinFlipActivity.makeIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }

    private void setUpTimerButton() {
        Button btn = (Button) findViewById(R.id.fe3);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked Set a Timer.", Toast.LENGTH_SHORT)
                        .show();

                Intent intent = TimerActivity.makeIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }


}