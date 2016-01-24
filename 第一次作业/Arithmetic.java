package homework;

import java.util.Scanner;//调用Scanner

public class Arithmetic 
{

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
     //2-11
       int num1;//定义整形变量
       int num2;//水一发
       int sum;
       int product;
       int difference;
       int quotient;
       System.out.print("Enter the first number:");//输出操作指令
       num1 = input.nextInt();//赋值
       System.out.print("Enter the second number:");
       num2 = input.nextInt();
       sum= num1+num2;//进行运算
       product= num1*num2;
       difference = num1-num2;
       quotient = num1/num2;
       System.out.printf("sum is %d\n", sum);//输出结果
       System.out.printf("product is %d\n", product);
       System.out.printf("difference is %d\n", difference);
       System.out.printf("quotient is %d\n", quotient);//完美结束,最后水一发
    }
}

