package homework5;
import java.util.Scanner;
public class ParkingCharges 
{
    private static double money;
    public static double calculateCharges(double a)
    {
        if(a<=0)
        {
            System.out.print("Error");
        }
        else if(a<=3)
        {
            money=3;
        }
        else
        {
            money=3+(a-3)*0.50;
            if(money>10)
            {
                money=10;
            }
        }
        return money;
    }
    
    
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter parking hours:");
        double a=input.nextDouble();
        System.out.print(calculateCharges(a));
  
    }
    
}
