package com.w2a.testcase;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class home_page extends TestBase {
	
	@Test
	public void HomePage () {  
		log.debug("Home page excuted");
		click("HomePage_XPATH");
		
		
	}

}
