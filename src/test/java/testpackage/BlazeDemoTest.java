package testpackage;

import org.testng.annotations.Test;

import basepackage.BlazeDemoBase;
import pagepackage.BlazeDemoProgram;

public class BlazeDemoTest extends BlazeDemoBase{
	
	@Test
	
	public void blazeDemoTest()
	{
		BlazeDemoProgram ob=new BlazeDemoProgram(driver);
		ob.nameField();
		ob.cmpnyField();
		ob.emailField();
		ob.passwrdField();
		ob.confirmPassField();
		ob.registerBtn();
		driver.get("https://blazedemo.com/login");
		ob.emailLogin();
		ob.passWrdLog();
		ob.LoginBtn();
		
	}

}
