package javabook5;

public class Student1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 studentLee = new Student1 ();
		System.out.println(studentLee.address);
		System.out.println(studentLee.grade); //default, protected, public �� �⺻���� ��밡��.
		
		studentLee.setStudentName("�̻��");
		System.out.println(studentLee.getStudentName());
	}

}
