package homework7;

public class DateClass 
{
   /*
    定义所需变量和数组
   */
   private int day, month, year;
   private final int [] Month1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
   private final String [] Month2 = { "error", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
   private int [] MonthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
   private int SumDay = 0;
   
   //构造方法
   public DateClass( int Day, int Month, int Year )
   {
       day = Day;
       month = Month;
       year = Year;
   }
   
   //第一个方法（first case)
   public void OutputDate(int DD, int MM, int YYYY)
   {
       day = DD;
       month = MM;
       year = YYYY;
       System.out.printf( "%d/%d/%d\n", day, Month1[month], year );

   }
   
   //第二个方法（second case)
   public void OutputDate(int DD, String MM, int YYYY)
   {
       String Month;
       day = DD;
       if(MM.equals(Month2[month]))//调用equals函数判断对应月份是否正确
       {
           Month = MM;
       }
       else//否则输出错误
       {
           Month = "Error";
       }
       year = YYYY;
       System.out.printf( "%s %d, %d\n", Month, day, year );
   }
   
   //第三个方法（third case)
   public void OutputDate(int DD, int YYYY)
   {
       day = DD;
       year = YYYY;
       SumDay = day;
       //针对闰年改变2月对应的天数
       if( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0))
       {
           MonthDays[2] += 1;
       }
       for(int i =0; i < month; i++)//循环累加天数
       {
           SumDay = SumDay + MonthDays[i];
       }
       System.out.printf( "%d, %d\n", SumDay, year );
   } 
}
