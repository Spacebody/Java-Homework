
package homework4;
import java.util.Scanner;

public class DrawingTest 
{
     public static void main(String[] args) 
  {
      int n;
      System.out.print("Enter an integer:");
      Scanner input = new Scanner(System.in);
      n=input.nextInt();
      if(n>10)
      {
          System.out.print("Error");
      }
      else
      {
        System.out.print(n+"\n");
        Drawing String=new Drawing();
        String.Drawing(n);
        System.out.print(String);
      }
      input.close();
  } 
}
