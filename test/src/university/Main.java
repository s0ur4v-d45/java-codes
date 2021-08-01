package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string input.");
        String s=sc.nextLine();
        int n= (int)fun(s);
        System.out.println(n);
    }

    static double fun(String s) {
      try
      {
          double n = Double.parseDouble(s);
          return n;
      }
      catch(NumberFormatException e)
        {

            return -1;
        }


    }
}
