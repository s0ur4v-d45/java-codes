class MaxOccuringChar
{
   public static void main(String[] args)
   {
     int [] arr=new int[127];
    String s=new String("kaluiwebljalkjxjclakjsdhf");
    for(int i=0;i<s.length();i++)
   {
     arr[s.charAt(i)]=arr[s.charAt(i)]+1;
   }
char c=' ';
int max=-1;
 for(int i=0;i<s.length();i++)
{
  if(max<arr[s.charAt(i)])
{max=arr[s.charAt(i)];
c=s.charAt(i);}

}
System.out.println("the character is "+c);
System.out.println("the maximum occurence frequency is:"+max);
  
    }



}