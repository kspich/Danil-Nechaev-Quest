package com.example.kspich.myapp.game;

import com.example.kspich.myapp.game.obj.Player;
import com.example.kspich.myapp.game.quest.Situation;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by kspich on 22.04.2018.
 */

public class Action {
    public static Player p;
    public static LinkedList<Situation> Situations = new LinkedList<>();
    public Action(){
        p = new Player("You");
    }
}
