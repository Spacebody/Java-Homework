
package homework4;
import java.util.Scanner;

public class MaxAndAverage 
{
   public static void main(String[] args)
   {
     int n,i=0,num,max,sum,average;
     System.out.print("How many numbers will be entered:");
     Scanner input=new Scanner(System.in);
     n=input.nextInt();
     max=input.nextInt();
     sum=max;
     do
     {
        num=input.nextInt();
        sum=sum+num;
        if(num>max)
        {
           max=num; 
        }
        i++;
     }while(i<n-1);
     average=sum/n;
     System.out.printf("Max number is %d\n",max);
     System.out.printf("Average is %d\n",average);
     input.close();
   }
}
