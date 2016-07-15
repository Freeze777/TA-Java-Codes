package basic.oops.atm;

public class WithDrawal extends Transaction {

	@Override
	public boolean executeTransaction() {
		System.out.println("executing withDrawal transaction");
		return true;
		}

}
