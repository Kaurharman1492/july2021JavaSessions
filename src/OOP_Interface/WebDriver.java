package OOP_Interface;

public interface WebDriver extends SearchContext{

	
	public void FindElement();
	public void FindElements();
	
	public String getTitle();
	//public void launchUrl();
	public void getUrl(String Url);
	
	public void click();
	public void SendKeys(String value);
	public void close();
	
	
	
}
