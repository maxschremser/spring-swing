package com.schremser.swing.spring;

import javax.swing.*;

public class MainFrame extends JFrame {

    private String[] args;

    public MainFrame(String title) {
        super();
        setTitle(title);
        setSize(640,480);
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
