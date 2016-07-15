package basic.oops.atm;

public class BalanceEnquiry extends Transaction {

	@Override
	public boolean executeTransaction() {
		double amount = Math.random() * 10000.0;
		System.out.println("Your Balance is Rs "+amount);
		return true;
	}

}
