package ll;

public class Runner {
    public static void main(String arg[])
    {
       LinkedList linkedList=new LinkedList();
       linkedList.insert(5);
       linkedList.insert(6);
       linkedList.insert(7);
       linkedList.insertAtBeg(4);
       linkedList.insertAtBeg(2);
       linkedList.insertAt(1,3);
       linkedList.deleteAt(2);

       linkedList.show();
    }
}
