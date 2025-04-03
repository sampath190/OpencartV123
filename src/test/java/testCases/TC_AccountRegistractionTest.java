package testCases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.RegistrationPage;
import testBase.BaseClass;


public class TC_AccountRegistractionTest extends BaseClass{

	@Test(groups={"regression","Master"})
	public void login() {
		
		Homepage Hobj=new Homepage(driver);
		Hobj.clickMyAccount();
		Hobj.clickregister();
		
		RegistrationPage Robj=new RegistrationPage(driver);
		
		Robj.enterFirstName("sam");
		Robj.EnterLastName("justin");
	}
	
	@AfterClass
	public void  teardown() {
		//driver.quit();		
		System.out.println("successful");
	}

}
