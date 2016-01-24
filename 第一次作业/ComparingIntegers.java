package homework;

import java.util.Scanner;

public class ComparingIntegers 
{
    public static void main(String[] args) 
    {
    //2.12
        Scanner input = new Scanner(System.in);   
        int a;
        int b;
        System.out.print("Enter one integer for a:");
        a=input.nextInt();
        System.out.print("Enter the other integer for b:");
        b=input.nextInt();
        if(a==b)
        {
            System.out.print("These numbers are equeal");
        }//使用大括号括起来是一种良好的习惯,因为以后写程序可能出现嵌套语句,所以括起来
        if(a<b)
        {    
            System.out.printf("%d is larger",b);
        }
        if(a>b)
        {
            System.out.printf("%d is larger",a);//三个if语句今年进行判断
        }
    }
}//完美的缩进是另一种好习惯
