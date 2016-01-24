package homework3;

public class Student 
{
    private String Name;
    private double StudentID;
    private int JavaScore;
    public Student(String name,double studentid,int javascore)
    {
        Name=name;
        StudentID=studentid;
        JavaScore=javascore;
    }
    
    public void setMessage(String name,double studentid,int javascore)
    {
        Name=name;
        StudentID=studentid;
        JavaScore=javascore;
    }
           
    public String getName()
    {
        return Name;
    }
    
    public double getStudentID()
    {
        return StudentID;
    }
    
    public int getJavaScore()
    {
        return JavaScore;
    }
    
    public void displayMessage()
    {
        System.out.print(getName()+"\t");
        System.out.print(getStudentID()+"\t");
        System.out.print(getJavaScore()+"\n");
    
    }       
}       
           
