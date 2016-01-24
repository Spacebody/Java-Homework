
package homework4;


public class NarcissisticNumbers 
{
    public static void main(String[] args)
    {
        int a,b,c,m=0;
       for(int i=100;i<1000;i++)
       {
           a=i/100;
           b=(i-a*100)/10;
           c=i-a*100-b*10;
           if(i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))
           {
               System.out.print(i+"\t");
               m++;
           }
       }
        
 System.out.printf("\nThe amount of Narcissistic numbers: %d",m);   
        
        
        
        
        
    }
}
