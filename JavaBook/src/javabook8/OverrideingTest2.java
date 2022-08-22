package javabook8;
//상속(멤버변수,메서드), 부모 생성자호출, super(), protected, 형변환
public class OverrideingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000); //vipcustomer의 매개변수가 없음.
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은" +
		"vc.calcPrice(10000)"+"입니다. ");

	}

}
  