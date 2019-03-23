package com.w2a.testcase.currentStudent;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;


public class StudentRegistration extends TestBase {

	Properties properties;
	@Test
	public void Login () throws InterruptedException  {
    
		log.debug("Student Registration Executed");
		click("currentStudentReg_XPATH");
		driver.findElement(By.name(OR.getProperty("email_CLASSNAME"))).sendKeys(OR.getProperty("email_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("password_TEXT"));
		click("signInBtn_XPATH");
		click("courseRegistration_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Register_XPATH"))));
		log.debug("Log in successfully executed");
		
	}
}