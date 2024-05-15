package week3.day1;

public class InheritanceBrowserActivity {
	
	String browserName;
	String browserVersion;

	
	public void openURL () {
		System.out.println("Open the URL");
	}
	public void closeBrowser () {
		System.out.println("Close the browser");
	}
	public void navigateBack () {
		System.out.println("Navigate back to the previous tab");
	}
	
	public static void main(String[] args) {
		InheritanceBrowserActivity browser = new InheritanceBrowserActivity ();
		//browser.browserName.charAt("Chrome");
		browser.closeBrowser();
		browser.navigateBack();
		browser.openURL();
	
	

}
}
