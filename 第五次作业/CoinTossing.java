package homework5;
import java.util.Scanner;

public class CoinTossing 
{   
    static int head=0,talls=0,n;
    private static enum CoinEnum{HEAD,TALLS};
    public static void flip()
    {
        n=(int)(Math.random()*2);
        if(n==1)
        {
            System.out.print(CoinEnum.HEAD+"\n");
            head++;
        }
        else
        {
            System.out.print(CoinEnum.TALLS+"\n");
            talls++;
        }
   
    }
   
    public static void main(String agrs [])
    {
        int m;
       Scanner input=new Scanner(System.in);  
       do
       {
             System.out.print("Enter any number as coin tossing or 1 as stop:");
             m=input.nextInt();
             flip();
       }while(m!=1);
       if(m==1)
       {
          System.out.printf("The head appears %d times,and the talls appears %d times.",head,talls);
          input.close();
       }
    }
}
