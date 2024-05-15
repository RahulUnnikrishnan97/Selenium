package week3.day1;

public class OverLoading {
	
	String message;
	String status;
	boolean snap;
	
	public void reportStep (String message, String status) {
		
		System.out.println(message+status);
	}
	
	public void reportStep (String message, String status, boolean snap) {
		
		if (snap==true)
			System.out.println(message+status+snap);
		
	}
	
	public static void main(String[] args) {
		
		OverLoading mtd = new OverLoading ();
		
		mtd.reportStep("message", "status");
		mtd.reportStep("message", "status", false);
	}
}
