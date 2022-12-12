package customer_question;

public class VIPCustomer extends Customer{

	int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;

		this.agentID = agentID;
		this.saleRatio = 0.1;		
	}
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price*bonusRatio);
		return price - (int)(price*saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 번호 : " + agentID;
				// showCustomerInfo의 결과값을 그대로 가져옴
				
		// 내가 짠거
		//return customerName + "님의 등급 : " + customerGrade + ", 보너스 포인트 : " 
				//+ bonusPoint + "점, 담당 상담원 번호 : " + agentID;
	}
	// getter 가져옴
	public int getAgentID() {
		return agentID;
	}

}
