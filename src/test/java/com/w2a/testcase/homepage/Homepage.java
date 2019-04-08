package com.w2a.testcase.homepage;

import java.util.Properties;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

	public class Homepage extends TestBase{
		Properties properties; 

	@Test (priority=1)
	public void verifyHowToApply() throws InterruptedException  {

		log.debug("Log in page Executed");
		Thread.sleep(3000);
		click("howToApplyPageBtn_XPATH");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test (priority=2)
	public void verifyHowToRegister() throws InterruptedException  {

		log.debug("Log in page Executed");
		Thread.sleep(3000);
		click("howToRegisterPageBtn_PATH");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();

}
	@Test (priority=3)
	public void verifyHelpAndSupportPage() throws InterruptedException  {

		log.debug("Log in page Executed");
		Thread.sleep(3000);
		click("helpAndSupportPageBtn_XPATH");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();

}
	
	@Test (priority=4)
	public void verifyTermsOfUser() throws InterruptedException  {

		log.debug("Log in page Executed");
		Thread.sleep(3000);
		click("termsOfUserBtn_XPATH");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
}
	
	@Test (priority=5)
	public void verifyPrivacyPolicy() throws InterruptedException  {

		log.debug("Log in page Executed");
		Thread.sleep(3000);
		click("privacyPolicyBtn_XP");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
}
	
}


