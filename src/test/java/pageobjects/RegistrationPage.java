package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	// so by this we can Avoid writing page factor and all constructor stuff
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement LastName;
	
	
	public void enterFirstName(String fname ) {
		firstname.sendKeys(fname);
	}
	
	public void EnterLastName(String lname) {
		LastName.sendKeys(lname);
	}


}
