package pageObjects;

import org.openqa.selenium.WebDriver;

import appliutilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class CancelTicket {
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	
	public CancelTicket(WebDriver driver) {
		
		this.driver = driver;
		data = new ReadProperties("TestData/DevData.properties");
		appUtils = new ApplicationUtilities(driver);
		
	}
	
	
	public boolean navigateToCancelTicket() {
		System.out.println("RC: Navigate To CancelTicket");
		appUtils.getElement("//a[@title='Cancel Ticket']").click();
		return true;
	}
	
	public void CancelTheTicket() {
		System.out.println("RC:  Cancel ticket");
	}
	


}
