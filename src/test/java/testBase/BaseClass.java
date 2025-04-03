package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass {


	public Properties p;
	public WebDriver driver;
	@BeforeClass(groups={"sanity","Master","regression"})
	@Parameters({"browser"})
	public void setUp(String br) throws IOException {
		// configuration of properties file
		FileInputStream file=new FileInputStream("./src//test//resources//Config.txt");
		p=new Properties();
		
		p.load(file);
		
		
		// browser form xml sheet
		switch(br.toLowerCase()) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge" : driver=new EdgeDriver();break;
		default: System.out.print("Invalid browser name");return ;
		}
			
		//driver=new ChromeDriver();
		driver.get(p.getProperty("AppUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
}
