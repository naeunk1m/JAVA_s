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
//		System.out.println("customer������");
	}
	
	protected                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   int calcPrice(int price) {
		bonusPoint += price * bonusRatio;   
		return price;            
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String showCustomerInfo() {
		return customerName +" ���� ����� "+customerGrade +"�̸�, ���ʽ� ����Ʈ��"
		+bonusPoint+"�Դϴ�.";
	}
}
