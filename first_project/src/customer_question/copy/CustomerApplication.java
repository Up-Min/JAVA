package customer_question.copy;

import java.util.ArrayList;

public class CustomerApplication {
	
	static ArrayList<Customer> list = new ArrayList<Customer>();
	

	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1001,"일상민");
		Customer customer2 = new GoldCustomer(1002,"이상민");
		Customer customer3 = new VIPCustomer(1003,"삼상민", 501);
//		Customer customer4 = new VIPCustomerOther(1004,"사상민", 502);
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		
		showAllCustomer();
		
		Customer customer = findCustomer(1001);
		
		if (customer==null) {
			System.out.println("존재하지 않는 계좌");
		}else {
			showPriceBonus(customer, 10000);
		}
		
		
	}

	
	public static void showAllCustomer() {
		System.out.println("====고객목록====");
		for (Customer customer : list) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	
	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null;
		for (Customer customer : list) {
			if(customerID == customer.getCustomerID()) {
				resultCustomer = customer;
				break;
			}
		}
		return resultCustomer;
	}
	
	public static void showPriceBonus(Customer customer, int price) {
		int result = customer.calcPrice(price);
		int bonus = customer.bonusPoint;
		System.out.println("====지금까지 쓰신 돈과 보너스포인트====");
		System.out.println(customer.getCustomerName() +"의 지불금액 : "+result);
		System.out.println(customer.getCustomerName() + "의 보너스포인트 : "+bonus);

	}
	
	
	
}