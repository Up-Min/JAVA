package customer_question;

import java.util.ArrayList;

public class CustomerApplication {
	/* array list. 배열의 리스트화
	 * 한번 길이를 정하면 바꿀 수 없는 배열의 한계를 뛰어넘음.
	 * 데이터 갯수가 계속 바뀔 때는 arraylist를 쓴다.
	 * add 라는 메소드를 이용하여 값을 쉽게 추가할 수 있음.
	 */
	
	// Customer객체를 저장할 Arraylist 선언
private static ArrayList<Customer> customerlist = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		// 고객 객체 5명 생성 -> Customer.java확인
		// 실버 고객
		Customer customerLee = new Customer(10001, "이순신");
		Customer customerkim = new Customer(10002, "김지우");
		// 골드 고객
		Customer customerWoo = new GoldCustomer(10003, "우원재");
		Customer customerShin = new GoldCustomer(10004, "신형만");
		// VIP 고객
		Customer customerJin = new VIPCustomerOther(10005, "진삼국무쌍", 4002);
		
		customerlist.add(customerLee);
		customerlist.add(customerkim);
		customerlist.add(customerWoo);
		customerlist.add(customerShin);
		customerlist.add(customerJin);
		
		showAllCustomer();
		
		// id로 고객 찾기
		
		Customer customer = findCustomer(10005);
		if(customer == null) {
			System.out.println("존재하지 않는 고객입니다.");
		}else {
			showPriceBonus(customer, 1000000000);
		}
	}
	
	
	// 모든 고객정보 출력
	public static void showAllCustomer() {
		System.out.println("======모든 고객 정보 출력=======");
		// 향상된 for문 -> customerlist에서 값을 하나하나 불러와서 customer 타입에 넣어줌
		for (Customer customer : customerlist) {
			System.out.println(customer.showCustomerInfo());
			//customer에 showCustomerInfo를 넣어서 그대로 출력되게 해준다
		}
		
	}
	
	//id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력 
	//( 1. findCustomer 이용 고객 객체 찾음)
	public static Customer findCustomer(int customerID) {
		// 리턴타입이 Customer. 
		Customer resultCustomer = null; // 값 초기화
		
		for(Customer customer : customerlist) {
			// 해당 객체의 customerID와 매개변수로 받아온 customerID가 같은지 비교.
			if (customer.getCustomerID() == customerID) {
				resultCustomer = customer;
				break;
			}
		}
		return resultCustomer;
		// 해당 객체 못찾을 경우 null 리턴
	}
	//(2. 지불금액, 보너스포인트 출력하는 메소드 제작)
	public static void showPriceBonus(Customer customer, int price) {
		// 물건 살 때 지불한 금액
		System.out.println("===== 해당 고객의 할인율과 보너스 포인트 계산 =====");
		int cost = customer.calcPrice(price);
		System.out.println(customer.getCustomerName()+"님의 지불금액 : " + cost + "원");
		System.out.println(customer.getCustomerName()+"님의 현재 보너스포인트 : "+customer.bonusPoint);
	}
	


}
