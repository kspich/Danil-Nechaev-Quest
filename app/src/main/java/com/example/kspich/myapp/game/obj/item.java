package com.example.kspich.myapp.game.obj;

/**
 * Created by kspich on 27.04.2018.
 */

public class item {
    public String name;
    public int ItemID;

    public boolean isFood;
    public boolean isWeapon;
    public boolean sellable;

    int power;
    int critpower;
    int healing;

    public item(){
        ItemID = 0;
    }
}
