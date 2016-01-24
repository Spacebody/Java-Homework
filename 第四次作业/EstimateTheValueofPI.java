
package homework4;

public class EstimateTheValueofPI 
{
   public static void main(String[] args)
   {
      double PI=4,y=1,m=3,delta;
      int i=1;
      while(true)
      {
          PI=PI+(Math.pow(-1,y)*4)/m;
          m=m+2;
          y++;
          delta=PI-3.141;
          if(Math.abs(delta)<0.0005)
          {
              break;
          }          
          i++;
      }
      System.out.printf("π = %.3f\n",PI);
      System.out.printf("Circle index is %d",i);
   
   }
}
