package homework3;

public class StudentTest 
{
  public static void main(String[] args)
  {
    System.out.print("Name\tStudentID\tJavaScore\n");  
    Student Li=new Student("Li",115101,90);
        Li.displayMessage();
    Student Ji=new Student("Ji",115102,99);
        Ji.displayMessage();
    Student Ki=new Student("Ki",115103,89);
        Ki.displayMessage();
    Student Ci=new Student("Ci",115104,98);
        Ci.displayMessage();
    Student Ai=new Student("Ai",115105,32);
      Ai.displayMessage(); 
  }
}
