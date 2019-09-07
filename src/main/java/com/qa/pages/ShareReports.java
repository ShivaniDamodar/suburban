package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.Base;

public class ShareReports extends Base{
	
	
	@FindBy(xpath="//input[@type='checkbox'][@id='chkCP_Clinic']")
	WebElement checkboxConsultingPraClinic;
	
	@FindBy(xpath="//input[@id='CPClinicDoctorName']")
	WebElement DoctorName;
	
	
	@FindBy(xpath="//input[@id='CPClinicDoctorArea']")
	WebElement DoctorArea;
	
	@FindBy(xpath="//input[@id='CPClinicDoctorPin']")
	WebElement PinCode;
	
	@FindBy(xpath="//input[@id='CPClinicDoctorEmail']")
	WebElement EmailId;
	
	@FindBy(xpath="//input[@id='CPClinicDoctorMobile']")
	WebElement MobileNo;
	
	@FindBy(xpath="//button[@id='btnShare']")
	WebElement ShareBtn;
	
	
	public ShareReports()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	public void verifyShareReportTitle()
	{ 
		String ShareReportsTitle = driver.getTitle();
		System.out.println(ShareReportsTitle);
	
	}
	
	public void clickOnCheckbox()
	{
		checkboxConsultingPraClinic.click();
	
	}
	
	
	public void ConsultingPractionerClinicShareReport(String name, String area, String pin, String email, String no)
	{
		
		DoctorName.sendKeys(name);
		DoctorArea.sendKeys(area);
		PinCode.sendKeys(pin);
		EmailId.sendKeys(email);
		MobileNo.sendKeys(no);
		
		ShareBtn.click();
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } Alert alert =
		 * driver.switchTo().alert(); String alertText = alert.getText();
		 * System.out.println(alertText); alert.accept();
		 */
	}
	
	
	
	
	
	
	
	

}
