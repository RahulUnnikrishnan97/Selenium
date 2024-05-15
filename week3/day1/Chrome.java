package week3.day1;

public class Chrome extends InheritanceBrowserActivity {

	public void openIncognito() {
		System.out.println("Oprn Chrome Browser");
	}
	
	public void clearCache() {
		System.out.println("Clear the cache");
	}
	
	public static void main(String[] args) {
		
		Chrome test = new Chrome ();
		test.closeBrowser();
		test.navigateBack();
		test.openURL();
		test.openIncognito();
		test.clearCache();
	}
}
