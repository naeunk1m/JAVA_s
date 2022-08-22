package javabook8;

public class VIPCustomer1 {
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	int agentID;
	double saleRatio;
	
	public VIPCustomer1() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName +" ���� ����� "+customerGrade +"�̸�, ���ʽ� ����Ʈ��"
		+bonusPoint+"�Դϴ�.";
	}
	
}
