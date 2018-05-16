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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new com.example.kspich.myapp.inerface.CommonInterface(this));
        setContentView(R.layout.layout_common_act);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView log = (TextView) findViewById(R.id.textView2);
        Button acceptButton = (Button) findViewById(R.id.firstbutton);
        acceptButton.setOnClickListener((View.OnClickListener) this);
    }

    public static Action act = new Action();
    public static Quest CurrentSituation = new Quest("Первый квест");

    public void acBclick(View view) {
        //log.setText(CurrentSituation.text+"");
    }
}
