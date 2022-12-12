package bank_exception;

public class Account_ex {

	public static void main(String[] args) {

		Account ac = new Account();
		
		//deposit
		ac.deposit(10000);
		System.out.println("예금액 : "+ac.getBalace());
		
		//withdraw
		try {//should receive exception (as try catch)
			ac.withdraw(3000000);
		} catch (InsuffException e) {
			String message = e.getMessage();
			System.out.println(message);
		} 
		
	}

}
