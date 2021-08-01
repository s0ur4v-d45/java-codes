import javax.swing.*;
import java.awt.event.*;
public class SwingJFrame extends JFrame{
    public SwingJFrame(final String s) {
        super(s);
    }

    public static void main(final String[] args) {
        final SwingJFrame jf = new SwingJFrame("sourav");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
   
}
