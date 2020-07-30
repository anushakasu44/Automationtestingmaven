package junitTesting;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@FixMethodOrder(MethodSorters.JVM)
public class JUnitLogin {
ChromeDriver driver;
	
	@Before
    public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@Test	
	public void aloginScenarioNagative() {
		
		WebElement Username=driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));
		Username.sendKeys("anushakasu44@gmail.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[contains(@type,'passwo')]"));
				Password.sendKeys("anushakasu44");
				System.out.println("updated");
				
	}
	
	@Test
    public void bloginScenarioPositive()  {
		
		WebElement Username=driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));
		Username.sendKeys("anushakasu44");
		
		WebElement Password=driver.findElement(By.xpath("//input[contains(@type,'passwo')]"));
				Password.sendKeys("Anu");
				System.out.println("updated1");
	}	
	@After
    public void closeBrowser() {
		
		driver.quit();	
	}
}
