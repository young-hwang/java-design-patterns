package io.github.younghwang.gofbasic._08_composite._03_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompositeInJava {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        JTextField jTextField = new JTextField();
        jTextField.setBounds(200, 200, 200, 40);
        jFrame.add(jTextField);

        JButton jButton = new JButton("click");
        jButton.setBounds(200, 100, 60, 40);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("Hello Swing");
            }
        });

        jFrame.add(jButton);

        jFrame.setSize(600, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
