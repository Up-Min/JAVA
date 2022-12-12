package bank_exception;

public class Account {
	private long balance; // money belongs
	
	// constructor
	public Account () {}
	
	//method
	public long getBalace() {
		return this.balance;
	}
	
	//saving
	public void deposit(int money) {
		this.balance += money; // cumulative sum on balance.
	}
	
	//withdraw
	public void withdraw(int money) throws InsuffException { //initialized throws 
		// if balance < withdraw. activate exception
		if(money > balance) {
			// use customized exception
			throw new InsuffException("잔고부족 : " + (money-balance) + " 모자람");
			//put message (to show on console) in '( )'
			
		}else {
			this.balance -= money; 
			// if there is nothing wrong.
		}
	}
}
