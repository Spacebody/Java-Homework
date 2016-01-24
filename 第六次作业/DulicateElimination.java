package homework6;
import java.util.Scanner;//调用Scanner
public class DuplicateElimination 
{
    public static void main(String[] args) 
    {
       int []a =new int[5];//定义一个含有五个元素的整型数组
       Scanner input=new Scanner(System.in);
       System.out.println("Enter fives integers (10~100):");//提示用户输入数字
       a[0]=input.nextInt();//先给第一个元素赋值方便后面比较
       for(int i=1;i<5;i++)//大循环
       {
          a[i]=input.nextInt();//循环赋值
          for(int m=0;m<i;m++)//对每个新的元素跟已有元素进行比较
          {
              if(a[i]==a[m])//判断条件是否重复
              {
                  break;//跳出当前循环
              }
              else
              {
                  System.out.println(a[i]);
                  break;
              }
          }
          for(int n=0;n<=i;n++)//循环输出所有已赋值元素
          {    
               if(a[n]!=a[i])
               { 
                  System.out.print(a[n]+"\t");
               }
          }
          
          
          System.out.print("\n");//换行而已
       }
        input.close();//关闭输入流
    }
    
}