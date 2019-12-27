package OnCall.MyTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import OnCall.MyPages.AbstractOnCallPage;
import OnCall.MyPages.BasePage;

public class BaseTest {
	
	WebDriver driver;
	public AbstractOnCallPage page1;
	
	@BeforeMethod
	@Parameters(value={"browser"})
	public void setupTest(String browser) throws Exception{
			if(browser.equals("chrome")){
				WebDriverManager.chromedriver().clearPreferences();
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browser.equals("firofox")){
				
				WebDriverManager.iedriver().setup();
				WebDriverManager.iedriver().clearPreferences();
				driver = new InternetExplorerDriver();
				/*
				WebDriverManager.firefoxdriver().clearPreferences();
				WebDriverManager.firefoxdriver().version("50.0").setup();
				driver=new FirefoxDriver();*/
				
				
			} else{
				System.out.println("no browser define in xml files");
			}
			
			driver.manage().window().maximize();
			driver.get("https://kemhospital.oncallpeople.com");
			
			Thread.sleep(6000);
			page1=new BasePage(driver);
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
