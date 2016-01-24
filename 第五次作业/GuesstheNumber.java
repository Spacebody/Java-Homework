package homework5;
import java.util.Scanner;
public class GuesstheNumber 
{
    private static int YorN;
    public static void GuesstheNumber()
    {
        int n,m;
        Scanner input= new Scanner(System.in);
        m=(int)(1+Math.random()*1000);
        System.out.print("Guess a number between 1 to 1000.\n");
        do
        {
         
         n=input.nextInt();
         if(n-m<0)
         {
            System.out.print("Too low. Try again.\n");
            System.out.print("Guess a number between 1 to 1000.\n");
         }
         else if(n-m>0)
         {
            System.out.print("Too high. Try again.\n");
            System.out.print("Guess a number between 1 to 1000.\n");
         }
         else
         {
            System.out.print("Congratulations. You guessed the number!\n");
         }
        }while(m!=n);
       System.out.print("Do you what to play again?(Enter 1 for YES or 0 for NO.)\n");
       YorN=input.nextInt();
        
        
    }
    
    
    public static void main(String [] agrs)
    {
        GuesstheNumber();
        while(YorN==1)
        {
            GuesstheNumber a=new GuesstheNumber();
            a.GuesstheNumber();
      
        }
        if(YorN==0)
        {
            System.out.print("Game Over");
        }
       
        
    }


    
}
