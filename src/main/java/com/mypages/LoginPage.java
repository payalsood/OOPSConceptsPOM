package com.mypages;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	private By emailid = By.id("username");
	private By password = By.id("password");
	private By loginbutton = By.id("loginBtn");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//getters 
	
	public WebElement getEmailid() {
		return getElement(emailid);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	

	public WebElement getLoginbutton() {
		return getElement(loginbutton);
	}
	
	public String pageTitle(){
		return getPageTitle();
	}
	
	public HomePage doLogin(String username, String pwd) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		getEmailid().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginbutton().click();
		
		return getInstance(HomePage.class);
	}
	
	public void doLogin(){
		getEmailid().sendKeys("");
		getPassword().sendKeys("");
		getLoginbutton().click();
		
		
	}
	
	public void doLogin(String username){
		getEmailid().sendKeys(username);
		getPassword().sendKeys("");
		getLoginbutton().click();
		
		
	}
	
	


}
