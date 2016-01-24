package homework2;

public class Employee 
{
    private String Firstname,Lastname;
    private double Monthlysalary;
    
    public Employee(String name1,String name2,double money)
    {
        Firstname=name1;
        Lastname=name2;
        if(money>0.0)
        {
            Monthlysalary=money;
        }
    }
    
    public void setFirstname(String name1)
    {
        Firstname=name1;
    }
    
    public String getFirstname()
    {
        return Firstname;
    }
    
    public void setLastname(String name2)
    {
        Lastname=name2;
    }
    
    public String getLastname()
    {
        return Lastname;
    }
    
    public void setMonthsalary(double money)
    {
        Monthlysalary=money;
    }
    
    public double getMonthlysalary()
    {
        return Monthlysalary;
    }
    
    public void displayMessage1()
    {
      System.out.printf("\nThe employee's first name is %s\n",getFirstname());
      System.out.printf("The employee's last name is %s\n",getLastname());
      System.out.printf("The employee's yearly salary is %.2f\n",getMonthlysalary()*12);
      System.out.printf("The employee's yearly salary is %.2f\n",getMonthlysalary()*12*1.1);
    }   
    
}