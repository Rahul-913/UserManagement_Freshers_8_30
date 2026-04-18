package com.usermanagement.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.usermanagement.base.BaseTest;

public class LoginTest extends BaseTest{
	@Test
	public void validLogin() {
		loginpg.checkCreateLink();
		boolean checkUsnTf = loginpg.checkUsnTf();
		Assert.assertTrue(checkUsnTf);
		Reporter.log("checkUsnTf Tc is pass",true);
		boolean checkPswTf = loginpg.checkPswTf();
		Assert.assertTrue(checkPswTf);
		Reporter.log("checkPswTf Tc is pass",true);
		boolean checkLoginBtn = loginpg.checkLoginBtn();
		Assert.assertTrue(checkLoginBtn);
		Reporter.log("checkLoginBtn Tc is pass",true);
		
	}
}
