package homework;

import java.util.Scanner;

public class NetivePositiveZeroValue 
{
  public static void main(String[] args)
    {
    //2.25    
        System.out.print("Enter five numbers with comma separating:");
        int[] arr= new int[5];//定义一个整型数组
        int a=0;
        int b=0;
        int c=0;
        Scanner input = new Scanner(System.in);
        String inputString=input.next();//将命令窗口中输入的字符串赋值给inputString
        String stringArray[]=inputString.split(",");//使输入的字符串以逗号分隔
        for(int i=0;i<5;i++)//for循环用以逐个读取数据
        {
        arr[i]=Integer.parseInt(stringArray[i]);//按位取字符并且解析到int型,然后翻入array中    
           if(arr[i]>0)
                {
                    a++;
                }
           if(arr[i]<0)
                {
                    b++;  
                }
           if(arr[i]==0)
                {
                    c++;
                }//三个if语句用以判断正负数和0然后输出
        }   
        System.out.printf("the number of positive numbers is %d\n",a);
        System.out.printf("the number if negative number is %d\n",b);
        System.out.printf("the number of zero is %d\n",c); 
    }
}
