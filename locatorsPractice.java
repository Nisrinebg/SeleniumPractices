package locators;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;




public class locatorsPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/nisrine/Desktop/selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		// testing radio buttons 
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		
		//testing dynamic dropdown
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("lebanon");
		Select autocomplete =new Select(driver.findElement(By.id("dropdown-class-example")));
		Thread.sleep(1000);
		
		
		//testing static dropdownclick
		driver.findElement(By.id("dropdown-class-example")).click();
		Select select =new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByValue("option2");
		
		//testing checkboxes
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(1000);
		
		//uncheck checkboxes 
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(1000);
		
		
		// Switch Window 
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(6000);
		
	
		
		//switch tab
		//driver.findElement(By.id("opentab")).click();
		//it can be done through xpath as well
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(4000);
		
		//switching to the main window handle
		driver. switchTo(). window("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		
		 
		 
		 
	}

}
