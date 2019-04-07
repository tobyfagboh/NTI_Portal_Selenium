package com.w2a.testcase.admin;
import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;


public class createScholarship extends TestBase {
	Properties properties;
	@Test
	public void CreateScholarship () throws InterruptedException {

		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		
		driver.findElement(By.name(OR.getProperty("emailFieldScholarship_CLASSNAME"))).sendKeys(OR.getProperty("emailFieldScholarship_TEXT"));	
		driver.findElement(By.name(OR.getProperty("passwordFieldScholarship_CLASSNAME"))).sendKeys(OR.getProperty("passwordFieldScholarship_TEXT"));
		
	    click("logInBtn_XPATH");	
	    Thread.sleep(3000);
	    
	    click("scholarshipBtn_XPATH");
	    Thread.sleep(2000);
	    
	    click("createScholarshipBtn_XPATH");
	    Thread.sleep(2000);
	    
	    click("scholarshipType_XPATH");
	    click("studentSelected_XPATH");
	    
	    driver.findElement(By.id(OR.getProperty("titleField_ID"))).sendKeys(OR.getProperty("titleField_TEXT"));	
		driver.findElement(By.id(OR.getProperty("payerNameField_ID"))).sendKeys(OR.getProperty("payerName_TEXT"));
	    driver.findElement(By.xpath(OR.getProperty("payerEmail_XPATH"))).sendKeys(OR.getProperty("payerEmail_TEXT"));	
		driver.findElement(By.name(OR.getProperty("payerPhone_CLASSNAME"))).sendKeys(OR.getProperty("payerPhone_TEXT"));
		
		click("selectFeeType_XPATH");
		click("selectedType_XPATH");
		
		click("semesterField_XPATH");
		click("selectedSemester_XPATH");
		
		driver.findElement(By.xpath(OR.getProperty("noOfBeneficiary_XPATH"))).sendKeys(OR.getProperty("beneficiary_TEXT"));	
		driver.findElement(By.id(OR.getProperty("amount_ID"))).sendKeys(OR.getProperty("amount_TEXT"));
		driver.findElement(By.id(OR.getProperty("description_ID"))).sendKeys(OR.getProperty("description_TEXT"));
	
		click("saveBtn_ID");
		
	}
}
	
