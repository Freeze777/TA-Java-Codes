package basic.oops.atm;

/*
 * Lets Design an simple ATM...!!!!
 * 
 * */
public class SbiATM implements ATM {
	private final int transactions_limit = 100;
	private int id;
	private String address;

	public SbiATM(int id, String address) {
		this.id = id;
		this.address = address;
	}

	public boolean makeTransactions() {
		int num = ((int) (Math.random() * 1000)) % 3;
		Transaction tr = null;
		// RTP in action..!!!!!!!
		switch (num) {
		case 0:
			tr = new Deposit();
			break;
		case 1:
			tr = new WithDrawal();
			break;
		case 2:
			tr = new BalanceEnquiry();
			break;

		}
		return tr.executeTransaction();

	}

	public String otherServices() {
		double d = Math.random();
		return (d >= 0.5) ? "Service Request Accepted"
				: "Service Request Failed";
	}
	
	public void servicesForSBIUsersOnly() {
		System.out.println("These are only available for SBI users");

	}	
	
}
