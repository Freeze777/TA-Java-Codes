package snippets;

class A {
	int x;
	public A(int x){
		this.x=x;
	}
}

public class FinalKeyWord {
	public static void main(String args[]) {
		final A a = new A(100); // its like constant pointer in C;
		a.x = 30; // Works
		//a=new A(120);//fails
		final int i=10;
		//i=100;//Fails
	}
}
