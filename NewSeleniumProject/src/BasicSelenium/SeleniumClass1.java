package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass1 {

	@Test
	public void login() throws InterruptedException {
		System.out.println("launch crome browser");

		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.get("http://www.newtours.demoaut.com/");

		dr.manage().window().maximize();

		WebElement username = dr.findElement(By.name("userName"));

		username.sendKeys("mercury");
		username.clear();

		username.sendKeys("mercury");

		dr.findElement(By.name("password")).sendKeys("mercury");
		// Button
		dr.findElement(By.name("login")).click();

		// Radio button
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());

		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		
		WebElement pass= dr.findElement(By.xpath("//select[@name='passCount']"));
		
		Select sel=new Select(pass);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("2");
		Thread.sleep(2000);
		
		
		
		
	}

}
