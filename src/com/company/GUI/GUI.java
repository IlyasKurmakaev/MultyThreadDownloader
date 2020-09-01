package com.company.GUI;

import com.company.ThreadFactory;
import com.company.URLStorage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ilyas on 07.08.2017.
 */
public class GUI extends JFrame {
    public JPanel jPanel;
    JButton addURL;
    JTextField URLText;
    public GUI()
    {
        addURL = new JButton("addURL");
        URLText = new JTextField("          ");
        add(addURL);
        add(URLText);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel , BoxLayout.Y_AXIS));
        add(jPanel);
        addURL.addActionListener(new Handler());

    }


    private static GUI gui;

    public static GUI getInstance()
    {
        if (gui == null)
        {
            gui = new GUI();
        }
        return gui;
    }
    public class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           if (e.getSource() == addURL)
           {
               synchronized (URLStorage.getURLStorageSingltone())
               {
                   URLStorage.getURLStorageSingltone().setURl(URLText.getText());
               }
               ThreadFactory.createThread();
           }
        }
    }


}