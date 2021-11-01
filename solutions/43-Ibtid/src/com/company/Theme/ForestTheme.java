package com.company.Theme;

import javax.swing.*;
import java.awt.*;

public class ForestTheme implements Theme {
    IconGenerator iconGenerator = new IconGenerator();
    @Override
    public Color getBackgroundColor() {
        return new Color(50,150,50);
    }

    @Override
    public Color getBorderColor() {
        return new Color(100,180,100);
    }

    @Override
    public Icon getPlayerIcon() {
        return iconGenerator.getForestPlayerIcon();
    }

    @Override
    public Icon getAiIcon() {
        return iconGenerator.getForestAiIcon();
    }

}
