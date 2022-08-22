package pck_test;

public class TestUnboxing {
	public static void main(String[] args) {
	Integer num1 = new Integer(100);
	int num2 = 200;
	
	int num = 0;
	int sum = num + num2;
	Integer num3 = num2;
	
	System.out.println("num1 : "+num1);
	System.out.println("num2 : "+num2);
	System.out.println("num3 : "+num3);
	
	
	}
}
