class A
{
   public void f1(int x)
  {System.out.println("A1");}
}
class B extends A
{
    public void f1(int x)
  {System.out.println("B1");}
   
    public void f1(int x,int y)
  {System.out.println("B2");}
}

public class Overloading
{
   public static void main(String []args)
   {
     B obj=new B();
       obj.f1(5);
   }
}