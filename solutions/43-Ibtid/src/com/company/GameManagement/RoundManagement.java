package com.company.GameManagement;

import com.company.AI.AIHandler;
import com.company.Theme.ThemeHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoundManagement {
    JButton[][] boardButton;
    String[][] boardButtonKey;
    SingleRoundComponents singleRoundComponents;

    public RoundManagement(AIHandler aiHandler,
                           JButton[][] boardButton,
                           ThemeHandler themeHandler,
                           String[][] boardButtonKey){
        this.boardButtonKey=boardButtonKey;
        this.boardButton = boardButton;
        singleRoundComponents = new SingleRoundComponents(boardButton,boardButtonKey,aiHandler,themeHandler);
        conductRoundWithClick();
    }

    void conductRoundWithClick(){
        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++) {
                boardButton[row][column].addActionListener(setConductRoundWithClick);
            }
        }
    }

    public boolean AiNotSelected(){
        return singleRoundComponents.AiNotPrepared();
    }

    public void conductSingleRound(int row, int column){
        singleRoundComponents.singleRoundConduct(row,column);
    }

    public ActionListener setConductRoundWithClick = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int row = 0; row < 3; row++){
                for(int column = 0; column < 3; column++) {
                    if (e.getSource() == boardButton[row][column]) {
                        if(AiNotSelected())return;
                        if (boardButtonKey[row][column]=="") conductSingleRound(row,column);
                    }
                }
            }
        }
    };
}
