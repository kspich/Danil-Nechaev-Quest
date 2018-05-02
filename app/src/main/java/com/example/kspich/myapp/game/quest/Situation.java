package com.example.kspich.myapp.game.quest;

import com.example.kspich.myapp.game.Action;

/**
 * Created by kspich on 30.04.2018.
 */

public class Situation {
    public int sitID;
    public String text;
    public Situation (){}
    public Situation (int sitID){
        this.sitID = sitID;
        switch (sitID){
            case 0:{
                this.text = "gone for a walk";
            }
            case 1:{
                this.text = "made someth";
            }
        }
    }
}
