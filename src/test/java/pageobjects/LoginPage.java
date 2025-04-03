package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="input-email")
	WebElement txtemail;
	
	@FindBy(id="input-password")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	public void EnterEmail(String Email) {
		txtemail.sendKeys(Email);
	}
	public void EnterPassword(String Pass) {
		txtpassword.sendKeys(Pass);
	}
	
	public void clicklogin() {
		loginbtn.click();
	}
	

}
