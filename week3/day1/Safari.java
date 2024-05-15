package week3.day1;

public class Safari extends InheritanceBrowserActivity{

	public void readMode() {
		System.out.println("Read mode in ON");
	}
	
	public void fullScreenMode () {
		System.out.println("Open full screen mode");
	}
	
	public static void main(String[] args) {
		
		Safari test2 = new Safari();
		test2.closeBrowser();
		test2.navigateBack();
		test2.openURL();
		test2.fullScreenMode();
		test2.readMode();
	}
}

