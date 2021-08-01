

import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame{
    public Swing(String s) {
        super(s);
    }
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            l4.setText("The sum is="+c);

        }
    }
    public void initializer()
    {

        l1=new JLabel("addition of two numbers");
        l2=new JLabel("first number");
        l3=new JLabel("second number");
        l4=new JLabel();
        t1= new JTextField();
        t2= new JTextField();
        b1= new JButton("ADD");
        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,80,100,20);
        t1.setBounds(150,80,100,20);
        l3.setBounds(50,130,100,20);
        t2.setBounds(150,130,100,20);
        b1.setBounds(90,180,100,20);
        l4.setBounds(90,220,200,20);
        b1.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
    }

    public static void main(String[] args) {
        Swing jf = new Swing("sourav sum");
        jf.initializer();
        jf.setSize(300,300);
        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

