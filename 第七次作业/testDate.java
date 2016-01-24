package homework7;

public class testDate 
{
    public static void main(String[] args) 
    {
        int day = 1, month = 1, year = 2000;//定义变量并赋值
           Date D1 = new Date( month, day, year );//创建对象并实例化
           D1.nextDay(day, month, year);//调用类Date中的方法     
    }    
}
