package com.example.kspich.myapp.game.obj;

/**
 * Created by kspich on 27.04.2018.
 */

public class melee extends item {
    public double hitChance;
    public double critChance;
    public int[] meleeType= {0,1,2};
    public melee(int meleeType) {
        ItemID = 1;
        isWeapon = true;

        if (meleeType == this.meleeType[0]) {
            name = "knife";
            power = 1;

        }
        if (meleeType == this.meleeType[1]) {
            name = "sword";
            power = 2;
        }
        if (meleeType == this.meleeType[2]) {
            name = "spear";
            power = 3;
        }

        critpower = power*2;
    }
}
