package com.example.kspich.myapp.game.obj;

/**
 * Created by kspich on 27.04.2018.
 */

public class Player extends Entity {
    public item inventory[] = new item[10];

    public Player(String name){

        super(name);
        this.name = name;
        health=5;
        mana=3;
        protection=0;
        strenght=1;
        intellect=1;

        heatRes=0;
        poisonRes=0;
        blastRes=0;
        majRes=0;

        alive=true;

    }
}
