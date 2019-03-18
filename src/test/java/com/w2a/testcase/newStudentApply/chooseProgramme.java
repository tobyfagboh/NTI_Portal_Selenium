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
			
			click("programmeEntryLevelField");	
			click("100LevelSelected_XPATH");	
			
			click("1stChoiceCourse_XPATH");
			click("1stChoiceCourseSelected_XPATH");	
			
			click("2ndChoiceCourse_XPATH");	
			click("2ndChoiceCourseSelected_XPATH");	
			
			click("stateOfResidence_XPATH");	
			click("selectedStateOfResidence_XPATH");	
			Thread.sleep(3000);
			
			click("studyCentre_XPATH");	
			click("selectedStudyCentre_XPATH");	
			Thread.sleep(2000);
			
			click("continueBtnXpath_XPATH");
			Thread.sleep(3000);
			
			click("payBtn_XPATH");
			Thread.sleep(4000);
			
		}
	}


