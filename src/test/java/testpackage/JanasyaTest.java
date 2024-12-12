package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClassJanasya;
import pagepackage.JanasyaProgram;

public class JanasyaTest extends BaseClassJanasya {
	
	@Test
	public void janasyaTest()
	{
	JanasyaProgram ob=new JanasyaProgram(driver);
	ob.newClick();
	ob.productClick();
	ob.wishClick();
	ob.addToCart();
	}

}
