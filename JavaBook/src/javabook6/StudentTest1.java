package javabook6;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student(0, null);
		studentLee.setStudentName("������");
		 System.out.println(studentLee.serialNum);
		 studentLee.serialNum++;
		
		 
		 Student studentSon = new Student(0, null);
		 studentSon.setStudentName("�ռ���");
		 System.out.println(studentSon.serialNum);
		 System.out.println(studentLee.serialNum);
		 
	
		 
	}

}
