package com.w2a.testcase;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class terms_of_use extends TestBase {
	
	@Test
	public void TermsOfUsePage () {  
		log.debug("Terms of Use Executed");
		click("TermsOfUsePage_XPATH");

}
}