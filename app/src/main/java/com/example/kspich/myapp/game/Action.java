package com.example.kspich.myapp.game;

import com.example.kspich.myapp.game.obj.Player;
import com.example.kspich.myapp.game.quest.Quest;
import com.example.kspich.myapp.game.quest.Situation;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by kspich on 22.04.2018.
 */

public class Action {
    public static Player p;
    public static Quest[] Situations = new Quest[10];
    public static Quest CurrentSituation = new Quest("Ты просыпаешься в полупустой комнате от сильного шума. Тебе хочется есть. ", Situations[1],null,"Вокруг слишком много звуков, чтобы спать, у тебя не выйдет. ", null,"Оглянуться", "Попробовать уснуть","","");
    public Action(){
        p = new Player("Dortonkon", 10);
        Situations[0] = CurrentSituation;
        Situations[3] = new Quest("Ты закричал, но никто не отозвался на твои крики.", null, null,"Дверь внезапно открылась, в комнату вошел Даня Нечаев.", null,"","Ждать", "", "");
        Situations[2] = new Quest("Ты встал с кровати. Удивительно, что у тебя получилось.",null, null,
                "Ты стал дергать за ручку, но дверь оказалась заперта.",null,"Закричать",
                "Открыть дверь","","");
        Situations [1] = new Quest("Ты оглянулся, но кроме двери здесь ничего нет.", Situations[2], null,null, "Ты лег на кровать.",
                "Лечь на кровать", "Встать с кровати","","");
    }
}
