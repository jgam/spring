package withArrayList;

public class VIPCustomer extends Customer{
	private int agentID;
	private double salesRatio;
	
	public VIPCustomer(int curID, String curName) {
		super(curID, curName);
		customerGrade = "VIP";
		bonusRatio=0.05;
		salesRatio=0.1;
	}
}