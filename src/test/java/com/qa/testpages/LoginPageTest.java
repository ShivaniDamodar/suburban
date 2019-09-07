package com.qa.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends Base {
	HomePage homepage;
	LoginPage loginpage;
	public LoginPageTest()
	{
		super();
	}


@BeforeMethod
public void setup()
{
	initialization();
	loginpage = new LoginPage();
}

	


@Test
public void verifyLoginPageTitleTest()
{
	loginpage.verifyLoginPageTitle();
}




@Test
public void LoginTest()
{
	loginpage.loginPage(prop.getProperty("userid"), prop.getProperty("password"));
	
}


@AfterMethod
 public void tearDown()
 {
	driver.quit();
	
 }










}