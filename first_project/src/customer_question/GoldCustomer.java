package customer_question;

public class GoldCustomer extends Customer{

	// 필드 작성 
	double saleRatio; // 할인율

	// 생성자 작성 //부모 클래스에 있는 애들을 받아옴 + 고객 등급, 할인율 변경
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "GOLD"; // 골드로 등급 변경
		super.bonusRatio = 0.02; // 상속받은 적립율을 바꿔줌.
		this.saleRatio = 0.1; // 할인율 지정
	}

	@Override 
	public int calcPrice(int price) {
		bonusPoint += (price*bonusRatio); //보너스 포인트 지정 변경
		return price - (int)(price*saleRatio);

	// 실수한 나의 코드
//	return (int) (super.calcPrice(price) - (super.calcPrice(price)*saleRatio));
	}
	
	
	
}
