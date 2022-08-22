package javabook8;

public class VIPCustomer extends Customer  {
	String customerName;
	private int agentID;
	double saleRatio;
	
	@Override 
	public
	int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public VIPCustomer (int customerID, String customerName, int bonusPoint) {
		super(bonusPoint, customerName);
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonusPoint = bonusPoint;
		customerGrade = "VIP"; // �տ� this�� super��� ����.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	
	
	public int getAgentID() {
		return agentID;
	}
}
