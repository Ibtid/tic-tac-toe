package com.company;

import com.company.Panel.Panel;

import javax.swing.*;

public class Frame {
    JFrame frame = new JFrame();
    Panel panel ;

    Frame(Panel panel){
        this.panel = panel;
        displayFrame();
    }

    public void displayFrame(){
        frame.setContentPane(panel.mainPanel);
        frame.pack();
        frame.setSize(600,600);
        frame.setLocation(320,50);
        frame.setVisible(true);
    }
}
