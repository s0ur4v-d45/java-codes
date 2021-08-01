package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui2 extends Frame {
    Label l1, l2;
    TextField t1, t2,t3,t4,t5,t6;
    Button b1, b2, b3, b4;
    public class Sum implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t1.getText());
            int sum = a + b;
            

        }
    }
        public class Sub implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t1.getText());
                int sub = a - b;

            }
        }
            public class Mul implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t1.getText());
                    int mul = a * b;
                }
            }
                public class Div implements ActionListener {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(t1.getText());
                        int b = Integer.parseInt(t1.getText());
                        int div = a / b;
                    }
                }
    public void initializer() {
        Frame f = new Frame("Calculator");
        f.setSize(400, 400);
        l1 = new Label("First Number");
        l1.setBounds(30, 30, 90, 30);
        l2 = new Label("Second Number");
        l2.setBounds(30, 80, 90, 30);
        t1 = new TextField();
        t1.setBounds(150, 30, 50, 30);
        t2 = new TextField();
        t2.setBounds(150, 80, 50, 30);
        b1 = new Button("Add");
        b1.setBounds(30, 130, 30, 30);
         t3 = new TextField(b1.addActionListener(new Sum()));
        t3.setBounds(150,130,30,30);
        b2 = new Button("Sub");
        b2.setBounds(30, 180, 30, 30);
         t4 = new TextField(b2.addActionListener(new Sub()));
        t4.setBounds(150,180,30,30);
        b3 = new Button("Mul");
        b3.setBounds(30, 230, 30, 30);
         t5 = new TextField(b3.addActionListener(new Mul()));
        t5.setBounds(150,230,30,30);
        b4 = new Button("Div");
        b4.setBounds(30, 280, 30, 30);
         t6 = new TextField(b4.addActionListener(new Div()));
        t5.setBounds(150,280,30,30);
        f.add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(t3);
        add(b2);
        add(t4);
        add(b3);
        add(t5);
        add(b4);
        add(t6);
        setVisible(true);
    }
    public static void main(String[] args) {
        Gui2 cal = new Gui2();
        cal.initializer();
    }
}
