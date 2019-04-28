package com.w2a.testcase.admin;

	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	import com.w2a.base.TestBase;

		public	class manageFees extends TestBase {
			Properties properties;
				@Test
				public void ManageFees () throws InterruptedException  {
				
					click("currentStudentReg_XPATH");
					Thread.sleep(2000);
					driver.findElement(By.name(OR.getProperty("emailField_CLASSNAME"))).sendKeys(OR.getProperty("emailField_TEXT"));
					driver.findElement(By.name(OR.getProperty("passwordField_CLASSNAME"))).sendKeys(OR.getProperty("passwordField_TEXT"));
				    click("logInBtn_XPATH");	
				    Thread.sleep(3000);
				    
				    click("feesBtn_XPATH");
				    click("manageFeeBtn_XPATH");
				    click("switchTocreateModeBtn_XPATH");
				    click("FeeBox_XPATH");
				    click("admissionFeeOption_XPATH");
				    click("programmeField_XPATH");
				    click("postGradauteDegree_XPATH");
				    click("specialization_XPATH");
				    click("physicalHealthEdu_XPATH");
				    click("semester_XPATH");
				    click("firstSemester_XPATH");
				    click("levelFieldDD_XPATH");
				    click("levelOptionField_XPATH");
				    click("categoryField_XPATH");
				    click("freshOption_XPATH");
				    driver.findElement(By.id(OR.getProperty("amountBox_ID"))).sendKeys(OR.getProperty("amountBox_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("ntiBox_XPATH"))).sendKeys(OR.getProperty("ntiBox_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("omniswiftBox_XPATH"))).sendKeys(OR.getProperty("omniswiftField_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("installment1Box_XPATH"))).sendKeys(OR.getProperty("installment1Box_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("installment2Box_XPATH"))).sendKeys(OR.getProperty("installment2Box_TEXT"));
				    driver.findElement(By.xpath(OR.getProperty("descriptionField_XPATH"))).sendKeys(OR.getProperty("descriptionField_TEXT"));
				    Thread.sleep(2000);
				    click("saveBtn_XPATH");
				    Thread.sleep(4000);
				   

				    
				    
				}

}

