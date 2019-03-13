package com.w2a.testcase;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class how_to_register extends TestBase {
	
	@Test
	public void HowToRegisterPage () {  
		log.debug("How to register page Executed");
		click("HowToRegisterPage_XPATH");
}
}