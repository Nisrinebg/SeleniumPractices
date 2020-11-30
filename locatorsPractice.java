package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LocatorPractices {
	
	WebDriver driver;
	String mainWindow ="https://www.rahulshettyacademy.com/AutomationPractice/";
	String oldTab;
	
	public void callBrowser() {
		
		
		System.setProperty("webdriver.gecko.driver","/home/nisrine/Downloads/geckodriver-v0.28.0-linux64/geckodriver");
	    driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(mainWindow);
		oldTab = driver.getWindowHandle();
		
	}
	
	
	public void getPageTitle() {
		
		String title = driver.getTitle();
		System.out.println("the title of the page is "+ title);
		
	}
	
	public void clickRadioButtons() throws InterruptedException {
		
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		
	}
	
	public void selectfromDynamicdropdown() throws InterruptedException {
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("lebanon");
		Select autocomplete =new Select(driver.findElement(By.id("dropdown-class-example")));
		Thread.sleep(1000);
	}

	public void selectfromStaticdropdown() {
		driver.findElement(By.id("dropdown-class-example")).click();
		Select select =new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByValue("option2");
	}
	
	public void selectCheckboxes() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		boolean result= driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		try {
			Assert.assertEquals(result, true);
			
		}
		catch(AssertionError e) {
			
			System.out.println("Expected false but returned True");
			driver.manage().window();
		}
		
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(1000);
		
	}
	
	public void uncheckCheckboxes() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(1000);
		
	}
	
	public void switchTab() throws InterruptedException {
		
		
		driver.findElement(By.id("opentab")).click();
		
		
		//it can be done through xpath as well
		//driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(4000);
		
	}
	
	
	
	public void switchtoMainWindow() throws InterruptedException {
		
		driver.switchTo().window(oldTab);
		
		
	}
	
	
//driver.close() method closes the currently active window and driver.quit() method closes all the opened windows
	
    
	
	public void openWindow() throws InterruptedException {
		
		
		 driver.findElement(By.id("openwindow")).click();
		
		
		//System.out.println(driver.getTitle());
		
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
	}
    
	public void closePage(){
		
		driver.close();
				
	}	

	public static void main(String[] args) throws InterruptedException {
		
		LocatorPractices lp= new LocatorPractices();
		
		lp.callBrowser();
		lp.getPageTitle();
		lp.clickRadioButtons();
		lp.selectfromDynamicdropdown();
		lp.selectfromStaticdropdown();
		lp.selectCheckboxes();
		lp.uncheckCheckboxes();  
		lp.switchTab();
		lp.switchtoMainWindow();
		lp.openWindow();
		lp.closePage();
		
		
		
		
		
		
		
				
		

	}
	
}
