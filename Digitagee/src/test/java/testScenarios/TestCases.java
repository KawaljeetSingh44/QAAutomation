package testScenarios;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TickketStatus;
import pageObjects.TrackService;
import testBatches.TestBatches;

public class TestCases {
	
	Login login;
	Home home;
	TickketStatus ticketStatus;
	TrackService trackService ;
	CancelTicket cancelTicket;
	WebDriver driver;
	ExtentTest child ;
	
	public TestCases(WebDriver driver ) {
		
		this.driver = driver;
//		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
		login = new Login(driver);
		home = new Home(driver);
		ticketStatus =  new TickketStatus(driver); 
		trackService  = new TrackService (driver);
		cancelTicket = new CancelTicket(driver);
		
	}
	boolean result;
	public void logReport(boolean flag,String stepName) 
	{
		if(flag) {
			child.log(LogStatus.PASS, stepName,"success");
		}
		else 
		{
			child.log(LogStatus.FAIL,child.addScreenCapture(TakeErrorScreenshot(stepName)) ,stepName);
			
			
		}
		
	}
	String screenshotFilePath;
	
	public String TakeErrorScreenshot(String fName) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			screenshotFilePath = new File(".").getCanonicalPath()+"\\Screenshots\\"+fName+ new Random().nextInt(999)+"png";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileUtils.copyFile(scrFile,new File(screenshotFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scrFile = null;
		return screenshotFilePath;
		
				
	}
	
	@Test
	public void bookBusTicketAndPrint() {
	   child = TestBatches.extent.startTest("BookBusTicketAndPrint");
		TestBatches.parent.appendChild(child);
		System.out.println("Test Case: BookBusTicketAndPrint ");
//		login.launchApplication();
//		login.loginTOApplication();
//		home.navigateToHome();
//		home.bookTicket2();
//		ticketStatus.navigateToTicketStatus();
//		ticketStatus.checkTicketStatus();
//		
		
	 logReport(login.launchApplication(),"launch");
		
	result = 	login.loginTOApplication();logReport(result,"Login");
	logReport(home.bookTicket2(),"bookTicket2");
	logReport(home.printTicket(),"printTicket");
	logReport(login.logOutFromApplication(),"logOutFromApplication");
	logReport(	login.closeApplication(),"closeApplication");

	

	}
	
	@Test
	public void bookBusTicketAndcheckStatus() {
		   child = TestBatches.extent.startTest("BookBusTicketAndcheckStatus");
			TestBatches.parent.appendChild(child);
		System.out.println("Test Case: bookBusTicketAndcheckStatus ");
//		login.launchApplication();
//		login.loginTOApplication();
//		home.navigateToHome();
//		home.bookTicket2();
//		ticketStatus.navigateToTicketStatus();
//		ticketStatus.checkTicketStatus();
//		
//		login.logOutFromApplication();
//		login.closeApplication();
		result = 	login.loginTOApplication();logReport(result,"Login");
		logReport(home.bookTicket2(),"bookTicket2");
		logReport(home.printTicket(),"printTicket");
		logReport(login.logOutFromApplication(),"logOutFromApplication");
		logReport(login.closeApplication(),"closeApplication");
		logReport(ticketStatus.navigateToTicketStatus()
,"navigateToTicketStatus");
		logReport(ticketStatus.checkTicketStatus()
,"checkTicketStatus");

		
		
	}
	@Test
	public void bookBusTicketAndTrackService() {
		   child = TestBatches.extent.startTest("BookBusTicketAndTrackService");
			TestBatches.parent.appendChild(child);
		System.out.println("Test Case: bookBusTicketAndTrackService ");
//		login.launchApplication();
//		login.loginTOApplication();
//		home.navigateToHome();
//		home.bookTicket2();
//		trackService.navigateToTrackService();
//		trackService.TrackTicketService();
//		login.logOutFromApplication();
//		login.closeApplication();
//		
		result = 	login.loginTOApplication();logReport(result,"Login");
		logReport(home.bookTicket2(),"bookTicket2");
		logReport(home.printTicket(),"printTicket");
	
		logReport(		trackService.navigateToTrackService()

,"navigateToTrackService");
		logReport(trackService.TrackTicketService()
,"TrackTicketService");
		logReport(login.logOutFromApplication(),"logOutFromApplication");
		logReport(login.closeApplication(),"closeApplication");
		

	}
	
	
	public void bookBusTicketAndCancelTicket() {
		   child = TestBatches.extent.startTest("BookBusTicketAndPrint");
			TestBatches.parent.appendChild(child);
		System.out.println("Test Case: bookBusTicketAndCancelTicket ");
//		login.launchApplication();
//		login.loginTOApplication();
//		home.navigateToHome();
//		home.bookTicket2();
//		cancelTicket.navigateToCancelTicket();
//		cancelTicket.CancelTheTicket();
//		login.logOutFromApplication();
//		login.closeApplication();
		logReport(login.launchApplication(),"launch");
		
		result = 	login.loginTOApplication();logReport(result,"Login");
		logReport(home.bookTicket2(),"bookTicket2");
		logReport(home.printTicket(),"printTicket");
	
		logReport(cancelTicket.navigateToCancelTicket(),"navigateToCancelTicket");
		
		logReport(login.logOutFromApplication(),"logOutFromApplication");
		logReport(login.closeApplication(),"closeApplication");
		

	}
		
	}



