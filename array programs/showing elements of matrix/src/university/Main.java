package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows and colums:");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int [][]matrix= new int[rows][col];
        System.out.println("enter elements to insert in the array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("now printing all the elements in the matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
