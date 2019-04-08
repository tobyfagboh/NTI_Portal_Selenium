package com.w2a.testcase.newStudentApply;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;


	public	class payFees extends TestBase {
		Properties properties;
			@Test
			public void Payfees() throws InterruptedException  {
				
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
				
				click("selectProgrammeField_XPATH");
				click("bachelorsDegreeSelected_XPATH");	
				Thread.sleep(2000);
				
				click("programmeEntryLevelField");	
				click("100LevelSelected_XPATH");	
				Thread.sleep(2000);
				
				click("1stChoiceCourse_XPATH");
				click("1stChoiceCourseSelected_XPATH");	
				Thread.sleep(2000);
				
				click("2ndChoiceCourse_XPATH");	
				click("2ndChoiceCourseSelected_XPATH");	
				Thread.sleep(2000);
				
				click("stateOfResidence_XPATH");	
				click("selectedStateOfResidence_XPATH");	
				Thread.sleep(2000);
				
				click("studyCentre_XPATH");	
				click("selectedStudyCentre_XPATH");	
				Thread.sleep(2000);
				
				click("continueBtnXpath_XPATH");	
				
				click("payBtn_XPATH");
				Thread.sleep(3000);
				
				click("howDoYpuWantToPay_ID");
				click("card_XPATH");
				Thread.sleep(2000);
				
				driver.findElement(By.id(OR.getProperty("cardHolderName_ID"))).sendKeys(OR.getProperty("cardHolderName_TEXT"));
				driver.findElement(By.id(OR.getProperty("cardNumberField_ID"))).sendKeys(OR.getProperty("cardNumber_TEXT"));
				
				driver.findElement(By.xpath(OR.getProperty("expiryDate_XPATH"))).sendKeys(OR.getProperty("expiryDate_TEXT"));
				
				driver.findElement(By.xpath(OR.getProperty("cvvField_XPATH"))).sendKeys(OR.getProperty("cvv_TEXT"));
				
				click("submitBtn_XPATH");
				Thread.sleep(3000);
				
				driver.findElement(By.id(OR.getProperty("cardPin_ID"))).sendKeys(OR.getProperty("cardPin_TEXT"));
				click("payButton_XPATH");
				Thread.sleep(3000);
			
			}
		}

	


