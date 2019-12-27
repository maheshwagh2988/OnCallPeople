package OnCall.MyTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import OnCall.MyPages.HomePage;
import OnCall.MyPages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	 public void verifyLoginPageTitle(){
	String title=	page1.getInstance(LoginPage.class).getLoginPageTitle();
	System.out.println("title");
	Assert.assertEquals(title, "Dashboard");
	}
	
	@Test(priority=2)
	 public void verifyLoginPageheader(){
	String header=	page1.getInstance(LoginPage.class).getLoginPageHeader();
	System.out.println(header);
	Assert.assertEquals(header, "KEM Hospital");
	}
	
	@Test(priority=3)
	public void doLoingTest(){
		HomePage homepage=page1.getInstance(LoginPage.class).doLogin("kemhospital", "P@ssw0rd");
		String afterloginheader1=homepage.getLoginPageHeader();
		Assert.assertEquals(afterloginheader1, "KEM Hospital");
		String afterloginheader2=homepage.getLoginPageLogo();
		Assert.assertEquals(afterloginheader2, "logo-lg");
	}
	
	

}
