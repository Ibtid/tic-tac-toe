package com.company.Theme;

import javax.swing.*;
import java.awt.*;

public class ClassicTheme implements Theme {
    IconGenerator iconGenerator = new IconGenerator();
    @Override
    public Color getBackgroundColor() {
        return Color.white;
    }
    @Override
    public  Color getBorderColor(){
        return Color.black;
    }

    @Override
    public Icon getPlayerIcon(){
        return iconGenerator.getClassicPlayerIcon();
    }

    @Override
    public Icon getAiIcon(){
        return iconGenerator.getClassicAiIcon();
    }

}
