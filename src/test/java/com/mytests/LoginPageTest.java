package com.mytests;

import java.lang.reflect.InvocationTargetException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyPageTitleTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		String title = page.getInstance(LoginPage.class).getPageTitle();
		System.out.println("Title is found");
		Assert.assertEquals(title, "HubSpot");
	}
	
	@Test(priority = 2)
	public void loginTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		page.getInstance(LoginPage.class).doLogin("payalsood65@gmail.com", "Test@123");
		System.out.println("logged in successfully");
		
	}

}
