package customer_question.copy;

public class VIPCustomer extends Customer{
	
	double saleRatio;
	int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.setCustomerGrade("VIP");
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return (int)((price)-(price*saleRatio));
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 번호 : " + agentID;
	}

	
	
	

	
}
