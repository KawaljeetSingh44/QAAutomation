package pageObjects;

import org.openqa.selenium.WebDriver;

import appliutilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class TrackService {
	
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	
	public TrackService(WebDriver driver) {
		
		this.driver = driver;
		data = new ReadProperties("TestData/DevData.properties");
		appUtils = new ApplicationUtilities(driver);
		
	}
	
	
	public boolean navigateToTrackService() {
		System.out.println("RC: Navigate To TrackService");
		appUtils.getElement("//a[@title='Track Service']").click();
		return true;
	}
	
	public boolean TrackTicketService() {
		System.out.println("RC: Track Ticket service");
		appUtils.getElement("//input[@name = 'serviceCode']").sendKeys(data.readData("TicketNumber"));
		return true;
	}
	

}
