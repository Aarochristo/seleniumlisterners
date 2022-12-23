package TestNgpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TestoneTest {
	
	WebDriver driver;
	
	long time;
	long endtime;
	long fulltime;
	
	
	
	
  @Test(successPercentage = 90)
  public void openUrl() {
	  
	  

		driver.navigate().to("https://www.tcs.com/");
		
		driver.quit();
	  
	  
	  System.out.println("successPercentage");
	  
	  endtime = System.currentTimeMillis();	
	  System.out.println(endtime);
	  
	  
	  
  }
  
  
  
  @BeforeSuite
  void beforeeRun()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\chromedriver.exe");
	  
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		time = System.currentTimeMillis();	  
		  System.out.println(time);
  }
  
}
