package com.example.kspich.myapp.inerface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.ListViewCompat;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kspich.myapp.Common_act;
import com.example.kspich.myapp.game.Action;
import com.example.kspich.myapp.game.obj.Player;

/**
 * Created by kspich on 22.04.2018.
 */

public class CommonInterface extends View {

    int fontSize = 32;

    Paint p = new Paint();
    Paint p2 = new Paint();

    public CommonInterface(Context context) {
        super(context);
    }

    public CommonInterface(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CommonInterface(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLACK);
        p.setColor (Color.RED);
        p.setTextSize(fontSize);
        p.setStyle(Paint.Style.STROKE);
        p2.setColor (Color.LTGRAY);
        p2.setStyle(Paint.Style.STROKE);
        canvas.drawRect (10, 95, 260, 400,p2);
        canvas.drawRect (270, 95, 710, 400,p2);
        canvas.drawRect (10, 410, 710,  1070,p2);

    }
}