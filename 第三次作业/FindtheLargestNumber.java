package homework3;
import java.util.Scanner;

public class FindtheLargestNumber 
{
    public static void main(String[] agrs)
    {
        int counter=0,number,largest=0;
         
        while(counter<10)
        {
          System.out.print("Enter a number:");
          Scanner input=new Scanner(System.in);
          number=input.nextInt();
          if(counter==0)
           {
              largest=number;
           }
          else if(number>largest)
           {
              largest=number;
           }
          counter++;
        }
        
        System.out.printf("The largest number is %d\n",largest);    
    }     
}
        
        
       

