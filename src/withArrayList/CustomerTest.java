package withArrayList;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "leesoonsin");
		Customer customerShin = new Customer(10011, "shinsaimdang");
		GoldCustomer customerHong = new GoldCustomer(10012, "honggildong");
		GoldCustomer customerYul = new GoldCustomer(10013, "leeyougok");
		VIPCustomer customerKim = new VIPCustomer(10014, "KIMDAEBAK");
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("=========== customer info =====");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
}
