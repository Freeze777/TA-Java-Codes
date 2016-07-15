package basic.oops.atm;

public class ATMTest {
	// let create the ATM
	public static void main(String[] args) {
		ATM atm = new SbiATM(5476, "Electronic City");// created a new atm;
		
		/*say this was the first user*/
		System.out.println("User 1:");
		System.out.println(atm.makeTransactions());
		
		System.out.println("\n");
		
		System.out.println("User 2:");
		System.out.println(atm.otherServices());

	}
}
