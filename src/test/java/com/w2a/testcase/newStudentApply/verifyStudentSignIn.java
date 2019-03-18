package com.w2a.testcase.newStudentApply;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class verifyStudentSignIn {

	public class VerifyStudentSignIn extends TestBase {
		Properties properties;
		@Test
		public void Signin () throws InterruptedException  {
			
			//log.debug("Log in page Executed");
		//	Thread.sleep(3000);
			
			click("newStudentsApply_XPATH");
			
			
			click("continueApplicationBtn_XPATH");
		
			
			driver.findElement(By.name(OR.getProperty("emailAddressField_CLASSNAME"))).sendKeys(OR.getProperty("emailAddress_TEXT"));
			
			
			driver.findElement(By.xpath(OR.getProperty("passwordField_XPATH"))).sendKeys(OR.getProperty("studentPassword_TEXT"));
			Thread.sleep(3000);
			
			click("studentSignInBtn_XPATH");		
			
			//Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("adminDashboard_XPATH"))), "Unable to validate Homepage");
			
		//	log.debug("Log in successfully executed");
	

	}

}}
