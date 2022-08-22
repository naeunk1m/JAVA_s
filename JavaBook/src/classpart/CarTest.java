package classpart;

public class CarTest {

	public static void main(String[] args) {
		Car c1, c2;
		c1 = new Car("1","홍길동","a",1);
		c2 = new Car("2","김길동","b",2);
		
		System.out.println("차종: "+ c1.getKind() +","+ " 소유주: "+ c1.getOwner());
		System.out.println("차종: "+ c2.getKind() +","+ " 소유주: "+ c2.getOwner());
		
//		c1.Car(); //X
//		c3.Car();
		
	
		c1.setKind("크루즈");
		c1.setOwner("나");
		c1.setNumber("0000");
		c1.setYear(0);
		
		c2.setKind("자동차");
		c2.setOwner("나");
		c2.setNumber("1234");
		c2.setYear(0);
		
		
		System.out.println("차종: "+ c1.getKind() +","+ " 소유주: "+ c1.getOwner());
		System.out.println("차종: "+ c2.getKind() +","+ " 소유주: "+ c2.getOwner());

		
	}

}
