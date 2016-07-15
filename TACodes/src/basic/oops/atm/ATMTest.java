package basic.oops.atm;

public class ATMTest {
	// let create the ATM
	public static void main(String[] args) {
		ATM atm = new SbiATM(5476, "Electronic City");// created a new atm;
		System.out.println(atm.makeTransactions());// lets makes some use of
													// this ATM
		System.out.println(atm.otherServices());

	}
}
