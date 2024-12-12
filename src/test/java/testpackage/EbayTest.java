package testpackage;

import org.testng.annotations.Test;

import basepackage.EbayBase;
import pagepackage.EbayProgram;

public class EbayTest  extends EbayBase{
	
	@Test
	
	public void testEbay()
	{
	EbayProgram ob=new EbayProgram(driver);
	ob.searchField();
	ob.searchButton();
	ob.windowHandle();
	ob.regClick();
	
	}
	

}
