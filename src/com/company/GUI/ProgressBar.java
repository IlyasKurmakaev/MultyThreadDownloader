package com.company.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ilyas on 07.08.2017.
 */
public class ProgressBar extends JPanel{

    private JProgressBar progressBar;
    private JLabel label;
    public ProgressBar(String nameOfLabel)
    {
        progressBar = new JProgressBar();
        progressBar.setValue(0);
        label = new JLabel();
        label.setText(nameOfLabel);
        setLayout(new FlowLayout());
        add(label);
        add(progressBar);
        progressBar.setStringPainted(true);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
    }


    public void setProgressBar(int progress)
    {
        progressBar.setValue(progress);
    }

}