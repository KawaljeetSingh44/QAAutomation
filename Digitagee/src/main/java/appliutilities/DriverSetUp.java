package appliutilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import gUtilities.ReadProperties;

public class DriverSetUp {
    
	ReadProperties config;
	WebDriver driver;

	public DriverSetUp(){
		
		config = new ReadProperties("TestData/Configure.properties");
		
		
	}
	public WebDriver getDriver()
	{
		if(config.readData("ExecutionType").equalsIgnoreCase("LOCAL")){
			getLocalDriver();
			
		}
		else if(config.readData("ExecutionType").equalsIgnoreCase("Remote")) {
			getRemoteDriver();
			
		}
		else {
			System.out.println("given execution is not supported"+config.readData("ExecutionType").toUpperCase());
				
		}
		return driver;
	}
	URL url;

	public WebDriver getRemoteDriver() {
		try {
			url = new URL(config.readData("SAUSELABURL"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, config.readData("Browser"));
		capabilities.setCapability(CapabilityType.VERSION, config.readData("BrowserVersion"));
		capabilities.setCapability("name", config.readData("ApplicationName"));
		capabilities.setCapability("screen-resolution", config.readData("ScreenResolution"));
		capabilities.setCapability(CapabilityType.PLATFORM, config.readData("OS"));
		capabilities.setCapability("accessKey", config.readData("SauseLabsAccessKey"));
		capabilities.setCapability("username", config.readData("SauseLabsUserName"));




		


		driver = new RemoteWebDriver(url,capabilities);
		return driver;
	}
	
	public WebDriver getLocalDriver() {
		if(config.readData("Browser").equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			
		}
		else if(config.readData("Browser").equalsIgnoreCase("MSEDGE")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
					
		}
		
		else {
			if(config.readData("Browser").equalsIgnoreCase("CHROME")){
				System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

				driver = new ChromeDriver();
				
			}
			
			
		}
		return driver;
	}
	

}
