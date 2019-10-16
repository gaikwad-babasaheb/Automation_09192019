package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass2 {
	
	@Test
	public void test()
	{
		System.out.println("launch crome browser");

		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.get("http://www.newtours.demoaut.com/");

		dr.manage().window().maximize();
		System.out.println(dr.findElement(By.linkText("REGISTER")).getText());
		System.out.println(dr.findElement(By.linkText("REGISTER")).getAttribute("href"));
		dr.findElement(By.partialLinkText("ISTER")).click();
	}

}
