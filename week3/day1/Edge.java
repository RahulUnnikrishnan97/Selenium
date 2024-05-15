package week3.day1;

public class Edge extends InheritanceBrowserActivity {
	
	public void takeSnap() {
		System.out.println("Take the snap");
	}
	
	public void clearCookies() {
		System.out.println("Cleat the cookies");
	}
	
	public static void main(String[] args) {
		
		Edge test1 = new Edge ();
		test1.closeBrowser();
		test1.navigateBack();
		test1.openURL();
		test1.clearCookies();
		test1.takeSnap();
	}

}
