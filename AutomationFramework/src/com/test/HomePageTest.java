package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomePageTest extends BaseTest {
	
	HomePage hp;
	
	
	@BeforeClass
	public void initialize()
	{
		hp = new HomePage(driver); 
	}

		@Test
		public void testCountsocialIcons()
		{
			int actual = hp.countSocialIcons();
			assertEquals(4,hp.countSocialIcons());
		
		}
		
		@Test
		public void testLoginClick()
		{
			String actual = hp.clickLogin();
			
			assertEquals("http://www.whiteboxqa.com/login.php", hp.clickLogin());
			
		}
		
		@AfterClass
		public void quit()
		{
			driver.quit();
		}
}
