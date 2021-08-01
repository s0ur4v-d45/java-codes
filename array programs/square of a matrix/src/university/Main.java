package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows and columns of matrix: ");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix= new int[rows][col];
        System.out.print("enter elements to insert in the array ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if(rows!=col)
        {
            System.out.println("square cant be done because of invalid order.");
        }
        else
        {
            System.out.println("the resultant array square of matrix is:");
            int [][]matrix1=new int[rows][col];
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<col;j++)
                {

                    for(int k=0;k<rows;k++)
                    {
                        matrix1[i][j]=matrix1[i][j]+((matrix[i][k])*(matrix[k][j]));

                    }
                    System.out.printf("%3d  ",matrix1[i][j]);
                }
                System.out.println();
            }


        }
    }
}