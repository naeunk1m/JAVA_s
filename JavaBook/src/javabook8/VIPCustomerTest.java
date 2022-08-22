package javabook8;

public class VIPCustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(0, null);
		VIPCustomer c2 = new VIPCustomer(0, null, 0);
		VIPCustomer1 c3 = new VIPCustomer1();
		
		c1.customerName="Kim";
		c1.bonusPoint=10;	
		System.out.println(c1.calcPrice(1000));  
		System.out.println(c1.showCustomerInfo());
		
		c3.customerName="Lee";
		c3.bonusPoint=10;		
		System.out.println(c3.calcPrice(1000));
		System.out.println(c3.showCustomerInfo());

		c2.customerName="Park";
		c2.bonusPoint=10;		
		System.out.println(c2.calcPrice(1000));
		System.out.println(c2.showCustomerInfo());
		

	}

}
