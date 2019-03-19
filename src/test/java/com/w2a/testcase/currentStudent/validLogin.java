package com.w2a.testcase.currentStudent;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class validLogin extends TestBase {
	Properties properties;
	@Test
	public void Login () throws InterruptedException  {
		
		log.debug("Log in page Executed");
		//Thread.sleep(3000);
		click("currentStudentReg_XPATH");
		//Thread.sleep(3000);
		driver.findElement(By.name(OR.getProperty("email_CLASSNAME"))).sendKeys(OR.getProperty("email_TEXT"));
		//Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("password_TEXT"));
		//Thread.sleep(3000);
		click("signInBtn_XPATH");		
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("studentDashboard_XPATH"))), "Unable to validate Homepage");
		
		log.debug("Log in successfully executed");
		
	}
}
