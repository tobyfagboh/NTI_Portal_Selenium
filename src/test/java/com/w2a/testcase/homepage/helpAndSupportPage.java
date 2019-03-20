package com.w2a.testcase.homepage;

import java.util.Properties;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

		public class helpAndSupportPage extends TestBase {
			Properties properties;
	
			@Test
			public void verifyHelpAndSupportPage () throws InterruptedException  {
		
				log.debug("Log in page Executed");
				Thread.sleep(3000);
				click("helpAndSupportPageBtn_XPATH");
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.quit();
		
	}
}