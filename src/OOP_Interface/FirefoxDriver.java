package OOP_Interface;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver(){
		System.out.println("launch Firefox");
	}

	@Override
	public void FindElement() {
		System.out.println("find the Element");
		
	}

	@Override
	public void FindElements() {
		System.out.println("find the Elements");
		
	}

	@Override
	public String getTitle() {
	return "get the title";
	}

	@Override
	public void getUrl(String Url) {
		System.out.println("https//:www.amazon.com");
		
	}

	@Override
	public void SendKeys(String value) {
		System.out.println("enter the value"); 
	}

	@Override
	public void click() {
		System.out.println("click the Element");
		
	}

	@Override
	public void close() {
	System.out.println("close the element");
		
	}

}
