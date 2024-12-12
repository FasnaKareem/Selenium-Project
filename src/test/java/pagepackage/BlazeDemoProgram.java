package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoProgram {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement cmpy;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailAdd;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement passWrd;
	
	@FindBy(xpath="//*[@id=\"password-confirm\"]")
	WebElement confirmPass;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement regBtn;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailLog;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement passLog;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement logBtn;
	
	
	public  BlazeDemoProgram(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	
	public void nameField()
	{
		name.sendKeys("anu");
	}
	
	public void cmpnyField()
	{
		cmpy.sendKeys("IBM");
	}
	
	public void emailField()
	{
		emailAdd.sendKeys("sanu098@gmail.com");
	}
	
	public void passwrdField()
	{
		passWrd.sendKeys("Word@456");
	}
	
	public void confirmPassField() 
	{
		confirmPass.sendKeys("Word@456");
	}
	
	public void registerBtn()
	{
		regBtn.click();
	}
	
	public void emailLogin()
	{
		emailLog.sendKeys("sanu098@gmail.com");
	}
	
	public void passWrdLog()
	{
		passLog.sendKeys("Word@456");
	}
	
	public void LoginBtn()
	{
		logBtn.click();
	}
}
