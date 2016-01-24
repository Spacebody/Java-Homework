package homework4;

import java.util.Scanner;

public class Drawing2Test 
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
        
        Drawing2 String=new Drawing2();
        String.Drawing2(n);
        System.out.printf("%s",String);
      }
      input.close();
  } 
}
