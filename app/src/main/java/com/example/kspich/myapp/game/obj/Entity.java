package com.example.kspich.myapp.game.obj;

/**
 * Created by kspich on 27.04.2018.
 */

import com.example.kspich.myapp.game.quest.Situation;

import java.util.Random;

public class Entity {

    public static String sitText; //для квеста

    public int exp;
    public int position;

    public item rightH = new item();
    public item leftH = new item();

    public String name;
    public String ClassName;

    public int health;
    public int mana;
    public int protection;
    public static int strenght;
    public int intellect;

    public int heatRes;
    public int poisonRes;
    public int blastRes;
    public int majRes;

    public int majSkill;
    public int melSkill;
    public int arcSkill;
    public int robSkill;

    public boolean alive;
    public boolean isTarget;

    public Entity(String name){
        this.name = name;
        ClassName="Entity";
        health=5;
        mana=3;
        protection=0;
        strenght=1;
        intellect=1;

        heatRes=0;
        poisonRes=0;
        blastRes=0;
        majRes=0;

        majSkill = 0;
        melSkill = 0;
        arcSkill = 0;
        robSkill = 0;

        alive=true;
    }

    public void dead() {
        health=0;
        alive=false;
    }

    public void hurt(Entity Name){
        Name.isTarget=true;

        if (rightH.ItemID == 1) {

            Random rnd = new Random();
            int j = rnd.nextInt(100);
            if ((j<(1+1*melSkill))&&(Name.health<(strenght+rightH.critpower))) {Name.dead();}
            else {Name.health-=(strenght+rightH.power);}
        }


        if (rightH.ItemID == 2 ) {							//другое оружие

            Random rnd = new Random();
            int j = rnd.nextInt(100);
            if ((j<(1+1*majSkill))&&(Name.health<(strenght+rightH.critpower))) {Name.dead();}
            else {Name.health-=(strenght+rightH.power);}
        }


        if (rightH.ItemID==0) {

            Random rnd = new Random();
            int j = rnd.nextInt(100);
            if ((j<(1+1*melSkill))&&(Name.health<strenght)) {Name.dead();} else {Name.health-=strenght;}
        }
    }

    public String toString() {
        return (ClassName+" "+name+" "+health);
    }

    public void eat() {

    }

    public void get (item Name) {
        if (Name.isWeapon = true){
            rightH = Name;
        } else {leftH = Name;}
    }

    public void startSituation(Situation sit, Entity ent){

    }

}
