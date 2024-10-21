package lab2.task3;

import java.util.Objects;

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
		return b - ((numOfTransactions - FREE_TRANSACTIONS) * 0.02 )>= 0;
	}
	
	public void deductFee() {
		//withdraw 0.02 for each transaction, exceeding the free transactions
		
		if (numOfTransactions > FREE_TRANSACTIONS) {
			try {
				if (!canDeductFee(this.getBalance())) {
					throw new Exception("Not enough balance to deduct the fee!");
				} else {
					super.withdraw(0.02 * (numOfTransactions - FREE_TRANSACTIONS));
					numOfTransactions = 0;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
			
			
	

	}
	
	public boolean deposit(double amount) {
		if (super.deposit(amount)) {
			numOfTransactions+=1;
			return true;
		}
		return false;

	}
	
	public boolean withdraw(double amount) {
		if (super.withdraw(amount)) {
			numOfTransactions+=1;
			return true;
		}
		return false;
	}
	
//	public boolean deposit(double amount) {
//		
//		/*after we crossed the free limit
//		 * 3 cases
//		 * 1. deposit enough money   10 dollars deposited - 0.02 dollars as a fee
//		 * 2. deposit moeny less than the fee we	we have 0 dollars, deposit 0.01, and we cannot even deposit right now
//		 * 3. invalid deposit 	provide negative deposit or something like that
//		 * 
//		 * */		
//		
//		numOfTransactions += 1;				
//		try {
//			if (canDeductFee(this.getBalance() + amount)) {
//				if (super.canDeposit(amount)) {
//					super.deposit(amount);
//					deductFee();
//					return true;
//				} else {
//					throw new Exception("Invalid deposit");
//				}
//			} else {
//				throw new Exception("Not enough balance for transaction!");
//			}
//		} catch (Exception e) {
//			numOfTransactions -= 1;
//			System.err.println(e.getMessage());
//			return false;
//		}
//
//	}
//	
//	public boolean withdraw(double amount) {
//		/*
//		 * 
//		 * 3 cases
//		 * 1. enough money after withdrawal for the fee		we had 10 dollars, withdrew 5 and the fee, 3.98 left
//		 * 2. invalid withdrawal	negative values or over the balance
//		 * 3. not enough money after withdrawal for the fee		we had 10 dollars, withdrew 10 and we cannot withdrew the fee, so cancel the withdrawal
//		 * 
//		 * 
//		 * 
//		 * */
//		numOfTransactions += 1;				
//		try {
//			if (canDeductFee(this.getBalance() - amount)) {
//				if (super.canWithdraw(amount)) {
//					super.withdraw(amount);
//					deductFee();
//					return true;
//				} else {
//					throw new Exception("Invalid withdrawal");
//				}
//			} else {
//				throw new Exception("Not enough balance for transaction!");
//			}
//		} catch (Exception e) {
//			numOfTransactions -= 1;
//			System.err.println(e.getMessage());
//			return false;
//		}
//	}

	
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
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(numOfTransactions);
	}

}
