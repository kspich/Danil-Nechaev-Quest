package com.example.kspich.myapp.game.quest;

import com.example.kspich.myapp.game.Action;
import com.example.kspich.myapp.game.obj.Entity;
import com.example.kspich.myapp.game.obj.Player;

/**
 * Created by kspich on 30.04.2018.
 */

public class Situation {
    String b1text, b2text, b3text, b4text;
    public int sitID;
    public String text;

    public Situation(){}

    public Situation (int sitID, Player p, Entity e, String b1text, String b2text, String b3text, String b4text){
        this.sitID = sitID;
        switch (sitID){
            case 2:{
                this.text = "Игрок "+p.name+" заговорил с "+e.name;
            }
            case 3:{
                this.text = "Игрок "+p.name+" взял предмет ";
            }
            case 5:{
                this.text = "Игрок "+p.name+" атаковал персонажа "+e.name;
            }
        }
    }

    public Situation (int sitID, Player p){
        this.sitID = sitID;
        switch (sitID){
            case 0:{
                this.text = "Игрок "+p.name+"прошелся";
            }
            case 1:{
                this.text = "Игрок "+p.name+"осмотрелся";
            }
        }
    }

    public void firstAction(Player p, Entity e) {

    }

}
