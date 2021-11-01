package com.company.Theme;

import javax.swing.*;
import java.awt.*;

public class HighContrastTheme implements Theme {
    IconGenerator iconGenerator = new IconGenerator();
    @Override
    public Color getBackgroundColor() {
        return Color.darkGray;
    }

    @Override
    public Color getBorderColor() {
        return Color.lightGray;
    }

    @Override
    public Icon getPlayerIcon() {
        return iconGenerator.getHighContrastPlayerIcon();
    }

    @Override
    public Icon getAiIcon() {
        return iconGenerator.getHighContrastAiIcon();
    }


}