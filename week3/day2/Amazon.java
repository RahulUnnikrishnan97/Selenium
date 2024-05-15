package week3.day2;

public class Amazon extends CanaraBank implements Payments  {
	
	
	public static void main(String[] args) {
		
		Amazon Az = new Amazon();
		Az.cardPayments();
		Az.cashOnDelivery();
		Az.internetBanking();
		Az.upiPayments();
	}

	public void cashOnDelivery() {
		System.out.println("Cash on delivery is acceptable");
		// TODO Auto-generated method stub
		
	}

	public void upiPayments() {
		System.out.println("UPI Payments are accepted");
		// TODO Auto-generated method stub
		
	}

	public void cardPayments() {
		System.out.println("Car payments are verified");
	
		// TODO Auto-generated method stub
		
	}

	public void internetBanking() {
		System.out.println("Interbanking is done here");
		// TODO Auto-generated method stub
		
	}
	
}
