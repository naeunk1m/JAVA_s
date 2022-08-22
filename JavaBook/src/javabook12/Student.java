package javabook12;

public class Student {
	String name;
	String id;
	
	public Student(String name, String id) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(id );
	}
}
