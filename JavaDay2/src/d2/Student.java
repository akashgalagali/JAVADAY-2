package d2;

public class Student {

 private String name;
 private int rollnum;
 private int marks;

 public void setName(String StudentName)
 {
	 name=StudentName;
 }
 public void setRn(String studentName,int studentId,int studentMarks)
 {
	 name=studentName;
	 rollnum=studentId;
	 rollnum=studentMarks;
	 
 }
 public void display() {
	 System.out.println("Name"+name);
	 System.out.println("Roll"+rollnum);
	 System.out.println("Marks"+marks);
 }
 
}
