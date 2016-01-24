package homework6;
import java.util.Arrays;//调用Arrays方便输出数组
import java.util.Scanner;

public class P711 
{
     /*构造方法product
       该方法返回值为一个整型数组
       含有一个整型变量n
     */
    public static int[] product(int n) 
    {
        int numbers[]=new int[n];//定义一个含有n个元素的整型数组
       Scanner input=new Scanner(System.in);
       for(int i=0;i<n;i++)//通过循环给数组赋值
       {
           numbers[i]=input.nextInt();
       }
        input.close();//关闭输入流
        return numbers;//返回数组
    }
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter argument's amount:");//提示用户输入变量数
        int n=input.nextInt();
        int []numbers=product(n);//调用方法product
        System.out.print(Arrays.toString(numbers));//输出数组numbers
        input.close();
    }
}