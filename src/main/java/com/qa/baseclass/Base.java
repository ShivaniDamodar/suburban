package com.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Base()
	{
		try {
		prop = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\Shivani\\eclipse-workspace\\SuburbanDignostic\\src\\main\\java\\com\\qa\\config\\config.properties");
			 
		try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static void initialization()
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SHIVANI\\chromedriver_win32_3\\chromedriver.exe");
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.suburbandiagnostics.com/Account/Login/2");
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		
		
		
	}
	 

}
