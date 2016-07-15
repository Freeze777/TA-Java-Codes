package basic.oops.atm;

public abstract class Transaction {
	protected long transactionID;
	abstract public boolean executeTransaction();
}
