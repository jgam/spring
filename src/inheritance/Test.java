package inheritance;

public class Test {
	public static void main(String[] args) {
		Customer jimmy = new Customer();
		jimmy.setCustomerID(10000);
		jimmy.setCustomerName("Gam");
		
		VIPCustomer emmy = new VIPCustomer();
		emmy.setCustomerID(10001);
		emmy.setCustomerName("KIM");
		
		Customer Ammy = new VIPCustomer();
		Ammy.setCustomerID(10002);
		Ammy.setCustomerName("LEE");
		
		System.out.println(jimmy.showCustomerInfo());
		System.out.println(emmy.showCustomerInfo());
		System.out.println(Ammy.showCustomerInfo());
	}
}
