import java.util.*;

interface atmclass{
    public void withdraw(int amount);
    public void deposit(int amount);
    public void checkBalance();
}

class User implements atmclass{

    private int balance,atmpin;
    public String userName;
    
    public static int minBalance=1000;
    public static int withdrawLimit=10000;
    
    User(String userName, int balance,int atmpin)
    {
        this.userName=userName;
        this.balance=balance;
        this.atmpin=atmpin;
    }

    //if the choice is withdraw
    public void withdraw(int amount){
        
        if(amount>withdrawLimit)
        {
            System.out.println("Withdraw limit Exceeded !!!\n");
            return;
        }
        else if(balance-amount<minBalance)
        {
            System.out.println("Insufficient Funds!!! \n");
            return;
        }
        balance-=amount;
        System.out.println("Rs."+amount+" is sucessfully withdrawn\n");
    }

    //if choice is deposit
    public void deposit(int amount)
    {
        System.out.println("Rs."+amount+" is sucessfully deposited into account \n");
        balance+=amount;
        this.checkBalance();
    }

    //if the choice is to check balance
    public void checkBalance(){
        System.out.println("Remaining Balance is Rs."+balance+"\n");
    }
}
public class atmInterface {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        User user=new User("Max", 5000, 2395);
        while (true) {
            System.out.println("\n***ATM INTERFACE***\n");
            System.out.println("1.WithDraw Amount\n");
            System.out.println("2.Deposit Amount\n");
            System.out.println("3.Check balance\n");
            System.out.println("Enter the choice:");
            int ch=in.nextInt();
            switch(ch){
                case 1: System.out.println("Enter amount to be withdraw:");
                        int amount=in.nextInt();
                        user.withdraw(amount);
                        break;
                case 2: System.out.println("Enter amount to be Deposit:");
                        int amt=in.nextInt();
                        user.deposit(amt);
                        break;
                case 3: user.checkBalance();
                        break;
                default: break;
            }
            break;
        }
        in.close();
    }
}
