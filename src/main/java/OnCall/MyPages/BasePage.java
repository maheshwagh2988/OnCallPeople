package OnCall.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends AbstractOnCallPage{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
	
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try{
			element=driver.findElement(locator);
			return element;
					
		}catch(Exception e){
			System.out.println("Some Error Occured while creating elemening"+locator.toString());
			System.out.println(e.getMessage());
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
		try{
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		}catch(Exception e){
			System.out.println("Some exception Occured while wait for elemennt"+locator.toString());
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void waitForPageTile(String title) {
		try{
			wait.until(ExpectedConditions.titleContains(title));
		}catch(Exception e){
			System.out.println("Some exception Occured while Print Title "+title);
			System.out.println(e.getMessage());
		}
		
	}

}