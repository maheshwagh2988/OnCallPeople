package OnCall.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	private By dashboard=By.xpath("//p[@class='user_name']"); //KEM Hospital
	//OR
	private By Dash1=By.className("user_name");////KEM Hospital
	
	private By OCPLogo=By.xpath("//span[@class='logo-lg']");
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebElement getDashboard() {
		return getElement(dashboard) ;
	}
	/**
	 * @return the dash1
	 */
	public WebElement getDash1() {
		return getElement(Dash1);
	}
	/**
	 * @return the oCPLogo
	 */
	public WebElement getOCPLogo() {
		return getElement(OCPLogo);
	}
	public WebElement getNameOFHospital() {
		return getElement(dashboard);
	}
		
	public String getLoginPageTitle(){
	return getPageTitle();
	}
	
	public String getLoginPageHeader(){
	return getPageHeader(dashboard);
	}
	
	public String getLoginPageLogo(){
		return getPageHeader(OCPLogo);
		}
}
