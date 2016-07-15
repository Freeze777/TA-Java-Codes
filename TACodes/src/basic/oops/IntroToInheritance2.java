package basic.oops;

abstract class Animal {
	private String species;
	/* Animal has become an abstract concept
	 * Cant be instantiated
	 * can we have anymore instance variables??
	 * Yes you can..!!
	 * But cant initialise them using a constructor..!!
	 * */

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	abstract void makeSomeNoise();// most important use of abstract class
}
/*
 * Wot is the differnce between Interface and Abstract classes..!!!
 * When to use Interface over Abstract?? 
 * */

class Dog extends Animal {
	
	@Override
	void makeSomeNoise() {
		System.out.println("Bow Bow Bow");
		
	}
	
}

class Cat extends Animal {

	@Override
	void makeSomeNoise() {
		System.out.println("Meow Meow Meow");
	}

	

}

public class IntroToInheritance2 {
	public static void main(String[] args) {

	}
}
