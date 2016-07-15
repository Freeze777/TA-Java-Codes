package basic.oops;

abstract class Animal {
	private String name;
	/* Animal has become an abstract concept
	 * Cant be instantiated
	 * can we have anymore instance variables??
	 * Yes you can..!!
	 * Abstract classes can have constructor..!!subclasses uses this constructor to initialise the base class.
	 * But we cant instantiate an abstract class object..!!
	 * */

	
	abstract public void makeSomeNoise();// most important use of abstract class


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
/*
 * Wot is the differnce between Interface and Abstract classes..!!!
 * When to use Interface over Abstract?? 
 * */

class Dog extends Animal {
	void dogSpecificFunction(){
		System.out.println("I am man's best friend..!!");
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Bow Bow Bow");
		
	}
	
}

class Cat extends Animal {
	void catSpecificFunction(){
		System.out.println("I have an attitude problem..!!");
	}
	@Override
	public void makeSomeNoise() {
		System.out.println("Meow Meow Meow");
	}

	

}

public class IntroToInheritance2 {
	public static void main(String[] args) {
		Cat tom=new Cat();
		tom.setName("Tom");
		tom.makeSomeNoise();
		tom.catSpecificFunction();
		
		Dog scooby=new Dog();
		scooby.setName("Scooby");
		scooby.makeSomeNoise();
		scooby.dogSpecificFunction();
		
		Animal a=scooby;
		/*which of these will work????*/
		//a.makeSomeNoise();
		//a.dogSpecificFunction();
		//a.catSpecificFunction();

	}
}
