import java.util.*;
class Palindrome
{
   public static void main(String[] args)
   { 
     Scanner sc=new Scanner(System.in);
     String s=new String(sc.next());
     String rev="";
    for(int i=s.length()-1;i>=0;i--)
    {rev=rev+s.charAt(i);}
     
    if(s.equals(rev))
     System.out.println("yes its a palindrome");


    else
     System.out.println("its not a palindrome");
   }
}