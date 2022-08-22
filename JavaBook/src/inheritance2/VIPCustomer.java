package inheritance2;

import javabook8.Customer;

public class VIPCustomer extends Customer  {
	private static String customerGrade;
	static int agentID;
	double saleRatio;
	
	@Override 
	protected int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public VIPCustomer () {
		super(getAgentID(), customerGrade);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer»ý¼ºÀÚ");
	}
	
	public static int getAgentID() {
		return agentID;
	}
}
