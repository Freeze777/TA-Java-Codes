package basic.oops.atm;

public interface ATM {
	// why we need ATM interface????
	//Now how to use the fact that variable are static and final..!!
	public String TRANSACTION_FAILED="Transaction Failed";
	public String TRANSACTION_COMPLETED="Transaction Completed";
	public String AUTHENTICATION_FAILED="Authentication Failed: Please contact the Bank";
	public String REQUEST_FAILED="Service Request Failed";
	public String REQUEST_COMPLETED="Service Request Completed";
	public boolean authenticateUser(); //suggestions..! 
	public String makeTransactions();
	public String otherServices();

}
