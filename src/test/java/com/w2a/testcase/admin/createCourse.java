package com.w2a.testcase.admin;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

	public	class createCourse extends TestBase {
		Properties properties;
			@Test
			public void CreateCourse () throws InterruptedException  {
				
				click("currentStudentReg_XPATH");
				Thread.sleep(2000);
				driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
				driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
			    click("logInBtn_XPATH");	
			    Thread.sleep(2000);
			    click("createCourseBtn_XPATH");
			    click("createNewCoursesBtn_XPATH");
			    driver.findElement(By.id(OR.getProperty("courseCodeField_ID"))).sendKeys(OR.getProperty("courseCode_TEXT"));
                driver.findElement(By.id(OR.getProperty("courseTitleField_ID"))).sendKeys(OR.getProperty("courseTitle_TEXT"));
               // click("unit_XPATH");
                driver.findElement(By.xpath(OR.getProperty("unit_XPATH"))).sendKeys(OR.getProperty("unit_TEXT"));
                click("programmeField_XPATH");	
                click("bachelorDegree_XPATH");	
                click("specialization_XPATH");	
                click("computerScience_XPATH");	
                click("levelDropdown_XPATH");	
                click("level4_XPATH");	
                click("semester_XPATH");	
                click("secondSemester_XPATH");
                click("type_XPATH");
                click("compulsory_XPATH");
                click("status_XPATH");
                click("active_XPATH");
                click("createNewCourseBtn_XPATH");	
				
			
			}
}
	