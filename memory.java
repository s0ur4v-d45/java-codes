class memory 
{
    public static void main(String[] args) 
    {
      System.out.println("Total Memory");
      Runtime obj=Runtime.getRuntime();
      System.out.println(obj.totalMemory());   
      System.out.println("Free Memory\n"+obj.freeMemory());
 System.out.println("max Memory\n"+obj.maxMemory());
obj.gc();
    System.out.println("Free Memory after gc\n"+obj.freeMemory()); //free memory after running gc
    System.out.println("Total Memory after gc\n"+obj.totalMemory()); //Total memory after running gc
    
    System.out.println("");
System.out.println("USed Memory\n"+(obj.totalMemory()-obj.freeMemory())); //free memory

    }
}