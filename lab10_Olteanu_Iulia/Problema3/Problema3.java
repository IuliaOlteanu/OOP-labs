package Problema3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

class Frame3 extends JFrame implements ActionListener, ItemListener {
    JTextField text;
    JCheckBox button1;
    JCheckBox button2;
    JCheckBox button3;
    JCheckBox button4;
    JButton button5;

    public Frame3(String title, String intrebare, String raspuns1, String raspuns2, String raspuns3, String raspuns4) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.pink);
        setLayout(new FlowLayout());

        text = new JTextField(intrebare);
        text.setEnabled(true);
        add(text);

        button1 = new JCheckBox(raspuns1);
        button1.addItemListener(this);
        add(button1);
        button2 = new JCheckBox(raspuns2);
        button2.addItemListener(this);
        add(button2);
        button3 = new JCheckBox(raspuns3);
        button3.addItemListener(this);
        add(button3);
        button4 = new JCheckBox(raspuns4);
        button4.addItemListener(this);
        add(button4);

        button5 = new JButton("Apasa");
        button5.addActionListener(this);
        add(button5);

        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            if(button1.isSelected() && button3.isSelected()) {
                button1.setBackground(Color.green);
                button3.setBackground(Color.green);
            }
            if(button1.isSelected() && !button3.isSelected())
                button1.setBackground(Color.green);
            if(!button1.isSelected() && button3.isSelected())
                button3.setBackground(Color.green);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED)
            button5.setEnabled(true);
        else
            button5.setEnabled(false);
    }
}
public class Problema3 {
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
        Frame3 obj = new Frame3("Problema 3", sir.get(0), sir.get(1), sir.get(2), sir.get(3), sir.get(4));
    }
}
