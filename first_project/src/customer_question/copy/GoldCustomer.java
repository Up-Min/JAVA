package customer_question.copy;

public class GoldCustomer extends Customer{
	
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.setCustomerGrade("GOLD");
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return (int)((price)-(price*saleRatio));
	}
	
	
	
	
}
