package com.w2a.testcase.admin;

	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	import com.w2a.base.TestBase;

		public	class discontinuedCourses extends TestBase {
			Properties properties;
				@Test
				public void DiscontinuedCourses () throws InterruptedException  {
				
					click("currentStudentReg_XPATH");
					Thread.sleep(2000);
					driver.findElement(By.name(OR.getProperty("emailField_CLASSNAME"))).sendKeys(OR.getProperty("emailField_TEXT"));
					driver.findElement(By.name(OR.getProperty("passwordField_CLASSNAME"))).sendKeys(OR.getProperty("passwordField_TEXT"));
				    click("logInBtn_XPATH");	
				    Thread.sleep(3000);
				    
				    click("coursesBtn_XPATH");
				    click("discontinuedCoursesBtn_XPATH");
				    Thread.sleep(2000);
				    
				}

}
