package inheritance;

public class Student extends Person{
	int grade;
	Student () { 
		super("김길동", 11111); // 부모 생성자 설계도 호출 Person생성자1
		System.out.println("Student생성자");
	}
}
