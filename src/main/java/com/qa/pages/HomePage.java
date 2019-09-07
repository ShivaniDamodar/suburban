package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.Base;

public class HomePage extends Base {
	
	@FindBy(xpath="//ul[@class='dashboard-zone-list']//following::li[2]//a//p[text()='Share Report']")
	WebElement ShareReportLink;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public ShareReports ClickOnShareReportIcon()
	{
		 ShareReportLink.click();
		 return new ShareReports();
	}
	
	
	

}
