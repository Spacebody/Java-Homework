package homework5;
import java.util.Scanner;

public class DisplayingaSquareofAnyCharacter 
{
   private static char fillCharacter;
   private static int side;
   public static void square(char fill,int n)
   {
      fillCharacter =fill;
       side = n;
       for(int i=0;i<side;i++)
       {
           for(int m=0;m<side;m++)
           {
               System.out.print(fillCharacter);
           }
           System.out.print("\n");     
       }
   }
    public static void main(String agrs [])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character:\n");
        char fill = input.next().charAt(0);
        System.out.print("Enter an integer:\n");
        int n = input.nextInt();
        square(fill,n);
        input.close();
    }
    
    
    
    
}
