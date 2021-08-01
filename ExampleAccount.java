import java.util.Scanner;
class Account
{
   private int bal;
   public Account(int bal)
   {
       this.bal=bal;
   }
   public boolean isSufficientBalance(int w)
   {
       if(bal>w)
       return true;
       else
       return false;
   }
   public void withdrawal(int amt)
   {
       if(bal>amt)
       {
           bal=bal-amt;
           System.out.println("withdrawal amount is="+amt);
           System.out.println("your balance is="+bal);
       }
   }

}

class Customer implements Runnable
{
    private Account account;
    private String name;
    public Customer(Account account,String name)
    {
        this.account=account;
        this.name=name;
    }
    public void run()
    {
    synchronized(account)
    {
        System.out.println(name+" enter the balance to withdraw");
        Scanner kb=new Scanner(System.in);
        int amt=kb.nextInt();
        
        if(account.isSufficientBalance(amt))
        {
           account.withdrawal(amt);
        }
        else{
            System.out.println(name+"insufficient balance");
        }

    }
    }
}


public class ExampleAccount
{
    public static void main(String args[])
    {
        Account a1=new Account(1000);
        Customer c1=new Customer(a1,"sourav");
        Customer c2=new Customer(a1,"shukla");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}