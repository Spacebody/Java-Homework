package homework2;

public class Account 
{
    private double balance;
    
    public Account(double initialBalance)
    {
        if(initialBalance >0.0)
            balance = initialBalance;
    }
    
    public void debit(double amount)
    {
        balance = balance-amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
}
