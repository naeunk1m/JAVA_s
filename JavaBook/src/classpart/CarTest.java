package classpart;

public class CarTest {

	public static void main(String[] args) {
		Car c1, c2;
		c1 = new Car("1","ȫ�浿","a",1);
		c2 = new Car("2","��浿","b",2);
		
		System.out.println("����: "+ c1.getKind() +","+ " ������: "+ c1.getOwner());
		System.out.println("����: "+ c2.getKind() +","+ " ������: "+ c2.getOwner());
		
//		c1.Car(); //X
//		c3.Car();
		
	
		c1.setKind("ũ����");
		c1.setOwner("��");
		c1.setNumber("0000");
		c1.setYear(0);
		
		c2.setKind("�ڵ���");
		c2.setOwner("��");
		c2.setNumber("1234");
		c2.setYear(0);
		
		
		System.out.println("����: "+ c1.getKind() +","+ " ������: "+ c1.getOwner());
		System.out.println("����: "+ c2.getKind() +","+ " ������: "+ c2.getOwner());

		
	}

}
