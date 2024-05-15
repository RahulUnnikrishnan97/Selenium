package week3.day1;

public class PolymorphismActivity {
	
	public void multiply() {
		
		int a = 5;
		int b = 10;
		System.out.println(a*b);
		}
	
	public void multiply (int a, float b) {
		
		System.out.println(a*b);
	}
	
	public void multiply (float a, float b, int c) {
		
		System.out.println(a*b*c);
	}

	
	public static void main(String[] args) {
		
		PolymorphismActivity mul = new PolymorphismActivity ();
		
		mul.multiply(5, 5.2F);
	}
}
