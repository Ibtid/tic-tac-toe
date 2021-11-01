package com.company;
import com.company.Theme.ThemeHandler;

import javax.swing.*;

public class Player {
    ThemeHandler themeHandler;
    JButton[][] boardButton;
    String[][] boardButtonKey;


    public Player(JButton[][] boardButton, String[][] boardButtonKey, ThemeHandler themeHandler){
        this.boardButton = boardButton;
        this.boardButtonKey = boardButtonKey;
        this.themeHandler = themeHandler;
    }

    public void playerMove(int row, int column){
        boardButton[row][column].setIcon(themeHandler.getTheme().getPlayerIcon());
        boardButtonKey[row][column] = "Player";
    }
}
