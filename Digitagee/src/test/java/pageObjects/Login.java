package pageObjects;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import appliutilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class Login {
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;

	public Login(WebDriver driver) {
		this.driver = driver;

		
		
		
		data = new ReadProperties("TestData/DevData.properties");
		appUtils = new ApplicationUtilities(driver);
		
		
	}
	
	@Test
	public boolean launchApplication() {
		System.out.println("RC: Launch Application");
		driver.get(data.readData("URL"));
		//if(driver.getTitle().equals(data.readData("expected")))
			return true;
		//	else
		//		return false;
			
		
	}
	
	
	public boolean loginTOApplication() {
		System.out.println("RC: login Application");
		return true;
	}
	
	
	public boolean logOutFromApplication() {
		System.out.println("RC: logout Application");
		return true;
	}
	
	
	public boolean closeApplication() {
		System.out.println("RC: close Application");
		return true;
	}


}
