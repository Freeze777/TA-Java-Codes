package basic.oops;
/*
 * Java doesnt allow multiple inheritance for classes..!!!!!!
 * Design decision...!!!!
 * 
 * */
class Person {
	private String name;// ??? private?? protected??? or nothing??
	private char gender;

	public Person(String name, char gender) {
		super();// can be ignored.. JVM will call it anyway..!!
		this.name = name;
		this.gender = gender;
	}
	// another use of final keyword revealed..!!!!!
	public final void personalViews(){
		System.out.println("This is my personal views");
	}

	/* Why we need getters and setters??? */
	/* These methods are inherited by sub classes and therefore accessible */
	// i.e private fields are 'INDIRECTLY' accessible to subclasses...
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

}

class Doctor extends Person {
	private int docID;

	public Doctor(String name, char gender, int docID) {
		super(name, gender);// cant be ignored.. without construction the base
							// class object we cant have subclass object
		this.docID = docID;
	}

	public boolean getAppointment() {
		double d = Math.random();
		return (d > 0.5);
	}

	public int getDocID() {
		return docID;
	}

	public void setDocID(int docID) {
		this.docID = docID;
	}

	@Override
	public String toString() {
		return "Doctor [docID=" + docID + "], Person=" + super.toString()
				+ "]";
	}
	//cant do this... we cant override final methods of super class
	/*@Override
	public final void personalViews(){
		System.out.println("This is my personal views");
	} */
}

class Farmer extends Person {
	private int farmerID;

	public Farmer(String name, char gender, int farmerID) {
		super(name, gender);// cant be ignored.. without construction the base
							// class object we cant have subclass object

		this.farmerID = farmerID;

	}

	public boolean makeADeal(double discount) {
		double d = Math.random();
		return (d < discount);
	}

	public int getFarmerID() {
		return farmerID;
	}

	public void setFarmerID(int farmerID) {
		this.farmerID = farmerID;
	}

	@Override
	public String toString() {
		return "Farmer [farmerID=" + farmerID + "], Person="
				+ super.toString() + "]";
	}

}

/* For those who want syntaxes.....!!!!! */
public class IntroToInheritance {
	public static void main(String[] args) {
		Person palash = new Person("Palash", 'M');
		System.out.println(palash.getName());
		
		Doctor mani=new Doctor("Mani",'M',84643);
		System.out.println(mani.getName());//why was this possible???
		System.out.println(mani.getAppointment()?"Appointment fixed with Dr.Mani":"Appointment ignored by Dr.Mani");
		
		Farmer prachi=new Farmer("Prachi",'M',6523);
		System.out.println(prachi.getName());//same as before..!
		System.out.println(prachi.makeADeal(0.6)?"Prachi made deal for 60% discount":"Prachi denied deal for 60% discount");
		
		Person kritika=new Farmer("Kritika", 'F', 72655);//why??????? wot all function can we access with Person reference.!!
		//ALERT: POLYMORPHISM coming ahead..!!!
		System.out.println(kritika.getName());// why??
		System.out.println(kritika);//which toString() got called..!!! RTP in action..!!!
		
		
		
	}
}
