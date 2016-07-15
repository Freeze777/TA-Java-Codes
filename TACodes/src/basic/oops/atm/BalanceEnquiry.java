package basic.oops.atm;

public class BalanceEnquiry extends Transaction {

	@Override
	public boolean executeTransaction() {
		System.out.println("executing balance enquiry transaction");
		return true;
	}

}
