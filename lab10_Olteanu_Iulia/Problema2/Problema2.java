package Problema2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

class Frame2 extends JFrame implements ActionListener {
    JTextField text;
    JRadioButton button1;
    JRadioButton button2;
    JRadioButton button3;
    JRadioButton button4;
    JButton button5;

    public Frame2(String title, String intrebare, String raspuns1, String raspuns2, String raspuns3, String raspuns4) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.pink);
        setLayout(new FlowLayout());

        text = new JTextField(intrebare);
        text.setEnabled(true);
        add(text);

        button1 = new JRadioButton(raspuns1);
        button1.addActionListener(this);

        button2 = new JRadioButton(raspuns2);
        button2.addActionListener(this);

        button3 = new JRadioButton(raspuns3);
        button3.addActionListener(this);

        button4 = new JRadioButton(raspuns4);
        button4.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button5 = new JButton("Apasa");
        button5.addActionListener(this);
        button5.setEnabled(false);
        add(button5);

        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JRadioButton) {
            if(((JRadioButton) e.getSource()).isSelected())
                button5.setEnabled(true);
        } else if(e.getSource() instanceof JButton) {
            if(button1.isSelected())
                button1.setBackground(Color.green);
            else
                button1.setBackground(Color.red);
        }
    }
}

public class Problema2 {
    public static void main(String args[]) {
        File text = new File("D:\\Facultate\\ANUL 2\\SEM1-Iulia\\Programare Orientata pe Obiecte\\laborator10\\src\\intrebare.txt");
        Scanner citire = null;
        Vector<String> sir = new Vector<>();
        String s = new String();
        try {
            citire = new Scanner(text);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Fisierul nu exista");
        }
        while(citire.hasNextLine()) {
            s = citire.nextLine();
            System.out.println(s);
            sir.add(s);
        }
        Frame2 obj = new Frame2("Problema 2", sir.get(0), sir.get(1), sir.get(2), sir.get(3), sir.get(4));
    }
}
