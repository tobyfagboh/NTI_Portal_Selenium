package com.w2a.testcase.admin;

	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	import com.w2a.base.TestBase;

		public	class createFeeAssignment extends TestBase {
			Properties properties;
				@Test
				public void CreateFeeAssignment () throws InterruptedException  {
				
					click("currentStudentReg_XPATH");
					Thread.sleep(2000);
					driver.findElement(By.name(OR.getProperty("emailField_CLASSNAME"))).sendKeys(OR.getProperty("emailField_TEXT"));
					driver.findElement(By.name(OR.getProperty("passwordField_CLASSNAME"))).sendKeys(OR.getProperty("passwordField_TEXT"));
				    click("logInBtn_XPATH");	
				    Thread.sleep(3000);
				    
				    click("feesBtn_XPATH");
				    click("feeAssignmentBtn_XPATH");
				    click("createFeeAssignmentBtn_XPATH");
				    click("forField_XPATH");
				    click("studentOption_XPATH");
				    driver.findElement(By.xpath(OR.getProperty("valueField_XPATH"))).sendKeys(OR.getProperty("valueField_TEXT"));
				    click("semesterField_XPATH");
				    click("currentSemsesterOption_XPATH");
				    click("feeField_XPATH");
				    click("tuitionFeeOption_XPATH");
				    click("levelField_XPATH");
				    click("level2Option_XPATH");
				    click("natureField_XPATH");
				    click("addOption_XPATH");
				    driver.findElement(By.id(OR.getProperty("amountField_ID"))).sendKeys(OR.getProperty("amountField_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("ntiField_XPATH"))).sendKeys(OR.getProperty("ntiField_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("omniswiftField_XPATH"))).sendKeys(OR.getProperty("omniswiftField_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("installment1Field_XPATH"))).sendKeys(OR.getProperty("installment1Field_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("installment2Field_XPATH"))).sendKeys(OR.getProperty("installment2Field_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("descriptionField_XPATH"))).sendKeys(OR.getProperty("descriptionField_TEXT"));
				    click("saveBtn_XPATH");
				    
				    Thread.sleep(3000);
				    
				}

}
















