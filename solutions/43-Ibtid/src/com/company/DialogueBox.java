package com.company;

import javax.swing.*;

public class DialogueBox {
    public void createDialogueBox(String message) {
        String title = "Match Result";
        JOptionPane.showOptionDialog(null, message, title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }
}
