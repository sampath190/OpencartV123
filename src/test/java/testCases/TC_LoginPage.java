package testCases;

import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import testBase.BaseClass;

public class TC_LoginPage extends BaseClass {

	@Test(groups={"sanity","Master"})
	public void Logincheck() {
		
		Homepage Hobj=new Homepage(driver);
		
		Hobj.clickMyAccount();
		Hobj.clickLogin();
		
		LoginPage Lobj=new LoginPage(driver);
		
		Lobj.EnterEmail(p.getProperty("Email"));
		Lobj.EnterPassword(p.getProperty("password"));
		Lobj.clicklogin();
		
		MyAccountPage Mobj=new MyAccountPage(driver);
		
		System.out.println(Mobj.isMyAccountExists());
		
	}
}
