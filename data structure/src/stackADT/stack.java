package stackADT;

public class stack {
    int stack[]=new int[5];
    int top=-1;

    public void push(int data)
    {
        if(!isFull())
         stack[++top]=data;

        else
            System.out.println("stack  is full");
    }

    public void pop()
    {
        if(!isEmpty())
        System.out.println(stack[top--]);

        else
            System.out.println("stack is empty");
    }
    public int peek()
    {
        return stack[top];
    }
    public int size()
    {
        return top+1;
    }
    public boolean isEmpty()
    {
        return top<0;
    }
    public boolean isFull()
    {
        return top>=4;
    }
}
