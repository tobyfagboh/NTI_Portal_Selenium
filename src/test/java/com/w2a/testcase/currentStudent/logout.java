package com.w2a.testcase.currentStudent;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class logout extends TestBase {
	Properties properties;
	@Test
	public void Login () throws InterruptedException  {
		
		log.debug("Log in page Executed");
		click("currentStudentReg_XPATH");
		driver.findElement(By.name(OR.getProperty("email_CLASSNAME"))).sendKeys(OR.getProperty("email_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("password_TEXT"));
		click("signInBtn_XPATH");		
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("studentDashboard_XPATH"))), "Unable to validate Homepage");
		log.debug("Log in successfully executed");
		click("profilePicture_XPATH");
		click("logout_XPATH");		
	}
}
