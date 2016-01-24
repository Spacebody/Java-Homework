package homework7;


public class testDateClass 
{
   public static void main(String[] agrs)
   {
       int day = 19, month = 12, year = 2015; 
       String Month = "December"; //定义变量
       DateClass D1 = new DateClass(day, month, year);
       D1.OutputDate(day, month, year);//调用第一个方法
       DateClass D2 = new DateClass(day, month, year);
       D2.OutputDate(day, Month, year);//调用第二个方法
       DateClass D3 = new DateClass(day, month, year);
       D3.OutputDate(day, year);//调用第三个方法
       
   }
}
