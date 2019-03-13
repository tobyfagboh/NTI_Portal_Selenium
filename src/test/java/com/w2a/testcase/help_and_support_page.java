package com.w2a.testcase;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class help_and_support_page extends TestBase {
	
	@Test
	public void HelpAndSupportPage () {  
		log.debug("Help and Support Page Executed");
		click("HelpAndSupportPage_XPATH");
}
}