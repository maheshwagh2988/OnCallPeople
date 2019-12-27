package OnCall.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	//Define page locator
	private By userName=By.id("dnn_ctr15761_SignIn_txtEmpolyeeId");
	private By password=By.id("dnn_ctr15761_SignIn_txtPassword");
	private By SingIn=By.id("dnn_ctr15761_SignIn_btnSignIn");
	private By NameOFHospital=By.id("imgLogo");
	public LoginPage(WebDriver driver) {
		super(driver);
		}
	//Public getters:
	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return getElement(userName);
	}
	
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}
	
	/**
	 * @return the singIn
	 */
	public WebElement getSingIn() {
		return getElement(SingIn);
	}

	/**
	 * @return the nameOFHospital
	 */
	public WebElement getNameOFHospital() {
		return getElement(NameOFHospital);
	}
	
	
	public String getLoginPageTitle(){
	return getPageTitle();
	}
	
	public String getLoginPageHeader(){
	return getPageHeader(NameOFHospital);
	}
	
	/**
	 * 
	 * @param uname
	 * @param pwd
	 * @return
	 */
	public HomePage doLogin(String uname ,String pwd){
		getUserName().sendKeys(uname);
		getPassword().sendKeys(pwd);
		getSingIn().click();
		
		return getInstance(HomePage.class);
		
	}
	/**
	 * method Overloading you can see two doLogin methods 
	 * @return
	 */
	public void  doLogin(){
		getUserName().sendKeys();
		getPassword().sendKeys();
		getSingIn().click();
	}
	
	//username: kemhospital
	public void  doLogin(String userCredt){
		if(userCredt.contains("username")){
			getUserName().sendKeys(userCredt.split(":")[1].trim());
		}else if(userCredt.contains("password")){
			getUserName().sendKeys(userCredt.split(":")[1].trim());
		}
		getSingIn().click();
	}
}