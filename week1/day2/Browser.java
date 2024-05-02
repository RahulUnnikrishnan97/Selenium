package week1.day2;

public class Browser {
	
	public static void main(String[] args) {
	Browser b = new Browser();
	String browser = b.launchBrowser("FF");
	System.out.println("Browser name is: "+browser);
	b.loadUrl();
}
	
	public String launchBrowser (String browsername) {
	
	System.out.println("Browser launched successfully");
	
	return browsername;
}
	
public void loadUrl () {

System.out.println ("Application url loased successfully");
}
}





