package javabook11;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("È«±æµ¿","2201");
		Student s2 = new Student("È«±æµ¿","2201");
		Student s3 = new Student("±è±æµ¿","2204");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
	}

}
