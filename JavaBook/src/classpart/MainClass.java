package classpart;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1;//���� ����. s1�� student Ÿ���̶�� ����.
		s1=new Student();//��ü����
		s1.address = "�λ�";
		s1.grade=1;
		s1.sudentID=1;
		s1.studentName="ȫ�浿";
		
		s1.printName(); //void���·� ȣ���ϴ� ����. �޼��� ȣ��

		
		System.out.println(s1.studentName+" "+s1.address);
		
		
		
		Student s2;//���� ����. s1�� student Ÿ���̶�� ����.
		s2=new Student();//��ü����
		s2.address = "�λ�";
		s2.grade=1;
		s2.sudentID=1;
		s2.studentName="ȫ�浿";
		
		s2.printName();
		
		System.out.println(s2.studentName+" "+s2.address);
		
		Person p1;
		p1=new Person();
		p1.gender ='F';
		p1.height=150;
		p1.name="�̸�";
		p1.weight=150;
		p1.married=false;
		
		System.out.println(p1.height+" "+p1.weight);
		
	}

}
