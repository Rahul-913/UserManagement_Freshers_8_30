package com.usermanagement.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.usermanagement.browserfactory.BrowserManager;
import com.usermanagement.pageobjects.LoginPage;

public class BaseTest {
	protected LoginPage loginpg;
	protected WebDriver driver;
	@BeforeClass
	public void precondition() {
		BrowserManager manager = new BrowserManager();
		 driver = manager.initDriver("chrome");
		driver.get("https://demoapps.qspiders.com/user-management/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpg = new LoginPage(driver);
	}
	
	@AfterClass
	public void postcondition() {
		driver.quit();
	}
	
	
}
