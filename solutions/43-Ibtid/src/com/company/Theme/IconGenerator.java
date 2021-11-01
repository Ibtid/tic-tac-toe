package com.company.Theme;

import javax.swing.*;
import java.awt.*;

public class IconGenerator {
    static String classicPlayerIcon = "src/com/company/Resources/ClassicThemePlayerMove.png";
    static String classicAiIcon = "src/com/company/Resources/ClassicThemeAiMove.png";
    static String forestThemePlayerIcon = "src/com/company/Resources/ForestThemePlayerIcon.png";
    static String forestThemeAiIcon = "src/com/company/Resources/ForestThemeAi.png";
    static String highContrastPlayerIcon = "src/com/company/Resources/HighContrastPlayerMove.png";
    static String highContrastAiIcon = "src/com/company/Resources/HighContrastAiIcon.png";

    static Icon getIcon(String uri) {
        ImageIcon icon = new ImageIcon(uri);
        Image image = icon.getImage().getScaledInstance(60, 120, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public static Icon getClassicPlayerIcon() {
        return getIcon(classicPlayerIcon);
    }

    public static Icon getClassicAiIcon() {
        return getIcon(classicAiIcon);
    }

    static Icon getForestPlayerIcon() {
        return getIcon(forestThemePlayerIcon);
    }

    static Icon getForestAiIcon() {
        return getIcon(forestThemeAiIcon);
    }

    static Icon getHighContrastPlayerIcon() {
        return getIcon(highContrastPlayerIcon);
    }

    static Icon getHighContrastAiIcon() {
        return getIcon(highContrastAiIcon);
    }
}
