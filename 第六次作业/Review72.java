package homework6;

import java.util.Scanner;

public class Review72 
{
     public static void main(String[] args)
     {
         int n;
         Scanner input=new Scanner(System.in);
         System.out.print("Enter the amount of arguments:");
         n=input.nextInt();
        if(n<0)//判断是否输入科学的值，如果是负数就默认为10
        {
            n=10;
        }
        else
        {
            n=n;//讲值赋给n;
        }
        int [] array=new int[n];//定义一个n个元素的数组
         System.out.printf("%s%8s\n","Index","Value");//输出表头
         
         for(int counter=0;counter<array.length;counter++)//循环输出数组
         {
             System.out.printf("%5d%8d\n",counter,array[counter]);
         }    
         input.close(); 
     }
}
