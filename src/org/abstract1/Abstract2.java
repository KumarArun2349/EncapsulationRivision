package org.abstract1;

public class Abstract2 extends Abstraction1 {

	@Override
	public void biriyaniIncredients() {
		
		System.out.println("Chicken Biriyani");
	}
	public static void main(String[] args) {
		Abstract2 a2=new Abstract2();
		a2.biriyani();
		a2.biriyaniIncredients();
	}

}
