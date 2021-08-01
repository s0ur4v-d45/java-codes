package university;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Frame obj=new Frame();
    }
}

class app extends Frame
{
    @Override
    public void setSize(int width, int height) {
        super.setSize(300, 300);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(true);
    }
}
