package variousConcepts;

import java.util.concurrent.TimeUnit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
   
	WebDriver driver;
	
	@Before
	public void init() {
		
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver new.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
	
	@Test
	public void testLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		
		//link text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//for going back to page
		driver.navigate().back();
		
		//for PartialLink text
		//driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
		//css selector
		driver.findElement(By.cssSelector("input[ name= 'lastname']")).sendKeys("is fun");
		driver.findElement(By.cssSelector("input#exp-2")).click();
		
		//for hyperlink
		//driver.findElement(By.cssSelector("a[href$=\"http://techfios.com/api-prod/api/\"]")).click();
		
		
		//xPath
	    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("try it");
	    
	    
	   
		
	
	}
	
}
