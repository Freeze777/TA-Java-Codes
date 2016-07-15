package basic.oops.atm;

public class Deposit extends Transaction {

	@Override
	public boolean executeTransaction() {
		System.out.println("executing deposit transaction");
		return true;
	}

}
