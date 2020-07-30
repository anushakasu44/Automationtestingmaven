package Com.test.AutomationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		// POSITIVE SCENARIO OF LOGIN FUNCTIONALITY....
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Username=driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));
		Username.sendKeys("");
		
		WebElement Password=driver.findElement(By.xpath("//input[contains(@type,'passwo')]"));
				Password.sendKeys("");
				
				
				WebElement Submit=driver.findElement(By.xpath("//input[contains(@type,'mit')]"));
				Submit.click();
				Thread.sleep(3000);
				driver.quit();
	}



	}


