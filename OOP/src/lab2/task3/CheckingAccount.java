package lab2.task3;

public class CheckingAccount extends Account {
	//charge for each transaction
	private int numOfTransactions = 0;
	private static final int FREE_TRANSACTIONS = 5; //random value)
	
	public CheckingAccount(int a) {
		super(a);
	}
	
	public int getNumOfTransactions() {
		return numOfTransactions;
	}
	
	private boolean canDeductFee(double b) {
		return b - 0.02 >= 0;
	}
	
	public void deductFee() throws Exception {
		//withdraw 0.02 for each transaction, exceeding the free transactions
		if (numOfTransactions > FREE_TRANSACTIONS) {
			if (!canDeductFee(this.getBalance())) {
				throw new Exception("Not enough balance for transaction!");
			} else {
				super.withdraw(0.02);
			}
		}
	}
	
	public boolean deposit(double amount) {
		
		/*after we crossed the free limit
		 * 3 cases
		 * 1. deposit enough money
		 * 2. deposit moeny less than the fee
		 * 3. invalid deposit 
		 * 
		 * */
		numOfTransactions += 1;				
		try {
			if (canDeductFee(this.getBalance() + amount)) {
				if (super.canDeposit(amount)) {
					super.deposit(amount);
					deductFee();
					return true;
				} else {
					throw new Exception("Invalid deposit");
				}
			} else {
				throw new Exception("Not enough balance for transaction!");
			}
		} catch (Exception e) {
			numOfTransactions -= 1;
			System.err.println(e.getMessage());
			return false;
		}

	}
	
	public boolean withdraw(double amount) {
		/*
		 * 
		 * 3 cases
		 * 1. enough money after withdrawal for the fee
		 * 2. invalid withdrawal
		 * 3. not enough money after withdrawal for the fee
		 * 
		 * 
		 * 
		 * */
		numOfTransactions += 1;				
		try {
			if (canDeductFee(this.getBalance() - amount)) {
				if (super.canWithdraw(amount)) {
					super.withdraw(amount);
					deductFee();
					return true;
				} else {
					throw new Exception("Invalid withdrawal");
				}
			} else {
				throw new Exception("Not enough balance for transaction!");
			}
		} catch (Exception e) {
			numOfTransactions -= 1;
			System.err.println(e.getMessage());
			return false;
		}
	}

	
	public String toString() {
		return "Checking " + super.toString() + ", number of transactions made: " + String.format("%d", numOfTransactions);
 	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		CheckingAccount c = (CheckingAccount) o;
		return this.numOfTransactions == c.numOfTransactions;
	}

}
