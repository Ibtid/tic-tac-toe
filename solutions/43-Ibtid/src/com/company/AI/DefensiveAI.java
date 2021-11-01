package com.company.AI;
import com.company.Theme.ThemeHandler;

import javax.swing.*;

public class DefensiveAI extends AI {

    RandomAI randomAI;
    DefenseEvaluator defenseEvaluator;

    public DefensiveAI(JButton[][] boardButton, ThemeHandler themeHandler, String[][] boardButtonKey){
        super(boardButton,themeHandler,boardButtonKey);
        randomAI = new RandomAI(boardButton,themeHandler,boardButtonKey);
        defenseEvaluator = new DefenseEvaluator(boardButtonKey);
    }

    @Override
    public void AImove() {
        if(defenseEvaluator.positionCanBeDefended())
            defend();
        else randomMove();
    }

    public void defend(){
        for(int row = 0; row<3; row++){
            for(int column = 0; column<3; column++){
                if(defenseEvaluator.positionNeedToBeDefended[row][column]){
                    super.setAiMarkerInBoardPosition(row,column);
                    defenseEvaluator.setPositionNeedToBeDefendedToFalse();
                    return;
                }
            }
        }
    }

    public void randomMove(){
        randomAI.AImove();
    }
}