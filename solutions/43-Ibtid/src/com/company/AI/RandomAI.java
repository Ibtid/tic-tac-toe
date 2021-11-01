package com.company.AI;

import com.company.Theme.ThemeHandler;

import javax.swing.*;

public class RandomAI extends AI {

    RandomPosition randomPosition;

    RandomAI(JButton[][] boardButton, ThemeHandler themeHandler, String[][] boardButtonKey){
        super(boardButton,themeHandler,boardButtonKey);
        randomPosition=new RandomPosition();
    }

    @Override
    public void AImove() {
        for(int row = 0; row<3; row++) {
            for(int column = 0; column<3; column++) {
                randomPosition.createUniquePosition();
                int randomRow = randomPosition.row;
                int randomColumn = randomPosition.column;
                if (boardButtonKey[randomRow][randomColumn] == "") {
                    super.setAiMarkerInBoardPosition(randomRow,randomColumn);
                    return;
                }
            }
        }
    }
}
