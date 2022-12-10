package TestNgpractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class havetolistern {
	
	
	
	
	
	@Test(priority = 2)
	
	  public void testngbrowse() { System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\aaron\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
	  
	  long start=System.currentTimeMillis();
	  driver.get("https://www.google.co.in");
	  driver.close();
	  
	  
	  
	  }
	 
	
	@Test(priority = 1)
	
	public void fluent()
	{
		
		
		 
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\aaron\\chromedriver.exe");
		 WebDriver driver;
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.neeyamo.com/");
		 
		 
		 WebElement pop=driver.findElement(By.id("hs-eu-close-button"));
		 pop.click();
		 
		Wait<WebDriver>waits=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(7));
				
		
		
		
		
		
		
		
		
		WebElement clics=waits.until(new Function<WebDriver, WebElement>()
		{

			
			public WebElement apply(WebDriver driver)
			{
				
				return driver.findElement(By.xpath("//a[@id='sidebarmenu']"));
				
				
				
			
			}
		});
		
		
		clics.click();
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement po=driver.findElement(By.xpath("//input[@type='search']"));
		 po.sendKeys("aaron");
		 driver.close();
		
	}
	
	@Test(priority = 0)
	
	public void explic() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aaron\\chromedriver.exe");
	 WebDriver  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.infosys.com/");
	 
	 WebDriverWait wai=(WebDriverWait) new WebDriverWait(driver,Duration.ofSeconds(4));
	 
	 WebElement info=wai.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='burger']")));
	 
	 info.click();
	 
	 
WebElement infofis=wai.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='burger open']")));
			 infofis.click();
			 driver.quit();
			 
	}
	
	
	
	
	
	
	
	
}
