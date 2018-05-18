
package com.example.kspich.myapp.game.quest;

import com.example.kspich.myapp.Common_act;

/**
 * Created by kspich on 30.04.2018.
 */

public class Quest extends Situation {

    public Quest nextQuest, nextQuest2;

    public Quest(String questText, Quest nextQuest, Quest nextQuest2, String contText,
                 String contText2, String b1t, String b2t, String b3t, String b4t){
        sitID = 4;
        text  = questText;
        text2 = contText;
        text3 = contText2;
        b1text = b1t;
        b2text = b2t;
        b3text = b3t;
        b4text = b4t;

        this.nextQuest = nextQuest;
    }

    public String toString(){
        return text;
    }

    public void firstAction(int i){
        if (nextQuest == null){Common_act.act.CurrentSituation = Common_act.act.Situations[i];}
        else if (text3!= null){Common_act.act.CurrentSituation.text = text3;} else {Common_act.act.CurrentSituation = nextQuest;}
    }
    public void secondAction(){
        if ((text2 != null)&&(nextQuest == null)) {Common_act.act.CurrentSituation.text = text2;}
        else {Common_act.act.CurrentSituation = nextQuest;}
    }
}