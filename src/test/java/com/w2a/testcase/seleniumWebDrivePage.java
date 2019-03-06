package com.w2a.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class seleniumWebDrivePage extends TestBase{
	
	@Test
	public void SeleniumWebDriver() throws InterruptedException, IOException {
		
		//verifyEquals("abcd", "xyz");
		//Thread.sleep(3000);
		Thread.sleep(5000);
		log.debug("Compendiumdev page Launched");
		click("eTrainingBtn_XPATH");	
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		click("SeleniumWebDriverHeading_LINKTEXT");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("SeleniumWebDriverHeading_XPATH"))), "Unable to validate Homepage");
		Thread.sleep(3000);
		log.debug("Selenium WebDriver with Java - Online Training Course is Present");
	
	}

}
