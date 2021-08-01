package university;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("now enter " + n + " elements to insert in the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i,j,k;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;)
            {
                if(a[i]==a[j])
                {
                    for(k=j;k<n;k++)
                    {
                        a[k]=a[k+1];
                    }
                    n--;
                }
                else
                {
                    j++;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]);
         }
    }
}