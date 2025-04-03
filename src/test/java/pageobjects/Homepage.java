package pageobjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement Login;
	
	
	public void clickMyAccount() {
		MyAccount.click();
	}
	
	public void clickregister() {
		register.click();
	}
	
	public void clickLogin() {
		Login.click();
	}

}
