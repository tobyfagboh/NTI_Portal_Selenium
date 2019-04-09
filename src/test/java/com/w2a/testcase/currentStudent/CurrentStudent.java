package com.w2a.testcase.currentStudent;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class CurrentStudent extends TestBase {
	Properties properties;
	
	@Test (priority=2)
	public void invalidLogin () throws InterruptedException  {
		
		log.debug("Invalid Log in page Executed");
		click("currentStudentReg_XPATH");
		driver.findElement(By.name(OR.getProperty("studentemail_CLASSNAME"))).sendKeys(OR.getProperty("studentinvalidemail_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("studentpassword_XPATH"))).sendKeys(OR.getProperty("studentinvalidpassword_TEXT"));
		click("signInBtn_XPATH");		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("studentDashboard_XPATH"))), "Unable to validate Homepage");
		log.debug("Invalid Log in successfully executed");
		driver.quit();
	}
	@Test (priority=1)
	public void validLogin () throws InterruptedException {
		
		log.debug("Log in page Executed");
		click("currentStudentReg_XPATH");
		driver.findElement(By.name(OR.getProperty("studentemail_CLASSNAME"))).sendKeys(OR.getProperty("studentemail_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("studentpassword_XPATH"))).sendKeys(OR.getProperty("studentpassword_TEXT"));
		click("signInBtn_XPATH");	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		@SuppressWarnings("unused")
		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dash-icon")));
		
	
		click("courseRegistration_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Register_XPATH"))));
		String urlToNavigate = "https://ntiportaldemo.azurewebsites.net/students";
		driver.navigate().to(urlToNavigate);
		driver.navigate().back();
		
		click("ExamGrade_XPATH");	
		driver.navigate().back();
		
		click("ExamGrade_XPATH");
		driver.navigate().back();
		
		click("profilePicture_XPATH");
		click("logout_XPATH");	
		driver.quit();
	}
}
