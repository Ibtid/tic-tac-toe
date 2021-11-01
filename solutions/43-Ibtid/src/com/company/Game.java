package com.company;

import com.company.AI.AIHandler;
import com.company.GameManagement.RoundManagement;
import com.company.Panel.Panel;
import com.company.Theme.ThemeHandler;

import javax.swing.*;

public class Game {

    AIHandler aiHandler;
    ThemeHandler themeHandler;
    Frame frame;
    RoundManagement roundManagement;
    Panel panel = new Panel();
    String[][] boardButtonKey = new String[3][3];
    JButton[][] boardButton = new JButton[3][3];
    BoardButtons boardButtons;

    Game(){
        boardButtons = new BoardButtons(boardButton,boardButtonKey,panel);
        themeHandler = new ThemeHandler(panel,boardButton,boardButtonKey);
        frame = new Frame(panel);
        aiHandler = new AIHandler(panel,boardButton,themeHandler,boardButtonKey);
        roundManagement = new RoundManagement(aiHandler,boardButton,themeHandler,boardButtonKey);
    }

}
