package com.company.GameManagement;

import com.company.Theme.Theme;

import javax.swing.*;

public class BoardManagement {
    JButton[][] boardButton;
    String[][] boardButtonKey;
    public BoardManagement(JButton[][] boardButton, String[][] boardButtonKey){
        this.boardButton = boardButton;
        this.boardButtonKey = boardButtonKey;
    }
    public void refreshBoard(){
        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                boardButton[row][column].setIcon(null);
                boardButtonKey[row][column] = "";
            }
        }
    }
    public void freezeBoard(){
        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                   boardButton[row][column].setIcon(boardButton[row][column].getIcon());
                   boardButtonKey[row][column].equals(boardButtonKey[row][column]);
            }
        }
    }
    public void switchIconsWithThemeSwitching(Theme theme){
        for(int row = 0; row<3; row++){
            for(int column = 0; column < 3; column++){
                if(boardButtonKey[row][column]=="Player"){
                    boardButton[row][column].setIcon(theme.getPlayerIcon());
                }
                if(boardButtonKey[row][column]=="Ai"){
                    boardButton[row][column].setIcon(theme.getAiIcon());
                }
            }
        }
    }
}

