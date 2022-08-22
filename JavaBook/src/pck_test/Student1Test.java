package pck_test;

import javabook5.Student1;

public class Student1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 studentLee = new Student1 ();
		System.out.println(studentLee.address);//private 설정으로 오류
		System.out.println(studentLee.grade); //default, protected, public 등 기본값은 사용가능.
		//default로 선언되어 있는 와중에 다른 패키지로 이동하여 사용할 수 없음.
		System.out.println(studentLee.studentId);//public
		
		studentLee.setStudentName("이상원");
		System.out.println(studentLee.getStudentName());
	}

}
