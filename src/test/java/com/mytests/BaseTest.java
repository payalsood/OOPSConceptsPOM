package com.mytests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

public class BaseTest {
	
	WebDriver driver;
	Page page;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser){
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		else{
			System.out.println("no browser found");
		}
		
		driver.get("https://app.hubspot.com/login");
		
		page = new BasePage(driver);
		
	}
	

}
