package ll;

public class LinkedList {
    Node head;

    public void insert(int data)
    {

        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void show()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
     public void insertAtBeg(int data)
     {
         Node node=new Node();
         node.data=data;
         node.next=null;

         node.next=head;

         head=node;
     }

     public void insertAt(int index,int data)
     {
         Node temp=head;

         Node node=new Node();
         node.data=data;

         while(index>1)
         {
             temp=temp.next;
             index--;
         }

         node.next=temp.next;
         head.next=node;

     }

     public void deleteAt(int index)
     {
         Node temp=head;

         while(index>1)
         {
             temp=temp.next;
             index--;
         }
         Node temp1=temp.next;
         temp.next=temp1.next;
         System.gc();
     }
     public int size()
     {
         Node temp=head;
         int count=1;

         if(temp==null)
             return 0;

         while(temp!=null)
         {
             temp=temp.next;
             count++;
         }
         return count;
     }
}
