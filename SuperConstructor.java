class A
{
   A()
{System.out.println("i am constructor from parent");}
 public void method()
{System.out.println("i m method from parent class");
}
}
class B extends A
{
   B(int y)
   {

System.out.println("i am constructor from child");} 
   public void method()
{super.method();System.out.println("i m method from child class");
}
}

public class SuperConstructor
{
    public static void main(String[] args)
    {B obj=new B(123);
obj.method();
}
}