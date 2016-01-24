package homework2;
import java.util.Scanner;
public class AccountTest 
{
    public static void main(String[] args)
    {
        Account account=new Account(100.00);
        
    System.out.printf("account balance is $%.2f\n",account.getBalance());
    
    Scanner input=new Scanner(System.in);
    double debitAmount;
    
    System.out.print("Enter debit amount for account:$");
    debitAmount = input.nextDouble();
    
    if(account.getBalance()<debitAmount)
    {
       System.out.print("Debit amount exceeded account balance.\n");
       System.out.printf("acconut balance is $%.2f",account.getBalance());
    }    

    else
    {
       System.out.printf("\ndebiting $%.2f from account balance\n\n",debitAmount);
       account.debit(debitAmount);
       System.out.printf("account balance: $%.2f\n",account.getBalance());
    }   
    
    }

}
