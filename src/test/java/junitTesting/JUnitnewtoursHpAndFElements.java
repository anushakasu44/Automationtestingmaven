package junitTesting;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JUnitnewtoursHpAndFElements {
 ChromeDriver driver;
 
	@Before
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void bhomepageNewtours() {
		
		newtoursHomePage ob=new newtoursHomePage(driver);
		ob.enterUsername("anushakasu44");
		ob.enterPassword("anushakasu");
		ob.clickOnsubmit();
	}
	
	@Test
	public void aelements() {
		FindElements ob1=new FindElements(driver);
		ob1.findingElements();
		ob1.enterFname();
		ob1.enterLaname();
		ob1.clickOnsubmit();
		
	}
	
	@After 
	public void closeBrowser(){
		driver.quit();
	}
	
}
