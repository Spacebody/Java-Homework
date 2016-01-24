package homework7;

    public class Date
    {
        /*
          定义变量；
          定义两个计数器nextYear和nextMonth初始化为0
        */
        private int month;
        private int day;
        private int year;
        private int nextDay;
        private int nextYear = 0;
        private int nextMonth = 0;
        

        //构造方法
        public Date( int theMonth, int theDay, int theYear )
        {
            month = checkMonth( theMonth );//调用成员方法
            year = checkYear( theYear );
            day = checkDay( theDay );
            
            System.out.printf( "Date object constructor for date %s\n", this );
        }
        
        //构造成员方法checkMonth,判断月份是否正确
        private int checkMonth( int testMonth )
        {
            if(testMonth > 0 && testMonth <= 12 )
                return testMonth;
            else
            {
                //超出范围则初始化为1
                System.out.printf( "Invalid month (%d) set to 1.", testMonth );
                return 1;
            }
        }
        
        //构造成员方法checkYear，判断年份是否正确
        private int checkYear( int testYear )
        {
            if( testYear >= 0 )
                return testYear;
            else
            {
                //超出范围则初始化为1
                System.out.printf( "Invalid year (%d) set to 1.", testYear );
                return 1;
            }
        }
        
        //构造成员方法checkDay，判读天数是否正确
        private int checkDay( int testDay )
        {
            int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            
            if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
                return testDay;
            if ( month == 2 && testDay == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)))
                return testDay;//针对闰年2月分变成29天
            
            System.out.printf("Invalid day (%d) set to 1.", testDay );
            return 1;
        }
        
        //格式化输出结果
        public String toString()
        {
            return String.format( "%d/%d/%d", month, day, year );
        }
        
        //定义成员方法nextDay，实现迭代递增
        public void nextDay( int day,int month, int year )
        {  
           int initialday = day;
           int initialmonth = month;
           int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
           //判断是否位闰年
           if( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ))
              {
                   daysPerMonth[2] += 1;         
              }
           do //循环递增天数
           {
               day = day + 1;
           if ( day > daysPerMonth[ month ])
             { //超出该月天数就进入下一个月
                 
                 month = month + 1;
                 day=1;
                 nextMonth = month;
             }
            System.out.printf( "Date object constructor for date %d/%d/%d\n", month, day, year );
            //格式化输出
            }while( nextMonth==0 );
           
           System.out.print("\n");
           
           //对天数重新初始化
           day = initialday; 
           month = initialmonth;  
           System.out.printf( "Date object constructor for date %d/%d/%d\n", month, day, year );
           do
           {
             day = day + 1;
             if ( day > daysPerMonth[ month ])
             {
                 
                 month = month + 1;
                 day=1;
             }
             if ( month > 12 )
             {
                //月份超出范围进入下一年
                 year =  year + 1;
                 nextYear = year;
                 month = 1;
             }
            System.out.printf( "Date object constructor for date %d/%d/%d\n", month, day, year );
            
            }while( nextYear==0 );
        }
    }
         
