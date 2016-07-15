package basic.oops.atm;

public class Deposit extends Transaction {

	@Override
	public boolean executeTransaction() {
		long receiverAccNum = ((long) (Math.random() * 100000000L));
		double amount =  Math.random() * 10000.0;
		System.out.println("Deposited "+amount+" to account "+receiverAccNum);
		transactionID=(long) (Math.random() * 100000.0);
		return true;
	}

}
