package com.vaakruthi.oops;
/**
 * 1.interface
 * 2.implementaion class
 * 3.method overriding
 * 4.generalization
 * 5.upcasting
 */
public class RunTimePolymorphism {
	public static void zoo(Animal animal)
	{
		animal.noise();
	}
	public static void main(String[] args) {
		zoo((Animal)new Lion());
		zoo((Animal)new Tiger());
		zoo((Animal)new Cheetah());
	}
}
interface Animal{
	void noise();
}
class Lion implements Animal{
	public void noise() {
		System.out.println("Lion noise...");
	}
}
class Tiger implements Animal{
	public void noise() {
		System.out.println("Tiger noise...");
	}
}
class Cheetah implements Animal{
	public void noise()
	{
		System.out.println("Cheetah noise...");
	}
}
