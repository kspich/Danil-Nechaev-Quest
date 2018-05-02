package com.example.kspich.myapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kspich.myapp.Common_act;
import com.example.kspich.myapp.game.Action;
import com.example.kspich.myapp.game.obj.Player;

/**
 * Created by kspich on 22.04.2018.
 */

public class CommonInterface extends View {

    String gameInfo = Common_act.act.p.name+" xp: "+Action.p.exp;
    int fontSize = 32;
    public TextView textView = new TextView(getContext());

    public CommonInterface (Context context){
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLACK);
        Paint p = new Paint();
        p.setColor (Color.RED);
        p.setTextSize(fontSize);
        p.setStyle(Paint.Style.STROKE);
        canvas.drawText(gameInfo, 10,80,p);
        p.setColor (Color.LTGRAY);
        canvas.drawRect (10, 95, 260, 400,p);
        canvas.drawRect (270, 95, 710, 400,p);
        canvas.drawRect (10, 410, 710, 1070,p);

        textView.setTextSize(28);
        textView.setWidth(650);
        textView.setHeight(690);
        textView.setY(385);
        textView.setX(15);
        textView.setText(Common_act.CurrentSituation.toString());
    }
}
