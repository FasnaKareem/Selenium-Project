package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JanasyaProgram {
	

	WebDriver driver;
    @FindBy(xpath = "//*[@id=\"shopify-section-sections--16443441807530__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary")
    WebElement newitem;
    
    @FindBy(xpath="//*[@id=\"product-list-template--16443445608618__main\"]/product-card[1]/div[1]/a/img")
    WebElement product;
	
    @FindBy(xpath="//*[@id=\"shopify-block-wishlist_engine_product_page_bgTNAV\"]/div/div/span[1]")
    WebElement wishlistClick;
    
    @FindBy(xpath="//*[@id=\"product-form-8045664338090-template--16443446460586__main\"]/div/buy-buttons/button")
    WebElement addCart;
    
	public  JanasyaProgram(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void newClick()
	{
		newitem.click();
	}
	
	public void productClick()
	{
		product.click();
	}
	
	public void wishClick()
	{
		wishlistClick.click();
	}
	
	public void addToCart()
	{
		addCart.click();
	}

}
