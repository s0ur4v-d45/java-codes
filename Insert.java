import java.util.Scanner;
public class Insert
{
    Scanner sc=new Scanner(System.in);
    public static void main(final String a[]) {
        int p[] = new int[11];
        for (int i = 0; i < 10; i++) {
            p[i] = sc.nextInt();
        }
        System.out.println("enter the index and element you want to insert");
        int index = sc.nextInt();
        int element = sc.nextInt();

         for(int i=10;i>=index;i--)
         {
             p[i+1]=p[i];
         }
         p[index]=element;
    }
}