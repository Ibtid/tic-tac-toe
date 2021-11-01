package com.company.AI;

import com.company.Theme.ThemeHandler;

import javax.swing.*;

public abstract class AI {
    JButton[][] boardButton;
    ThemeHandler themeHandler;
    String[][] boardButtonKey;
    public AI(JButton[][] boardButton, ThemeHandler themeHandler, String[][] boardButtonKey) {
        this.boardButton=boardButton;
        this.themeHandler=themeHandler;
        this.boardButtonKey=boardButtonKey;
    }

    void setAiMarkerInBoardPosition(int row, int column){
        boardButton[row][column].setIcon(themeHandler.getTheme().getAiIcon());
        boardButtonKey[row][column] = "Ai";
    }

    public abstract void AImove();

}
