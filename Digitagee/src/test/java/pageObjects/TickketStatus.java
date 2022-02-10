package pageObjects;

import org.openqa.selenium.WebDriver;

import appliutilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class TickketStatus {
	
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	
	public TickketStatus(WebDriver driver) {
		
		this.driver = driver;
		data = new ReadProperties("TestData/DevData.properties");
		appUtils = new ApplicationUtilities(driver);
		driver.manage().window().maximize();
		
	}
	
	public boolean navigateToTicketStatus() {
		System.out.println("RC: Navigate To Home");
		
		appUtils.getElement("//a[@title = 'Ticket Status']").click();
		return true;
	}
	
	public boolean checkTicketStatus() {
		System.out.println("RC: Check Ticket Status");
		appUtils.getElement("//input[@name = 'id' and @class = 'searchTktCancel' ]").sendKeys("123445");
		return true;
		
	}
	
	public void printTicket() {
		System.out.println("RC : Print Ticket");
	}

}
