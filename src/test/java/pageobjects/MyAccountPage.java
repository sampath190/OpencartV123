package pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement MyAccount;
	
	public boolean isMyAccountExists() {
		try{
			return (MyAccount.isDisplayed());
			
		}catch(Exception e) {
			return false;
		}
	}

	
}
