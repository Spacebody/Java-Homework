package homework3;
import java.util.Scanner;
public class FactorialA 
{
  public static void main(String[] args)
  {
      int n,factorial=1;
      System.out.print("Enter an integer:");
      Scanner input=new Scanner(System.in);
      n=input.nextInt();
      if(n==0)
      {
          System.out.println("The factorial is 1.");
      }
      else
      {
        while(n>0)
        {
          factorial=factorial*n;
          n--;
        }
      System.out.printf("The facotrial is %d.",factorial);
      }
      
  }
}
