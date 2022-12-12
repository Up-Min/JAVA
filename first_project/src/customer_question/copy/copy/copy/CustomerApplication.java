package customer_question.copy.copy.copy;


import java.util.ArrayList;

public class CustomerApplication {

	protected static ArrayList<Customer> list = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		
		Customer customer00 = new Customer(0001, "이상민");
		Customer customer01 = new Customer(0002, "이상민");
		Customer customer02 = new GoldCustomer(0003, "이상민");
		Customer customer03 = new VIPCustomer(0004, "이상민", 12345);
		Customer customer04 = new VIPCustomer(0005, "이상민", 12312);
		
		list.add(customer00);
		list.add(customer01);
		list.add(customer02);
		list.add(customer03);
		list.add(customer04);
		
		showAllCustomer();
		
		Customer cus = findCustomer(0005);
		
		if(cus != null) {
			showPriceBonus(cus, 10000);
		} else {
			System.out.println("신정호 바보");
		}
		
	}
	
	public static void showAllCustomer() {
		for (Customer cus : list) {
			System.out.println(cus.showCustomerinfo());
		}
	}
	public static Customer findCustomer(int customerID) { 
		Customer cusResult = null;
		for (Customer cus : list) {
			if(customerID == cus.getCustomerID()) {
				cusResult = cus;
				 break;
			}
		}
		return cusResult;
	}
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("===== 할인율과 보너스 포인트 =====");
		int money = customer.calcPrice(price);
		int bp = customer.bonusPoint;
		
		System.out.println(customer.getCustomerName()+"님의 지불 금액 : "+customer.calcPrice(price)+"원");
		System.out.println(customer.getCustomerName()+"님의 보너스 포인트 : "+bp+"점");
		
	}

}
