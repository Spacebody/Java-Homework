package homework3;
import java.util.Scanner;
public class SalesCommissionCalculator 
{
   public static void main(String[] args)
  {
    
    double a=239.99;
    double b=129.75;
    double c=99.95;
    double d=350.89;
    double pay;
    double SalesAchievement;
    int e,f,g,h;
    
    System.out.print("Enter four numbers as the quantity of items:");    
    
    Scanner input=new Scanner(System.in);
    e=input.nextInt();
    f=input.nextInt();
    g=input.nextInt();
    h=input.nextInt();
    
    SalesAchievement=e*a+f*b+g*c+h*d;
    
    pay=SalesAchievement*0.09+200;
  
    System.out.printf("The pay for the salesperson is $ %.2f\n",pay);
 
        
   }
    
}
