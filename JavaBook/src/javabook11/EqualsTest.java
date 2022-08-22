package javabook11;

public class EqualsTest {
	public static void main (String[] args) {
		StudentEx studentLee = new StudentEx(100, "�̻��");
		StudentEx studentLee2 = studentLee;
		StudentEx studentSang = new StudentEx(100, "�̻��");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�. ");
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		
		System.out.println("studentLee�� hashCode :" +studentLee.hashCode());
		System.out.println("studentSang�� hashCode :" +studentSang.hashCode());
	
		System.out.println("studentLee�� �����ּҰ� :" + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּҰ� :"  +System.identityHashCode(studentSang));
		
	}
	
	

}
