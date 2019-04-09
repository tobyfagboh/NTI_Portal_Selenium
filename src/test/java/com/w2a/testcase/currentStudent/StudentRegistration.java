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
		//Thread.sleep(3000);
		driver.findElement(By.name(OR.getProperty("studentemail_CLASSNAME"))).sendKeys(OR.getProperty("studentemail_TEXT"));
		//Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("studentpassword_XPATH"))).sendKeys(OR.getProperty("studentpassword_TEXT"));
		//Thread.sleep(3000);
		click("signInBtn_XPATH");
		click("courseRegistration_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Register_XPATH"))));
		log.debug("Log in successfully executed");
		
	}
}