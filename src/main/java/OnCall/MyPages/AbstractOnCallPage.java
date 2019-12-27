package OnCall.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractOnCallPage {
	WebDriver driver;
	WebDriverWait wait;
	/* WE can create a Construcot of Abstract Class
	 * */
	public AbstractOnCallPage(WebDriver driver){
		this.driver=driver;
		this.wait= new WebDriverWait(this.driver, 15);
	}
	
	//Abstract Method without Body
	public abstract String getPageTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement(By locator);
	public abstract void  waitForElementPresent(By locator);
	public abstract void  waitForPageTile(String title);
	
	public<TPage extends BasePage>TPage getInstance(Class<TPage> AbstractOnCallPage) {
		
		try{
		return AbstractOnCallPage.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
		
	}

}
