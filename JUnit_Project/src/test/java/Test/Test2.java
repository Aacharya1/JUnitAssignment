package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	@Test
	
	public void CheckedboxCouldBeRemoved(){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://techfios.com/test/107/");
			
		
   }
}	


