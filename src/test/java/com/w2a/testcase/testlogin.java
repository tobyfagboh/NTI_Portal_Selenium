package com.w2a.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class testlogin extends TestBase {

	@Test
	public void loginAsAdnin() throws InterruptedException, IOException {
		
		//verifyEquals("abcd", "xyz");
		Thread.sleep(3000);
		log.debug("Log in page Executed");
		driver.findElement(By.id(OR.getProperty("emailId"))).sendKeys(OR.getProperty("userEmail"));
		driver.findElement(By.id(OR.getProperty("passwordId"))).sendKeys(OR.getProperty("userPassword"));
		Thread.sleep(3000);
		click("signInBtn_XPATH");		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("userManagementTxtXpath"))), "Unable to validate Homepage");
		Thread.sleep(3000);
		log.debug("Log in successfully executed");
		//Assert.fail("Login not successful");
	}
}
