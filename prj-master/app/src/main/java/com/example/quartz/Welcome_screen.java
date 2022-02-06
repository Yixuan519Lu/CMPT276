package com.example.quartz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomescreen);
        jump();// jump to mainActivity
    }

    private void jump() {
        final Button jump=findViewById(R.id.jump);
        jump.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welcome_screen.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}