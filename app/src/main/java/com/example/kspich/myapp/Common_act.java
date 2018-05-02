package com.example.kspich.myapp;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.kspich.myapp.game.Action;
import com.example.kspich.myapp.game.obj.Player;
import com.example.kspich.myapp.game.quest.Quest;
import com.example.kspich.myapp.game.quest.Situation;

public class Common_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new com.example.kspich.myapp.CommonInterface(this));
        //setContentView(R.layout.layout_common_act);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public static Action act = new Action();
    public static Quest CurrentSituation = new Quest(act.p.name+" sample text");
}
