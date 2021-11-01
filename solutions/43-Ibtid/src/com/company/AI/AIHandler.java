package com.company.AI;

import com.company.GameManagement.BoardManagement;
import com.company.Panel.Panel;
import com.company.Theme.ThemeHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AIHandler {
    Panel panel;
    AI ai;
    String[][] boardButtonKey;
    JButton[][] boardButton;
    ThemeHandler themeHandler;
    BoardManagement boardManagement;

    public AIHandler(Panel panel, JButton[][] boardButton, ThemeHandler themeHandler, String[][] boardButtonKey){
        this.panel = panel;
        this.themeHandler = themeHandler;
        this.boardButton = boardButton;
        this.boardButtonKey = boardButtonKey;
        boardManagement =new BoardManagement(boardButton,boardButtonKey);
        selectAI();
    }

    void selectAI(){
        panel.playWithRandomAIButton.addActionListener(selectAI);
        panel.playWithDefensiveAIButton.addActionListener(selectAI);
    }

    private ActionListener selectAI = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            boardManagement.refreshBoard();
            if(e.getSource() == panel.playWithDefensiveAIButton){ai = new DefensiveAI(boardButton,themeHandler,boardButtonKey);}
            if(e.getSource() == panel.playWithRandomAIButton){ai = new RandomAI(boardButton,themeHandler,boardButtonKey);}
        }
    };

    public AI getAi(){
        return ai;
    }
}
