package javabook5;

public class Student3Test {

	public static void main(String[] args) {
		Student3 student = new Student3();
		student.StudentID=12345;
		student.studentName="ABC";
		
		Subject kSub = new Subject();
		kSub.SubjectName="����";
		
		Subject mSub = new Subject();
		mSub.SubjectName="����";
		
		student.korean= kSub;
		student.math= mSub;
				//subjectŸ��. ���� ��ü������ subject. �޸𸮿� �ö� ���� �⺻��
//		System.out.println(student.StudentID+ " "+student.studentName);
//		System.out.println(student.korean+" "+student.math);
//				//���������ͷ� �ּҰ��� ��µ�.
		
		System.out.println(student.StudentID+ " "+student.studentName);
		System.out.println(student.korean.scorePoint+" "+student.math.SubjectName);
	}

}
