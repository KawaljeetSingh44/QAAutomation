package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appliutilities.ApplicationUtilities;
import gUtilities.GeneralUtilities;
import gUtilities.ReadProperties;

public class Home {
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	
	public Home(WebDriver driver) {
		
		this.driver = driver;
		data = new ReadProperties("TestData/DevData.properties");
		appUtils = new ApplicationUtilities(driver);
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	public boolean navigateToHome() {
		//GeneralUtilities.fixedWait(10);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Homebtn));
		System.out.println("RC: Navigate To Home");
		 appUtils.getElement("//a[@title = 'Home']").click();
		 if(FromCityObj.isEnabled())
			 return true;
			 else
	return false;
	}
	
	
	public void bookTicket() {
		
		String[] allFromCities = data.readData("FromCities").split(",");
		String[] allToCities = data.readData("ToCities").split(",");
		String[] allJDates = data.readData("JDates").split(",");
		for(int i=0;i<allFromCities.length;i++) {

		
		System.out.println("RC: Book Ticket");
		System.out.println("--------------------------------Iteration :" );
		appUtils.getElement("//input[@name='source']").sendKeys(allFromCities[i]);
		GeneralUtilities.fixedWait(1);
		appUtils.clickEnter();
		appUtils.getElement("//input[@name='destination']").sendKeys(allToCities[i]);
	GeneralUtilities.fixedWait(1);
		appUtils.clickEnter();
		appUtils.getElement("//input[@name= 'txtJourneyDate']").click();
		selectDate(allJDates[i]);

		appUtils.getElement("//input[@name='searchBtn']").click();
		GeneralUtilities.fixedWait(0);
		appUtils.getElement("//a[@title='Home']").click();
	}
			
		
	}
	
	@FindBy(xpath = "//input[@name='source']") WebElement FromCityObj;
	@FindBy(xpath = "//input[@name='destination']") WebElement ToCityObj;
	@FindBy(xpath = "//input[@name= 'txtJourneyDate']") WebElement opencalenderbtn;
	@FindBy(xpath = "//input[@name='searchBtn']") WebElement Searchbtn;
	@FindBy(xpath = "//a[@title='Home']") WebElement Homebtn; 
	@FindBy(xpath = "//a[@id = 'sbkg']") WebElement modifysearch; 


	public boolean bookTicket2(){
		
	
		
		System.out.println("RC: Book Ticket");
	
		FromCityObj.sendKeys(data.readData("FromCity"));
		GeneralUtilities.fixedWait(1);
		appUtils.clickEnter();
		ToCityObj.sendKeys(data.readData("ToCity"));
	GeneralUtilities.fixedWait(1);
		appUtils.clickEnter();
		opencalenderbtn.click();
		selectDate( data.readData("JDate"));

		Searchbtn.click();
		GeneralUtilities.fixedWait(0);
		if(modifysearch.getText().trim().equalsIgnoreCase("Modify Search"))
		{
			Homebtn.click();
return true;
		}
else {
	return false;
}
			
		}
			
	
	
	
	

	public boolean printTicket() {
		System.out.println("RC : Print Ticket");
		return true;
	}
	
	public void selectDate(String jDate) {
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
	}

}
