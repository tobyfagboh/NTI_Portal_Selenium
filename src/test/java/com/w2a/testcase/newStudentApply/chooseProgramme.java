package com.w2a.testcase.newStudentApply;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

	public class chooseProgramme extends TestBase {
		Properties properties;
		@Test
		public void ChooseProgramme () throws InterruptedException  {
			
			click("selectProgrammeField_XPATH");
			click("bachelorsDegreeSelected_XPATH");	
			Thread.sleep(2000);
			
			click("programmeEntryLevelField");	
			click("100LevelSelected_XPATH");	
			Thread.sleep(2000);
			
			click("1stChoiceCourse_CLASSNAME");
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
		//	Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("adminDashboard_XPATH"))), "Unable to validate Homepage");
			
		//	log.debug("Log in successfully executed");
			
		}
	}


