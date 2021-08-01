import java.util.Random;
 public class Main
 {
 public static void main(String[] args)
 {
 int a = 10, b, result;
 Random r= new Random();
 if (r.nextBoolean())
 {
 b = 0;
 }
 else
 {
 b= 2;
 }
 try {
 result = a/b;
 System.out.println("Try Block Executes : no exception is occured.");
 }
 catch (Exception e)
 {
 System.out.println("Catch Block Executes :exception is occured.");
 }
 finally
 {
 System.out.println("Finally Block: Always EXecutes.");
 }
 }
 }