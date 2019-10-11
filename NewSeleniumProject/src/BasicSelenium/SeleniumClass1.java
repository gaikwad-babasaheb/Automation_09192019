package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass1{

	@Test
	public void login()
	{
		System.out.println("launch crome browser");
		
		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.get("http://google.com");

	
}

}
