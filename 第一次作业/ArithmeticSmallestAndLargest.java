package homework;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest 
{
    public static void main(String[] args)
    {        
     //2.13
       Scanner input = new Scanner(System.in); 
       int c;//这个还看不懂我也是醉了
       int d;
       int e;
       int sum1;
       int average;
       int product1;
       System.out.print("Enter the first number:");
       c = input.nextInt();
       System.out.print("Enter the second number: ");
       d = input.nextInt();
       System.out.print("Enter the third number:");
       e = input.nextInt();
       sum1= c+d+e;
       average=(c+d+e)/3;//考虑运算优先级,加法加括号提高加法运算优先级别
       product1=c*d*e;
       System.out.printf("sum is %d\n", sum1);//添加\n实现输出语句之后自动换行以便下一个语句的输出
       System.out.printf("average is %d\n",average);
       //下面对大小比较进行细分,然而这并不是最短的代码,但却是最清晰最一目了然的
       if(c>d&&d>e)//"&&"表示"且"
        {
           System.out.printf("%d is smallest.\n",e);
           System.out.printf("%d is largest.\n",c);
        }
       if(c>e&&e>d)
        { 
           System.out.printf("%d is smallest.\n",d);
           System.out.printf("%d is largest.\n",c); 
        }       
       if(d>c&&c>e)
        {
            System.out.printf("%d is smallset.\n",e);
            System.out.printf("%d is largest.\n",d);
        }
        if(d>e&&e>c)
        {
           System.out.printf("%d is smallset.\n",c);
           System.out.printf("%d is largest.\n",d);
        }
        if(e>d&&d>c)
        {
           System.out.printf("%d is smallset.\n",c);
           System.out.printf("%d is largest.\n",e);
        }    
       if(e>c&&c>d)
        {
           System.out.printf("%d is smallset.\n",d);
           System.out.printf("%d is largest.\n",e);
        }
       if(c==d&&d>e)
        {
           System.out.printf("%d is smallset.\n", e);
           System.out.printf("%d is largest.\n",d);
        } 
       if(c==d&&e>c)
        {
           System.out.printf("%d is smallset.\n",c);
           System.out.printf("%d is largest.\n",e);
        }
       if(d==e&&e>c)
        {
          System.out.printf("%d is smallset.\n",c);
          System.out.printf("%d is largest.\n",e);  
        }
       if(d==e&&e<c)
        {
           System.out.printf("%d is smallset.\n",e);
           System.out.printf("%d is largest.\n",c);
        }
       if(c==e&&e>d)
        {
           System.out.printf("%d is smallset.\n",d);
           System.out.printf("%d is largest.\n",e);
        }
       if(c==e&&d>c)
        { 
           System.out.printf("%d is smallset.\n",c);
           System.out.printf("%d is largest.\n",d);
        }
       if(c==e&&e==d)
        {
            System.out.print("These number is equal.");
        }//幸苦了,容我水一发*/    
    }
}
    
