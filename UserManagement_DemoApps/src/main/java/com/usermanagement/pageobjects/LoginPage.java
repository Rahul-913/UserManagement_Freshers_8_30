package com.usermanagement.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
public class LoginPage {
	private WebDriver driver;
	final private By usnTf = By.id("username");
	final private By pswTf = By.id("password");
	final private By loginBtn = By.id("button-login-submit");
	final private By createLink = By.id("link-login-to-register");
	final private By userManagementText = By.id("heading-home");
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void checkCreateLink() {
		if (driver.findElement(createLink).isDisplayed()) {
			Reporter.log("Create account link is Displayed", true);
		} else {
			Reporter.log("Create account link is not Displayed", true);
		}
	}
	public boolean checkUsnTf() {
		return driver.findElement(usnTf).isDisplayed();
	}
	public boolean checkPswTf() {
		return driver.findElement(pswTf).isDisplayed();
	}
	public boolean checkLoginBtn() {
		return driver.findElement(loginBtn).isDisplayed();
	}
}
