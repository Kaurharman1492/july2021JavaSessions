package OOP_Interface;

public class TestDriver {

	public static void main(String[] args) {
	   ChromeDriver driver=new ChromeDriver();
	   
       System.out.println("driver.getTitle");  
       System.out.println("driver.getUrl");
	   driver.FindElement();
	   driver.FindElements();
	   
	   System.out.println("driver.SendKeys"); 
	   driver.click();
	   driver.close();
	   
	   
   
	}

}
