package com.qa.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.baseclass.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ShareReports;
import com.qa.utilities.Utility;

public class ShareReportTest extends Base{

	LoginPage loginpage;
	HomePage homepage;
	ShareReports sharereports;
	String sheetName = "consultingPractitionerClinic";
	public ShareReportTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.loginPage(prop.getProperty("userid"), prop.getProperty("password"));
		sharereports = homepage.ClickOnShareReportIcon();
		
	}
	
	
	
	@DataProvider
	 
	public Object[][] getSuburbanTestData(){
		Object data[][] = Utility.getTestData(sheetName);
		return data;
	}
	
	
	
	@Test(priority=1)
	public void verifyShareReportTitleTest()
	{
	sharereports.verifyShareReportTitle();
	}
	
	
	
	@Test(priority=2, dataProvider="getSuburbanTestData")
	public void ConsultingPractionerClinicShareReportTest(String doctorName, String area, String pinCode, String emailid, String mobileNumber)
	{
		
		sharereports.clickOnCheckbox();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sharereports.ConsultingPractionerClinicShareReport(doctorName, area, pinCode, emailid, mobileNumber);
		
	}
	
	
	@AfterMethod
	 public void tearDown()
	 {
		driver.quit();
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
