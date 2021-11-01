package com.company.Theme;

import com.company.GameManagement.BoardManagement;
import com.company.Panel.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeHandler {
    Panel panel;
    Theme theme;
    BoardManagement boardManagement;
    ThemeColor themeColor;

    public ThemeHandler(Panel panel, JButton[][] boardButtons,String[][] boardButtonKey){
        this.panel = panel;
        this.boardManagement = new BoardManagement(boardButtons,boardButtonKey);
        themeColor = new ThemeColor(panel, boardButtons);
        defaultTheme();
        setTheme();
    }

    void defaultTheme(){
        theme = new ClassicTheme();
        themeColor.setThemeColor(theme);
    }

    void setTheme(){
        panel.classicThemeRadioButton.addActionListener(switchTheme);
        panel.forestThemeRadioButton.addActionListener(switchTheme);
        panel.highContrastThemeRadioButton.addActionListener(switchTheme);
    }

    private ActionListener switchTheme = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(panel.classicThemeRadioButton.isSelected()){theme = new ClassicTheme();}
            if(panel.forestThemeRadioButton.isSelected()){theme = new ForestTheme();}
            if(panel.highContrastThemeRadioButton.isSelected()){theme = new HighContrastTheme();}
            boardManagement.switchIconsWithThemeSwitching(theme);
            themeColor.setThemeColor(theme);
        }
    };

    public Theme getTheme(){
        return  theme;
    }
}
