package com.w2a.testcase.newStudentApply;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class studentAccountCreation {
	
	public	class StudentAccount extends TestBase {
		Properties properties;
			@Test
			public void Accountcreation () throws InterruptedException  {
				
				//log.debug("Log in page Executed");
				
				click("studentsApplyBtn_XPATH");
				Thread.sleep(3000);
				
				driver.findElement(By.name(OR.getProperty("firstNameField_CLASSNAME"))).sendKeys(OR.getProperty("firstName_TEXT"));
				
				driver.findElement(By.xpath(OR.getProperty("otherNamesField_XPATH"))).sendKeys(OR.getProperty("otherNames_TEXT"));
				
				driver.findElement(By.name(OR.getProperty("surnameField_CLASSNAME"))).sendKeys(OR.getProperty("surname_TEXT"));
				
				driver.findElement(By.xpath(OR.getProperty("emailField_XPATH"))).sendKeys(OR.getProperty("email_TEXT"));
				
				driver.findElement(By.name(OR.getProperty("mobileNumber_CLASSNAME"))).sendKeys(OR.getProperty("mobileDIgit_TEXT"));
				
				click("genderField_XPATH");	
				click("maleSelected_XPATH");	
				
				
				driver.findElement(By.xpath(OR.getProperty("DoBField_XPATH"))).sendKeys(OR.getProperty("DoBDigit_TEXT"));
				
				click("maritalStatusField_XPATH");	
				click("singleSelected_XPATH");	
				
				
				driver.findElement(By.name(OR.getProperty("passwordField_CLASSNAME"))).sendKeys(OR.getProperty("passwordField_TEXT"));
				
				driver.findElement(By.name(OR.getProperty("confirmPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("confirmPassword_TEXT"));
				
				click("applyButton_XPATH");	
				Thread.sleep(2000);
				
				click("okaySubmitFormBtn_XPATH");	
				Thread.sleep(4000);

			}
		}

	}


