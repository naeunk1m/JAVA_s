package pck_test;

import javabook5.Student1;

public class Student1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 studentLee = new Student1 ();
		System.out.println(studentLee.address);//private �������� ����
		System.out.println(studentLee.grade); //default, protected, public �� �⺻���� ��밡��.
		//default�� ����Ǿ� �ִ� ���߿� �ٸ� ��Ű���� �̵��Ͽ� ����� �� ����.
		System.out.println(studentLee.studentId);//public
		
		studentLee.setStudentName("�̻��");
		System.out.println(studentLee.getStudentName());
	}

}
