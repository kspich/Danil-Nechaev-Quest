package com.example.kspich.myapp.game.quest;

/**
 * Created by kspich on 30.04.2018.
 */

public class Quest extends Situation {
    public Quest(String questText){
        sitID = 9;
        text  = questText;
    }
    public String toString(){
        return text;
    }
}
