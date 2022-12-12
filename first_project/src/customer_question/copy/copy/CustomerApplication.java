package customer_question.copy.copy;

import java.util.ArrayList;

public class CustomerApplication {

	public static ArrayList<Customer> list = new ArrayList<Customer>();

	public static void main(String[] args) {

		Customer cus1 = new Customer(1001, "일상민");
		Customer cus2 = new GoldCustomer(1002, "이상민");
		Customer cus3 = new VIPCustomer(1003, "삼상민", 5001);

		list.add(cus1);
		list.add(cus2);
		list.add(cus3);

		showAllCustomer();

		Customer c = findCustomer(1003);
		if (c != null) {
			showPriceBonus(c, 10000);
		} else {
			System.out.println("일치하는 고객이 없습니다.");
		}

	}

	public static void showAllCustomer() {
		System.out.println("===== 모든 고객 명단 출력 =====");
		for (Customer customer : list) {
			System.out.println(customer.showCustomerInfo());
		}
	}

	public static Customer findCustomer(int customerID) {
		Customer cusresult = null;
		for (Customer customer : list) {
			if (customer.getCustomerID() == customerID) {
				cusresult = customer;
				break;
			}
		}
		return cusresult;
	}

	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("===== 해당 고객의 할인율과 보너스 포인트 계산 =====");

		int pr_result = customer.calcPrice(price);
		int bo_result = customer.bonusPoint;

		System.out.println(customer.getCustomerName() + "님의 지불금액 : " + pr_result + "원");
		System.out.println(customer.getCustomerName() + "님의 보너스 포인트 : " + bo_result + "점");

	}
}
