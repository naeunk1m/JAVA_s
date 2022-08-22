package javabook8;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
//		System.out.println("customer생성자");
	}
	
	protected                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   int calcPrice(int price) {
		bonusPoint += price * bonusRatio;   
		return price;            
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String showCustomerInfo() {
		return customerName +" 님의 등급은 "+customerGrade +"이며, 보너스 포인트는"
		+bonusPoint+"입니다.";
	}
}
