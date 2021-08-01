

public class Test {
    private static int k;
    static
    {
         k++;
        System.out.println("static initialization block:k="+k);
       

    }
    public static void main(String [] args)
    {
        System.out.println(Test.k);
    }
}
