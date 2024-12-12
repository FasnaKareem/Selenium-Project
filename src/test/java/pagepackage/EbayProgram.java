package pagepackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayProgram {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	WebElement searchField;
	

	@FindBy(xpath="//*[@id=\"gh-btn\"]")
	WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"item36e31106a4\"]/div/div[1]/div/a/div/img")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"atcBtn_btn_1\"]")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@id=\"gh-ug-flex\"]/a")
	WebElement register;
	
	public EbayProgram( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchField()
	{
		searchField.sendKeys("toys");
	}
	
	public void searchButton() {
		searchBtn.click();
	}
	

	public void windowHandle()
	{
		String parentWindow=driver.getWindowHandle();
		product.click();
		
		Set <String> allWindows=driver.getWindowHandles();
		for(String handle:allWindows)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				addToCart.click();
				driver.close();
			}
			
			driver.switchTo().window(parentWindow);
			driver.navigate().to("https://www.ebay.com/");
		}
	}
	
	public void regClick()
	{
		register.click();
	}

}
