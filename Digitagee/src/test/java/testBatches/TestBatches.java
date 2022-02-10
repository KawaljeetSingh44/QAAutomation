package testBatches;





import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.junit.AfterClass;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import appliutilities.DriverSetUp;
import gUtilities.ReadProperties;
import testScenarios.TestCases;



public class TestBatches {
	TestCases testCases;
	ReadProperties config;
	public static String env;
	WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest  parent;
	String root;
	
	public TestBatches() {
	driver = 	new DriverSetUp().getDriver();
		testCases = new TestCases(driver);

		config = new ReadProperties("TestData/Configure.properties");
		env = config.readData("Environment");
		String ttype = config.readData("TestingType");
		int ran = new Random().nextInt(9999);
		try {
			 root = new File(".").getCanonicalPath();
			 System.out.println("my root directory"+root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 //extent = new ExtentReports("C:\\Users\\lenovo\\eclipse-workspace\\Digitagee\\Reports\\ApsrtcReports-"+ttype+ran+".html");
	 extent = new ExtentReports(root+"\\Reports\\ApsrtcReports-"+ttype+ran+".html");

 parent = extent.startTest("SMOKE");


		
	}
	
@Test
	public void runUserChoice() {
		System.out.println("*********Execution Type****************");
		System.out.println(config.readData("TestingType"));
		System.out.println(config.readData("ExecutionType"));
		System.out.println(config.readData("Browser"));

		
		
		if(config.readData("TestingType").equalsIgnoreCase("SMOKE")) {
			smokesuite();
		}
		else if(config.readData("TestingType").equalsIgnoreCase("REGRESSION")) {
			regressionSuite();
		}
		
		else {
			System.out.println("Testing is not supported" + config.readData("TestingType"));
		}
	}
	
	@Test
	public void smokesuite() {
	
	////	ExtentTest child1 = extent.startTest("bookBusTicketAndCancelTicket");
	//	ExtentTest child2 = extent.startTest("bookBusTicketAndPrint");
	//	ExtentTest child3 = extent.startTest("bookBusTicketAndTrackService");
//		smoke.appendChild(child1);
//		smoke.appendChild(child2);
//		smoke.appendChild(child3);
		
		testCases.bookBusTicketAndCancelTicket();
//	child1.log(LogStatus.PASS,"bookBusTicketAndCancelTicket" , "Success");
//	child1.log(LogStatus.INFO, "It is a smoke test,it took 50 seconds");
	//testCases.bookBusTicketAndPrint();
	//child2.log(LogStatus.PASS,"bookBusTicketAndPrint" , "Success");
//	child2.log(LogStatus.INFO, "It is a smoke test,it took 50 seconds");
//	testCases.bookBusTicketAndTrackService();
//	child3.log(LogStatus.PASS,"bookBusTicketAndTrackService" , "Success");
//	child3.log(LogStatus.INFO, "It is a smoke test,it took 50 seconds");





		
	}
	
	@Test
	public void regressionSuite(){
		System.out.println("Test Suite: Regresssion");
		testCases.bookBusTicketAndCancelTicket();
		testCases.bookBusTicketAndPrint();
		testCases.bookBusTicketAndTrackService();
		testCases.bookBusTicketAndcheckStatus();
		
	}
	
	
	@AfterTest
	public void quitm()
	{
		extent.endTest(parent);
		
		extent.flush();
	}

}
