package withArrayList;

public class GoldCustomer extends Customer {
	double saleRatio;
	public GoldCustomer(int curID, String curName) {
		super(curID, curName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio= 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	
}
