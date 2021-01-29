package withArrayList;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer(int curID, String curName) {
		customerGrade = "SILVER";
		bonusRatio=0.01;
		this.customerID = curID;
		this.customerName = curName;
		
	}
	
	public int calcPrice(int price) {
		if(customerGrade == "SILVER") {
			bonusPoint += price * bonusRatio;
			
		}
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "'s grade is "+customerGrade + " and, bonus point is " + bonusPoint+" but bonus ratio is "+bonusRatio;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
