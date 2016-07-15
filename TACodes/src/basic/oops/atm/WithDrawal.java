package basic.oops.atm;

public class WithDrawal extends Transaction {

	@Override
	public boolean executeTransaction() {
		double amount = Math.random() * 10000.0;
		System.out.println("Withdrew " + amount);
		return true;
	}

}
