package com.base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

public abstract class BaseTest {
	
	public static final Configuration _config;
	
	static
	{
		_config = new Configuration();
	}
	
	
	public PageDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new PageDriver(_config);
				Locators.getElements();
	}
	
	
}
