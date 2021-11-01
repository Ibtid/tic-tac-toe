package com.company;

import com.company.Panel.Panel;

import javax.swing.*;

public class BoardButtons{
    JButton[][] boardButton;
    String[][] boardButtonKey;
    Panel panel;

    public BoardButtons(JButton[][] boardButton, String[][] boardButtonKey, Panel panel){
        this.boardButton = boardButton;
        this.boardButtonKey = boardButtonKey;
        this.panel =panel;
        initializeButtonKeys();
        initializeButtons();
    }

    void initializeButtons(){
        boardButton[0][0] = panel.button1;
        boardButton[0][1] = panel.button2;
        boardButton[0][2] = panel.button3;
        boardButton[2][2] = panel.button9;
        boardButton[2][1] = panel.button8;
        boardButton[2][0] = panel.button7;
        boardButton[1][2] = panel.button6;
        boardButton[1][1] = panel.button5;
        boardButton[1][0] = panel.button4;
    }

    void initializeButtonKeys(){
        for(int row = 0; row<3; row++){
            for(int column = 0; column<3; column++){
                boardButtonKey[row][column]="";
            }
        }
    }

}
