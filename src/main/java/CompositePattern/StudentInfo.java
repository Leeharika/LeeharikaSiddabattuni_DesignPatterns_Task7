package CompositePattern;
import java.util.ArrayList;
import java.util.List;

public class StudentInfo 
{
   private String name;
   private String dept;
   private int yearOfStudy;
   private double cgpa;
   private List<StudentInfo> students;
   public StudentInfo(String name,String dept, int yearOfStudy, double cgpa) 
   {
      this.name = name;
      this.dept = dept;
      this.yearOfStudy = yearOfStudy;
      this.cgpa = cgpa;
      students = new ArrayList<StudentInfo>();
   }

   public void add(StudentInfo s) {
      students.add(s);
   }

   public void remove(StudentInfo s) {
      students.remove(s);
   }

   public List<StudentInfo> getStudents(){
     return students;
   }

   public String toString(){
      return ("Student :[ Name : " + name + ", Department : " + dept + ", YearOfStudy :" + yearOfStudy+" , CGPA :" + cgpa +"]");
   }   
}