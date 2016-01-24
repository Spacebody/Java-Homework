package homework3;

import java.util.Scanner;

public class FactorialC 
{
    public static void main(String[] args)
    {
        double ex=1,x,factorial=1;
        int n,t;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
	n = input.nextInt();
        t=n;
        System.out.print("Enter an integer for x:");
        x = input.nextInt();
        if(n<=2)
        {
            System.out.print("Error");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                x=Math.pow(x,i);
                factorial=factorial*i;
                ex=ex+x/factorial;
            }
  	  System.out.println("e^x="+ex);
        }
    }
}