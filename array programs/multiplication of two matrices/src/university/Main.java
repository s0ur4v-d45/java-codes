package university;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows and columns of 1st matrix: ");
        int rows1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][col1];
        System.out.print("enter elements to insert in the array ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> Al=new ArrayList<>();
        System.out.print("enter the rows and columns of 2nd matrix: ");
        int rows2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][col2];
        System.out.print("enter elements to insert in the array: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if(rows2!=col1)
        {
            System.out.println("Invalid matrix multiplication");
        }
        else
        {
            System.out.println("the resultant array is:");
            int [][]matrix=new int[rows1][col2];
            for(int i=0;i<rows1;i++)
            {
                for(int j=0;j<col2;j++)
                {

                    for(int k=0;k<rows2;k++)
                    {
                        matrix[i][j]=matrix[i][j]+((matrix1[i][k])*(matrix2[k][j]));

                    }
                    System.out.printf("%3d  ",matrix[i][j]);
                }
                System.out.println();
            }


        }
    }
}