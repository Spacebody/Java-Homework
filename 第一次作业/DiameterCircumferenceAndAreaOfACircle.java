package homework;

import  java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle 
{
    public static void main(String[] args)
    {
//2.22
    Scanner input = new Scanner(System.in);
       int r;
       int diameter;
       double circumference;//定义一个单精度浮点型变量
       double area;//双精度浮点型变量
       System.out.print("Enter a number as the radius:");
       r = input.nextInt();
       diameter = 2*r;
       circumference = 2*Math.PI*r;//调用PI
       area = Math.PI*r*r;
       System.out.printf("diameter is %d\n",diameter);
       System.out.printf("circumference is %g\n",circumference);
       System.out.printf("area is %g\n", area);//"g”也可以换成"f",单就这一题来说并没太多意义
    }   
}
