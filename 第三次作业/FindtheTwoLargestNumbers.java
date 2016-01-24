package homework3;

import java.util.Scanner;

public class FindtheTwoLargestNumbers 
{
    public static void main(String[] agrs)
    {
        int counter=0,number,largest1=0,largest2=0;
         
        while(counter<10)
        {
          System.out.print("Enter a number:");
          Scanner input=new Scanner(System.in);
          number=input.nextInt();
          if(counter==0)
          {
              largest1=number;
          }
          else if(number>largest1)
          {
               largest2=largest1;
               largest1=number;               
          }  
          counter++;
        }
        
        System.out.printf("The largest number is %d\n",largest1);
        System.out.printf("The second largest number is %d\n",largest2);
    }     
}
         

