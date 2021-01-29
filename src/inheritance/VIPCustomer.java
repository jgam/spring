package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	private double salesRatio;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio=0.05;
		salesRatio=0.1;
	}
	
//	public int calcPrice(int price) {
//		if(customerGrade == "SILVER") {
//			bonusPoint += price * bonusRatio;
//		}
//		return price;
//	}
	
//	public String showCustomerInfo() {
//		return customerName + "'s grade is "+customerGrade + " and, bonus point is " + bonusPoint;
//	}
//	
//	public int getCustomerID() {
//		return agentID;
//	}

}
