package com.example.kspich.myapp;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kspich.myapp.game.Action;
import com.example.kspich.myapp.game.obj.Player;
import com.example.kspich.myapp.game.quest.Quest;
import com.example.kspich.myapp.game.quest.Situation;
import com.example.kspich.myapp.inerface.CommonInterface;

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
        final TextView alivelog = (TextView) findViewById(R.id.textView3);
        final TextView playerInfo = (TextView) findViewById(R.id.textView4);
        final Button button1 = (Button) findViewById(R.id.firstbutton);
        final Button button2 = (Button) findViewById(R.id.secondbutton);
        final Button button3 = (Button) findViewById(R.id.anotherbutton);
        final Button button4 = (Button) findViewById(R.id.thatbutton);
        final ImageView screamer = (ImageView) findViewById(R.id.imageView);

        final TextView clickerCounter = (TextView) findViewById(R.id.textViewSpecial);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((act.CurrentSituation.b1text.equals("Лечь на кровать"))&&(isTapped >2 )){

                }else
                {i++; act.CurrentSituation.firstAction(i);}

                if (act.CurrentSituation == act.Situations[1]){isTapped++;}
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act.CurrentSituation.secondAction();
                if (act.CurrentSituation.b2text.equals("Ждать")){
                    j++;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(50);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                log.setText(act.CurrentSituation.text);
                                if (act.p.alive = true) {alivelog.setText("alive.png");}
                                else {alivelog.setText("rip.png");}
                                playerInfo.setText(Common_act.act.p.name+" xp: "+Common_act.act.p.exp);
                                button1.setText(act.CurrentSituation.b1text+"");
                                button2.setText(act.CurrentSituation.b2text+"");
                                if (act.CurrentSituation.b1text.equals("")) {button1.setVisibility(View.INVISIBLE);}
                                else {button3.setText(act.CurrentSituation.b3text+"");}
                                if (act.CurrentSituation.b2text.equals("")) {button2.setVisibility(View.INVISIBLE);}
                                else {button3.setText(act.CurrentSituation.b3text+"");}
                                if (act.CurrentSituation.b3text.equals("")) {button3.setVisibility(View.INVISIBLE);}
                                else {button3.setText(act.CurrentSituation.b3text+"");}
                                if (act.CurrentSituation.b4text.equals("")) {button4.setVisibility(View.INVISIBLE);}
                                else {button4.setText(act.CurrentSituation.b3text+"");}

                                if (act.CurrentSituation.b2text.equals("Ждать")){
                                    button2.setX(185);button2.setY(1120);
                                    if ((j>0)&&(j<=7)){clickerCounter.setText(j+"");
                                    log.setText("Ты слышишь приближающиеся шаги...");}
                                }

                                if (j>=7){
                                    clickerCounter.setVisibility(View.INVISIBLE);
                                    act.p.alive = false;
                                    alivelog.setText("rip.png");
                                    if ((anotherCounter<=100)&&(anotherCounter>0)){
                                        screamer.setVisibility(View.VISIBLE);
                                    }
                                }

                                anotherCounter++;
                                if (anotherCounter>=200){
                                    anotherCounter=0;
                                }
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();

    }

    public static Action act = new Action();
    public int i=0;
    public int j = 0;
    public int anotherCounter = 0;
    public int isTapped = 1;
}
