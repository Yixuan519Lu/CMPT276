package com.example.cmpt276as2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.cmpt276as2.Model.Calculator;
import com.example.cmpt276as2.Model.Lens;


public class Calculate extends AppCompatActivity {
                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    // need to get my length and aperature information
                    Sring myInfo=getInfo();
                    double selected_aperature=getSelectedApe();
                    double dis=getDistance();

                    Button event=findViewById(R.id.cal_button);
                    event.setOnClickListener(v->{

                        Lens mylens=new Lens(getMake(myInfo),getApe(myInfo),getFocal(myInfo));

                        Calculator c=new Calculator(mylens,dis,selected_aperature);

                        String HD=c.formatM(c.hyperfocal_distance()/1000);
                        String NFD=c.formatM(c.near_focal_point()/1000);
                        String FFD=c.formatM(c.far_focal_point()/1000);
                        String DOF=c.formatM(c.depth_field()/1000);
                        String inputMes="null";
                        if(selected_aperature<getApe(myInfo)){
                inputMes="Invaild aperture";
                // need to set corresponding message
            }
            else{
                inputMes="Valid aperture";
                // need to set corresponding message
            }

        });
    }
    public static String getApe(String arg){
        // get number of aperture
        int Ape=0;
        // need to implement getter
        return Ape;
    }
    public static String getFocal(String arg){
        // get number of focal
        int Foc=0;
        // need to implement getter
        return Foc;
    }
    public static String getMake(String arg){
        // get number of aperture
        int Make=0;
        // need to implement getter
        return Make;
    }


}
