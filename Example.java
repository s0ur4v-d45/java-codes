
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1 ;
    JPanel panel;
    Border border = BorderFactory.createLineBorder(Color.yellow,3);

   Example()
{
  this.setTitle("Welcome");
  this.setSize(400,400);
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  ImageIcon image= new ImageIcon("Walpaper.png");
  this.setIconImage(image.getImage());
  this.setVisible(true);
  this.getContentPane().setBackground(Color.black);
  b1= new JButton("Click Me");
  b1.setLayout(null);
  b1.setBounds(20,20,50,50);
  b1.addActionListener(this);
  panel= new JPanel();
  //panel.setBackground(Color.yellow);
  panel.setBounds(0,300,200,200);
  panel.add(b1);
  l1= new JLabel(" Are you ready for surprise");
  l1.setForeground(new Color(0x00fff0));
  l1.setFont(new Font("MV Boli",Font.BOLD,20));
  l1.setBorder(border);
  l1.setBounds(0,0,300,100);
  l1.setBackground(Color.black);
  this.add(l1);
  this.add(panel);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ati sundr  🥳💐💐🏵️🏵️🏵️🌸🌸🌺🌹🌹🌹💐💐💐💐💐💮💮🌼🌼😘😘😘😘😘😘\n");
        System.out.println("          🕯️ 🕯️");
        for(int i=3;i<=11;i=i+2)
        {
            for(int j=1;j<=11-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==3)
                    System.out.print("💙"+" ");
                else if(i==5)
                    System.out.print("😍"+" ");
                else if(i==7)
                    System.out.print("😘"+" ");
                else if(i==9)
                    System.out.print("😍"+" ");
                else if(i==11)
                    System.out.print("❤️"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       new Example();
    }
}