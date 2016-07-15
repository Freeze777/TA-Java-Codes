package basic.oops.atm;

public abstract class Transaction {
	protected int transactionID;
	abstract public boolean executeTransaction();
}
