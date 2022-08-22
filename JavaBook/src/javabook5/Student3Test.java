package javabook5;

public class Student3Test {

	public static void main(String[] args) {
		Student3 student = new Student3();
		student.StudentID=12345;
		student.studentName="ABC";
		
		Subject kSub = new Subject();
		kSub.SubjectName="국어";
		
		Subject mSub = new Subject();
		mSub.SubjectName="수학";
		
		student.korean= kSub;
		student.math= mSub;
				//subject타입. 값은 객체생성한 subject. 메모리에 올라간 값이 기본값
//		System.out.println(student.StudentID+ " "+student.studentName);
//		System.out.println(student.korean+" "+student.math);
//				//참조데이터로 주소값이 출력됨.
		
		System.out.println(student.StudentID+ " "+student.studentName);
		System.out.println(student.korean.scorePoint+" "+student.math.SubjectName);
	}

}
