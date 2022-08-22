package javabook7;

public class StudentArrayList {

	public static void main(String[] args) {
		Student1 [] students = new Student1[3];
		
		students[0] = new Student1 (1001, "James");
		students[1] = new Student1 (1002, "Tomas");
		students[2] = new Student1 (1003, "Edward");
		
		for(int i = 0; i< students.length; i++) {
			students[i].showStudentInfo();
		}

	}

}
