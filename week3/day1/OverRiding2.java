package week3.day1;

public class OverRiding2 extends OverRiding {
	 // Overriding the makeSound method
	 @Override
	 public void makeSound() {
	     System.out.println("Dog barks");
	 }

	public static void main(String[] args) {
	     // Creating objects for both classes
		 OverRiding animal = new OverRiding();
	     OverRiding2 dog = new OverRiding2();
	     
	     // Calling methods
	     animal.makeSound(); // Output: Animal makes a sound
	     dog.makeSound();    // Output: Dog barks
	 }
	}