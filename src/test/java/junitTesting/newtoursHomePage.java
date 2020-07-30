package junitTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newtoursHomePage {
	ChromeDriver driver;
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement Username;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public newtoursHomePage(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String data) {
		Username.sendKeys(data);
	}
	
	public void enterPassword(String data) {
		Password.sendKeys(data);
	}
	
	public void clickOnsubmit() {
		submit.click();
	}
	
}
