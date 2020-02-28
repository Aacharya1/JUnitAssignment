package Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	
	@Test
	public void AllToggleChecked() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/107/");
		WebElement AllToggleChecked = driver.findElement(By.name("allbox"));
		AllToggleChecked.click();
//		boolean All_CheckedBox_Checked = AllToggleChecked.isDisplayed();
//		Assert.assertTrue("ToggleAll checkbox isnot checked", All_CheckedBox_Checked);
	}
		
	@Test
	public void CheckedboxCouldBeRemoved() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/107/");
		WebElement AlltoggleRemoved = driver.findElement(By.xpath("//input[@value='Remove']"));
		AlltoggleRemoved.click();
	}
	@Test	
	public void ToggleAllRemoved() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/107/");
		driver.findElement(By.name("allbox")).click();
		driver.findElement(By.xpath("//input[@value='Remove']"));
		
	}
//		TOGGLE_ALL_CHECKED_BOX.click();
//		boolean TOOGLE_ALL_CHECKBOX_IS_CHECKED = TOGGLE_ALL_CHECKED_BOX.isSelected();
//
//		Assert.assertTrue("Toogle checkbox didnot check !!", TOOGLE_ALL_CHECKBOX_IS_CHECKED);

		//driver.close();
		//driver.quit();
	}

	


