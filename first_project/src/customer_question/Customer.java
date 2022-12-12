package customer_question;

public class Customer {
	// 고객 객체를 생성할 수 있는 클래스

	// 필드
	protected int customerID; //고객아이디
	protected String customerName; //고객이름
	protected String customerGrade; //고객등급
	int bonusPoint; // 적립된 보너스 포인트
	double bonusRatio; // 등급별 포인트 적립율
	
	// 생성자
	public Customer() {
		initCustomer();
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();	
	}
	
	// 메소드
	//고객등급 초기화 - 1,2번 생성자에 우선 선언 할거임.
	private void initCustomer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	// 보너스 포인트 계산 + 가격 리턴
	public int calcPrice(int price) {
	// 보너스포인트는 그대로 int 필드에 적립. (누적합산 필요)
		// price : 지불 금액. 
		
		// 보너스 포인트 적립 (보너스 비율 계산)
		bonusPoint += (price*bonusRatio);
		return price; // 일반고객은 할인율이 없으므로 그대로 내보낸다.
	}
	
			
	// 고객정보 보여주기 (이름, 등급, 보너스포인트)
	// 계속 내보내줄 값이 다르기 때문에 필드를 지정해준다.
	public String showCustomerInfo() {
		return customerName + "님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint + "점";
	}
	
	//getter, setter 생성
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
