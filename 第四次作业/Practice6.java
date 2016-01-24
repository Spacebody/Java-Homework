
package homework4;

public class Practice6 
{
  public static void main(String[] args) 
    {    
        int i=0;
        double sum=0, n=2;
        while(true)
        {
          sum=sum+1/n; 
          n++;
          i++;
           if(sum>6)
           {
               break;
           }
        }
         System.out.print(i);
    }
    
}
