package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class LoginPage extends BasePage {
	 
	public LoginPage(PageDriver driver)
	{
		super(driver);
		driver.findElement(By.cssSelector(Locators.loc.get("header-login-link"))).click();


	}
	
	public String invalidLogin(String uName,String pwd)
	{	
		
		String error = null;
		
		driver.maximize();
		driver.findElement(By.cssSelector(Locators.loc.get("login-username"))).clear();
		driver.findElement(By.cssSelector(Locators.loc.get("login-password"))).clear();
		driver.findElement(By.cssSelector(Locators.loc.get("login-username"))).sendKeys(uName);
		driver.findElement(By.cssSelector(Locators.loc.get("login-password"))).sendKeys(pwd);
		driver.findElement(By.cssSelector(Locators.loc.get("login-submit"))).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		error = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/article/h6")).getText();

		return error;
	}
	
}
