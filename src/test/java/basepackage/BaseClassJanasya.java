package basepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class BaseClassJanasya {
	

	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		
			 driver=new ChromeDriver();
			 driver.get("https://janasya.com/");	
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 driver.switchTo().frame("iframe-kp");
			 WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"close\"]")));
			 closeButton.click();
			 driver.switchTo().defaultContent();
		 
		 
	}

}
