//sum of digits of a number
import java.util.*;
class SumOfDigits
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
  int number=sc.nextInt();
  int sum=0;
  int lastdigit=0;
  while(number>0)
  {
     lastdigit=number%10;
     sum+=lastdigit;
     number/=10;
  }
  System.out.println("sum of the digits of entered number is="+sum);
 }
} 
