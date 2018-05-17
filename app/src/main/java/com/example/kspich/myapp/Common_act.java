package com.example.kspich.myapp;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.kspich.myapp.game.Action;
import com.example.kspich.myapp.game.obj.Player;
import com.example.kspich.myapp.game.quest.Quest;
import com.example.kspich.myapp.game.quest.Situation;

public class Common_act extends AppCompatActivity {

    public Common_act(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new com.example.kspich.myapp.inerface.CommonInterface(this));
        setContentView(R.layout.layout_common_act);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final TextView log = (TextView) findViewById(R.id.textView2);
        Button acceptButton = (Button) findViewById(R.id.firstbutton);
        log.setText(CurrentSituation.text+"");

        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.firstbutton:{log.setText("Ситуация "+count+" :Самое удивительное, что текст меняется");count++;break;}
                    case R.id.secondbutton:{log.setText("Ситуация "+count+" :Еще удивительнее то, что кнопки работают");count++;break;}
                    case R.id.anotherbutton:{break;}
                    case R.id.thatbutton:{break;}
                }
            }
        });

    }

    public static Action act = new Action();
    public static Quest CurrentSituation = new Quest("Ситуация 1: Удивительный текст в логе. Интересно, переносится ли он...");
    public int count = 2;
}
