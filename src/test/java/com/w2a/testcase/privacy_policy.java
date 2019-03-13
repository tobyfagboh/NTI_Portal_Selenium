package com.w2a.testcase;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class privacy_policy  extends TestBase {
	
	@Test
	public void TermsOfUsePage () {  
		log.debug("Privacy Policy Executed");
		click("PrivacyPolicy_XPATH");
}
}