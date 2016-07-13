package snippets.day1;

public class EqualityAndEquals {

	public static void main(String[] args) {
		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(1000);
		if (i1 == i2) {
			System.out.println("just a print statement if True");
		} else {
			System.out.println("just a print statement if False");
		}
		if (i1.equals(i2)) {
			System.out.println("just a print statement if True");
		} else {
			System.out.println("just a print statement if False");
		}
		// does Autoboxing too.
		//caching of smaller integer values.
		i1 = 10;
		i2 = 10;
		if (i1 == i2) {
			System.out.println("just a print statement if True");
		} else {
			System.out.println("just a print statement if False");
		}
		if (i1.equals(i2)) {
			System.out.println("just a print statement if True");
		} else {
			System.out.println("just a print statement if False");
		}

		// does Autoboxing too.
		//no caching of integer values.
		i1 = 1000;
		i2 = 1000;
		if (i1 == i2) {
			System.out.println("just a print statement if True");
		} else {
			System.out.println("just a print statement if False");
		}
		if (i1.equals(i2)) {
			System.out.println("just a print statement if True");
		} else {
			System.out.println("just a print statement if False");
		}
	}

}
