package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckEmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/nisrine/Desktop/selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		/*
		 * tagName a
			attribute= class
			value = 'login'
			
		 * 
		 * syntax of xpath
  			("//tagName[@attribute='value']");*/
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("nisrine@dispostable.com");
		
		/*
		 syntax of ccSelector
		  tagName([attribute='value'])  
		  
		  the attribute is the id 
		*/
		//driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	}

}
