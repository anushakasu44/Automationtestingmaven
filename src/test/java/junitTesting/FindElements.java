package junitTesting;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindElements {
ChromeDriver driver;

	@FindBy(xpath="//a")
	List<WebElement> findelements;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submit;
	
	public FindElements(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void findingElements() {
		
		for(int i=0;i<=findelements.size();i++) {
			if(findelements.get(i).getText().equals("REGISTER")) {
			findelements.get(i).click();
			System.out.println("clicked");
			break;
		}
	}
	}
	
	public void enterFname() {
		Fname.sendKeys("Anusha");
	}
	
    public void enterLaname() {
    	Lname.sendKeys("Reddy");
	}
    
    public void clickOnsubmit() {
    	submit.click();
    }

	
	
}
