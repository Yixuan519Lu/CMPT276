package com.example.quartz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.quartz.Model.Child;
import com.example.quartz.Model.Children;

public class ManageChildren extends AppCompatActivity {

    public static Intent makeLaunchIntent(Context c, String message){
        Intent intent = new Intent(c, ManageChildren.class);
        //intent.putExtra(EXTRA_MESSAGE, message);
        return intent;
    }

    //get children instance;
    private Children children;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_children);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        children = Children.getInstance();
        SaveChange();

    }

    private void SaveChange(){
        Button btn = (Button) findViewById(R.id.SaveButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.Entry_chlid_Name);
                children.add(new Child(name.getText().toString()));
                Intent i =new Intent(ManageChildren.this,MainActivity.class);
                //Intent i = MainActivity.makeLaunchIntent(start_activity.this, "backtomain");
                startActivity(i);
                finish();
            }
        });

    }
}