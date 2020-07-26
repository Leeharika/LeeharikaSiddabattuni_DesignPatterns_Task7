package CompositePattern;

public class CompositePatternExample {
	   public static void main(String[] args) 
	   {
	   
	      StudentInfo CSEstu = new StudentInfo("Leeharika","CSE", 3 , 9.61);

	      StudentInfo newStu = new StudentInfo("Devarshaa","CSE", 3 , 9.81);

	      StudentInfo newStu1 = new StudentInfo("Rishitha","CSE", 2 , 9.71);

	      StudentInfo stu1 = new StudentInfo("Varun","CIVIL", 3 , 9.59);
	      StudentInfo stu2 = new StudentInfo("Prajval","CIVIL", 3 , 9.04);

	      StudentInfo topper1 = new StudentInfo("Richard","MECH", 4 , 9.96);
	      StudentInfo topper2 = new StudentInfo("Rob","MECH", 4 , 9.95);

	      CSEstu.add(newStu);
	      CSEstu.add(newStu1);

	      newStu.add(stu1);
	      newStu.add(stu2);
	      
	      newStu1.add(topper1);
	      newStu1.add(topper2);
	      System.out.println(CSEstu); 
	      
	      for (StudentInfo student : CSEstu.getStudents()) 
	      {
	         System.out.println(student);
	         for (StudentInfo student2 : student.getStudents()) 
		      {
		            System.out.println(student2);
		      }
	      }
	      }		
	   }

