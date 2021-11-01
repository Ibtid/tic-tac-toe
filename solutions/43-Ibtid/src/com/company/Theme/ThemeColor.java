package com.company.Theme;

import com.company.Panel.Panel;

import javax.swing.*;

public class ThemeColor {
    Panel panel;
    JButton[][] boardButtons;
    public ThemeColor(Panel panel, JButton[][] boardButtons) {
        this.panel = panel;
        this.boardButtons = boardButtons;
    }

    void colorBoardButtons(Theme theme){
        for(int row = 0; row<3; row++){
            for(int column = 0; column < 3; column++) {
                boardButtons[row][column].setBackground(theme.getBackgroundColor());
            }
        }
    }

    void colorPanel(Theme theme){
        panel.mainPanel.setBackground(theme.getBackgroundColor());
        panel.themePanel.setBackground(theme.getBackgroundColor());
        panel.gameStartPanel.setBackground(theme.getBackgroundColor());
        panel.gameButtonPanel.setBackground(theme.getBorderColor());
    }

    void setThemeColor(Theme theme){
        colorPanel(theme);
        colorBoardButtons(theme);
        colorRadioButtons(theme);
        colorPlayWithAiButtons(theme);
    }

    void colorRadioButtons(Theme theme){
        panel.classicThemeRadioButton.setBackground(theme.getBackgroundColor());
        panel.forestThemeRadioButton.setBackground(theme.getBackgroundColor());
        panel.highContrastThemeRadioButton.setBackground(theme.getBackgroundColor());
    }

    void colorPlayWithAiButtons(Theme theme){
        panel.playWithDefensiveAIButton.setBackground(theme.getBackgroundColor());
        panel.playWithRandomAIButton.setBackground(theme.getBackgroundColor());
    }
}
