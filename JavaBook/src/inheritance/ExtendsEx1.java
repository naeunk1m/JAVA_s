package inheritance;

public class ExtendsEx1 {
	public static void main(String[] args) {
		Student s1 = new Student(); //
		s1.name = "ȫ�浿";
		s1.sn = 1111111;
		s1.grade = 1;
		
		Employee e1 = new Employee (); // default Employee(){super();}����
		e1.name = "��浿";
		e1.sn = 2222222;
		e1.part = "developer";
	}
}