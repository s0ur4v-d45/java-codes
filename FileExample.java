import java.io.*;

public class FileExample
{ 
  public static void main(String[] args) throws IOException
  {
     File f=new File("./dhinchak.txt");
     f.createNewFile();
     FileOutputStream fout=new FileOutputStream(f);
     String s="hello bhai";
     byte ch[]=s.getBytes();
     
     
       fout.write(ch);
      
     fout.close();
  }
}