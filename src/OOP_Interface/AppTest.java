package OOP_Interface;

public class AppTest {
	
	
      static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Browser="Firefox";
		
		if (Browser.equals("chrome")) {
			driver=new ChromeDriver();
		
		}
		else if
		(Browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		
		}
		else if 
		(Browser.equals("safari")) {
			driver=new SafariDriver();
		
		}
		else {
			System.out.println("please print the right browser");
		}
		
		
//ChromeDriver driver=new ChromeDriver();
		
		
driver.FindElement();
driver.FindElements();
driver.getUrl("www.amazon.com");
driver.getTitle();
driver.SendKeys("hello");
driver.click();
driver.close();
	}

}
