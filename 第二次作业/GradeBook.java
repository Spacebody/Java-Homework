package homework2;

public class GradeBook 
{
     private String InstructorName,CourseName;
     public GradeBook(String name1,String name2)
     {
       InstructorName=name1;
       CourseName=name2;
     }
     public void setInstructorName(String name1)
     {
       InstructorName=name1;
       
     }
     
     public String getInstructorName()
     {
       return InstructorName;
     }
     
     public void setCourseName(String name2)
     {
        CourseName=name2;
     }
    
    
     public String getCourseName()
     {
         return CourseName;
     }
   
     public void displayMessage()
     {
       System.out.printf("Welcome to the grade book for %s\n",getCourseName());
       System.out.printf("This course is presented by:%s\n", getInstructorName());
     }

}
