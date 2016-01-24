package homework3;

import java.util.Scanner;

public class FactorialB 
{
   public static void main(String[] args)
   {
      int n;
      double e=1,factorial=1;
      System.out.print("Enter an integer:");
      Scanner input=new Scanner(System.in);
      n=input.nextInt();
      if(n<=2)
      {
         System.out.print("Error");
      }
      else
      {  
        for(double i=1;i<=n;i++)
        {
            
            factorial=factorial*i;
            e=e+1/factorial;
        }
      System.out.print("e = "+e);
      }
   } 

}
