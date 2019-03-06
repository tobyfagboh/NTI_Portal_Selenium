package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class student_login_1 extends TestBase {
	@Test
	public void Student_login () throws InterruptedException {
		
		log.debug("Log in page Executed");
		click("currentStudentReg_XPATH");
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("email_TEXT"));
		driver.findElement(By.className(OR.getProperty("password_NAME"))).sendKeys(OR.getProperty("password_TEXT"));
	
		click("signInBtn_XPATH");		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("adminDashboard_XPATH"))), "Unable to validate Homepage");
		
		log.debug("Log in successfully executed");
		
	}

}
