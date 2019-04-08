package com.w2a.testcase.admin;
import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;


public class approveApplicant  extends TestBase  {
	Properties properties;
	@Test
	public void ApproveApplicant () throws InterruptedException {
		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		
	    driver.findElement(By.name(OR.getProperty("emailFieldApprove_CLASSNAME"))).sendKeys(OR.getProperty("emailFieldApprove_TEXT"));	
		driver.findElement(By.name(OR.getProperty("passwordFieldApprove_CLASSNAME"))).sendKeys(OR.getProperty("passwordFieldApprove_TEXT"));
		click("logInBtn_XPATH");
		Thread.sleep(2000);
		
		click("applicantBtn_XPATH");
		click("waitingListLink_XPATH");
		
		click("filter_XPATH");
		click("selectProgramme_XPATH");
		Thread.sleep(2000);
		
		click("reviewLink_XPATH");
		Thread.sleep(2000);
		
		click("saveBtn_XPATH");
		Thread.sleep(3000);
	}
}
	



