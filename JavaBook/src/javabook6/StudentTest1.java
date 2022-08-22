package javabook6;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student(0, null);
		studentLee.setStudentName("이지원");
		 System.out.println(studentLee.serialNum);
		 studentLee.serialNum++;
		
		 
		 Student studentSon = new Student(0, null);
		 studentSon.setStudentName("손수경");
		 System.out.println(studentSon.serialNum);
		 System.out.println(studentLee.serialNum);
		 
	
		 
	}

}
