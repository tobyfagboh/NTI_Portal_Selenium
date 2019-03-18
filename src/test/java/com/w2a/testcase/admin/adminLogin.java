package com.w2a.testcase.admin;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.w2a.base.TestBase;

		
		public	class adminLogin extends TestBase {
			Properties properties;
				@Test
				public void AdminLogin () throws InterruptedException  {
			
					driver.findElement(By.name(OR.getProperty("emailField_CLASSNAME"))).sendKeys(OR.getProperty("email_TEXT"));
					
					driver.findElement(By.id(OR.getProperty("passwordField_ID"))).sendKeys(OR.getProperty("passwordField_TEXT"));
					
				    click("logInBtn_XPATH");	
				    Thread.sleep(3000);

				}
		}
				
