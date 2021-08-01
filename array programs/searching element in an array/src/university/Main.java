package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("now enter "+n+" elements to insert in the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element to search");
        int value= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==value)
            {
                System.out.println("the element("+value+") found at "+i+"th index");
            }
        }
    }
}
