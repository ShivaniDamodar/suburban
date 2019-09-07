package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.Base;

public class LoginPage extends Base{
	
	
	
	@FindBy(xpath="//input[@class='k-textbox dashboardinput'][@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@class='k-textbox dashboardinput'][@id='Password']")
	WebElement password;
	
	
	@FindBy(xpath="//button[@class='k-primary btn-margin k-button dashboard_btn'][@id='btnLogIn3']")
	WebElement btnlogin;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void verifyLoginPageTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	
	public HomePage loginPage(String usrnm, String pswd)
	{
		username.sendKeys(usrnm);
		password.sendKeys(pswd);
		btnlogin.click();
		return new HomePage();
	
	}
	
	
	
	
}
