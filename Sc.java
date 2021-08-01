import java.util.*;
class Sc
{
  public static void main(String args[])
 {  
   Scanner inn=new Scanner(System.in);
  // String name1= new String(inn.nextLLine());
  //String name2= new String(inn.nextLine());
  
  String name1= inn.nextLine();
  String name2= inn.nextLine();
  inn.close();
    
   if(name1.equals(name2))
   {System.out.println("same");}

  else
  {System.out.println("not same");}
 }
}