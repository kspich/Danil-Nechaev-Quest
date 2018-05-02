package com.example.kspich.myapp.game;

import com.example.kspich.myapp.game.obj.Player;
import com.example.kspich.myapp.game.quest.Situation;

import java.util.ArrayList;

/**
 * Created by kspich on 22.04.2018.
 */

public class Action {
    public static Player p;
    public static ArrayList<Situation> Situations = new ArrayList<>();
    public Action(){
        p = new Player("You");
    }
}
