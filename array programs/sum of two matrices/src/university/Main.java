package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows and colums of matrix:");
        int rows= sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix1 = new int[rows][col];
        System.out.println("enter elements to insert in the array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }



        int[][] matrix2 = new int[rows][col];
        System.out.println("enter elements to insert in the array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("now we will print the sum of the two matrices");
        int [][]matrix3=new int[rows][col];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }

        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();

        }


    }
}