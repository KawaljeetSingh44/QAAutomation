package com.Digitagee;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	String name = "Ram";
	WebDriver driver;
	String expected = "Book bus tickets online with redBus!";
	Actions actions;

	
    
	public AppTest() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	actions = new Actions(driver);
	driver.manage().window().maximize();
	
	
	}

@Before
public void launch_Redbusautomation() {
	System.out.println("launch application" + name);
	driver.get("https://www.redbus.in/");
	//Assert.assertEquals(expected,driver.getTitle());
	
	
	
	
}

@Test
public void loginToApplication() {
	driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
	driver.findElement(By.xpath("//li[@id='signInLink']")).click();
	WebElement loginFrame =driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(loginFrame);
	driver.findElement(By.xpath("//input[@id= 'mobileNoInp']")).sendKeys("31322233");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//i[@class='icon-close']")).click();
	driver.findElement(By.linkText("redRail")).click();
}


@Test
public void bookTicket() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id = 'src']")).sendKeys("BAREILLY");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
	driver.findElement(By.xpath("//input[@id = 'dest'] ")).sendKeys("DELHI");
	action.sendKeys(Keys.ENTER).perform();
	driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	Thread.sleep(2000);
	
 driver.findElement(By.xpath("//table//tr//td[text()='3']")).click();
	driver.findElement(By.xpath("//button[@id = 'search_btn']")).click();
//	driver.navigate().to("https://www.sugarcrm.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.sugarcrm.com");
	
	

 driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
 driver.findElement(By.xpath("//span[text()='Get a Demo']")).click();
WebElement select = driver.findElement(By.xpath("//select[@name='employees_c']"));
 action.moveToElement(select);
 Select selects = new Select(select);
 selects.selectByVisibleText("1 - 10 employees");
 driver.findElement(By.cssSelector("input#interest_market_c0")).click();
 driver.findElement(By.cssSelector("input#doi0")).click();
	
	
	driver.navigate().to("https://salesforce.com");
driver.findElement(By.xpath("//a[@aria-label='Start my free trial with Salesforce CRM']")).click();
Set<String> windowhandles = driver.getWindowHandles();
Iterator<String> iterator = windowhandles.iterator();
String parentWindow =  iterator.next();
String childWindow = iterator.next();
driver.switchTo().window(childWindow);
 driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("hello");
 driver.quit();
 

	
	
}

@Test
public void webtable() throws InterruptedException {
	driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	Thread.sleep(2000);
	WebElement myCalender = driver.findElement(By.xpath("//table[@class = 'rb-monthTable first last']"));
	List<WebElement> myrows = myCalender.findElements(By.tagName("tr")); 
	int Rowcount = myrows.size();
	System.out.println("my row count" + Rowcount);
	WebElement secondRow = myrows.get(1);
	List<WebElement> myColumns = secondRow.findElements(By.tagName("th"));
	System.out.println("My Column Count" +myColumns.size());
	List<WebElement> row3 = myrows.get(2).findElements(By.tagName("td"));
	row3.get(0).getText();
	String val42 = myrows.get(4).findElement(By.tagName("td")).getText();
	System.out.println("cell data at 4,2 " +val42);
	
	
	


}
	
	
}
