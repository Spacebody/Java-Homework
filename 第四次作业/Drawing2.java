
package homework4;

public class Drawing2 
{
     public void Drawing2(int n)
    {
       for(int m=n;m>0;m--)
       {
         for(int l=(n-m);l>0;l--)
         {
             System.out.print(" ");
         }
         for(int i=m;i>0;i--)
         {    
            System.out.print("*"); 
            
         }  
              System.out.print("\n");   
       }
    }
    
}
