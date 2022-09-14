package Problema1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame1 extends JFrame implements ActionListener {
    JButton button;
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JTextField text4;

    public Frame1(String title, String disc, String cale, String nume_fisier) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        button = new JButton("Apasa");
        button.addActionListener(this);
        add(button);

        text1 = new JTextField(30);
        add(text1);

        text2 = new JTextField(30);
        add(text2);

        text3 = new JTextField(30);
        add(text3);

        text4 = new JTextField(30);
        add(text4);

        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        if(button.getText().equals("Apasa"))
            text4.setText(text1.getText() + "\\" + text2.getText() + "\\" + text3.getText());
    }
}

public class Problema1 {
    public static void main(String args[]) {
        Frame1 obj = new Frame1("Problema 1", "","","");
    }
}
