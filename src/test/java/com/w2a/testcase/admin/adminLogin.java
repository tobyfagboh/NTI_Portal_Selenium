package com.w2a.testcase.admin;
	import java.util.Properties;

	import org.openqa.selenium.By;
import org.testng.annotations.Test;

	import com.w2a.base.TestBase;

		
		public	class adminLogin extends TestBase {
			Properties properties;
				@Test
				public void AdminLogin () throws InterruptedException  {
					
					click("currentStudentReg_XPATH");
					Thread.sleep(2000);
					driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
					driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
				    click("logInBtn_XPATH");	
				    Thread.sleep(2000);
				    click("profileName_XPATH");
				    click("adminLogOut_XPATH");
				    driver.quit();
				}
		}
				
