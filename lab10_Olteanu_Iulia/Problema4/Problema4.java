package Problema4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class Frame4 extends JFrame implements ChangeListener {
    JSlider cursor1;
    JSlider cursor2;
    JSlider cursor3;
    JTextField text;
    public Frame4(String title) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.pink);
        setLayout(new FlowLayout());

        text = new JTextField("Problema 4 lab POO");
        add(text);

        cursor1 = new JSlider(JSlider.HORIZONTAL, 0, 255,1);
        cursor1.setBackground(Color.red);
        cursor1.addChangeListener(this);
        add(cursor1);

        cursor2 = new JSlider(JSlider.HORIZONTAL, 0, 255,10);
        cursor2.setBackground(Color.green);
        cursor2.addChangeListener(this);
        add(cursor2);

        cursor3 = new JSlider(JSlider.HORIZONTAL, 0, 255,100);
        cursor3.setBackground(Color.blue);
        cursor3.addChangeListener(this);
        add(cursor3);

        setVisible(true);
        pack();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        Color c = new Color(cursor1.getValue(), cursor2.getValue(), cursor3.getValue());
        text.setForeground(c);
    }
}
public class Problema4 {
    public static void main(String args[]) {
        Frame4 obj = new Frame4("Problema 4");

    }
}
