package polymorphism;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer (int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade = "VIP"; // 앞에 this와 super모두 가능.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID=agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo( ) {
		return super.showCustomerInfo() + "담당 상담원 번호는" + agentID
				+ "입니다.";
	}
	
	public int getAgentID () {
		return agentID;
	}
}
