package org.abstract1;

public class Car1 implements Car,Car2 {

	@Override
	public void carName() {
		System.out.println("BMW");
	}

	@Override
	public void carColour() {
		System.out.println("Red");
	}
	public static void main(String[] args) {
		Car1 c1=new Car1();
		c1.carName();
		c1.carColour();
	}

	@Override
	public void carWeight() {
		System.out.println();
	}

	@Override
	public void carRate() {
		
	}

}
