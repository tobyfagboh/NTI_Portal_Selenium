package com.w2a.testcase.admin;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;

	public class AdminSanity extends TestBase{
		Properties properties; 

	@Test (priority=1)
	public void AdminLogin () throws InterruptedException  {
		
		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
		driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
	    click("logInBtn_XPATH");	
	    Thread.sleep(2000);
	    click("profileName_XPATH");
	    click("adminLogOut_XPATH");
	}
	
	@Test (priority=2)
	public void CreateCourse () throws InterruptedException  {
		
		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
		driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
	    click("logInBtn_XPATH");	
	    Thread.sleep(2000);

	    click("createCourseBtn_XPATH");
	    click("createNewCoursesBtn_XPATH");
	    driver.findElement(By.id(OR.getProperty("courseCodeField_ID"))).sendKeys(OR.getProperty("courseCode_TEXT"));
        driver.findElement(By.id(OR.getProperty("courseTitleField_ID"))).sendKeys(OR.getProperty("courseTitle_TEXT"));
       // click("unit_XPATH");
        driver.findElement(By.xpath(OR.getProperty("unit_XPATH"))).sendKeys(OR.getProperty("unit_TEXT"));
        click("programmeField_XPATH");	
        click("bachelorDegree_XPATH");	
        click("specialization_XPATH");	
        click("computerScience_XPATH");	
        click("levelDropdown_XPATH");	
        click("level4_XPATH");	
        click("semester_XPATH");	
        click("secondSemester_XPATH");
        click("type_XPATH");
        click("compulsory_XPATH");
        click("status_XPATH");
        click("active_XPATH");
        click("createNewCourseBtn_XPATH");	
        click("profileName_XPATH");
	    click("adminLogOut_XPATH");	
	}

	@Test (priority=3)
	public void CreateFeeAssignment () throws InterruptedException  {
		
		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
		driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
	    click("logInBtn_XPATH");	
	    Thread.sleep(2000);
	    
	    click("feesBtn_XPATH");
	    click("feeAssignmentBtn_XPATH");
	    click("createFeeAssignmentBtn_XPATH");
	    click("forField_XPATH");
	    click("studentOption_XPATH");
	    driver.findElement(By.xpath(OR.getProperty("valueField_XPATH"))).sendKeys(OR.getProperty("valueField_TEXT"));
	    click("semesterField_XPATH");
	    click("currentSemsesterOption_XPATH");
	    click("feeField_XPATH");
	    click("tuitionFeeOption_XPATH");
	    click("levelField_XPATH");
	    click("level2Option_XPATH");
	    click("natureField_XPATH");
	    click("addOption_XPATH");
	    driver.findElement(By.id(OR.getProperty("amountField_ID"))).sendKeys(OR.getProperty("amountField_TEXT"));
	    driver.findElement(By.xpath(OR.getProperty("ntiField_XPATH"))).sendKeys(OR.getProperty("ntiField_TEXT"));
	    driver.findElement(By.xpath(OR.getProperty("omniswiftField_XPATH"))).sendKeys(OR.getProperty("omniswiftField_TEXT"));
	    driver.findElement(By.xpath(OR.getProperty("installment1Field_XPATH"))).sendKeys(OR.getProperty("installment1Field_TEXT"));
	    driver.findElement(By.xpath(OR.getProperty("installment2Field_XPATH"))).sendKeys(OR.getProperty("installment2Field_TEXT"));
	    driver.findElement(By.xpath(OR.getProperty("descriptionField_XPATH"))).sendKeys(OR.getProperty("descriptionField_TEXT"));
	    click("saveBtn_XPATH");
	    Thread.sleep(3000); 
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    click("profileName_XPATH");
	    click("adminLogOut_XPATH");
	}

	@Test (priority=4)
	public void CreateScholarship () throws InterruptedException {

		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
		driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
	    click("logInBtn_XPATH");	
	    Thread.sleep(2000);	    
	    click("scholarshipBtn_XPATH");
	    Thread.sleep(2000);
	    
	    click("createScholarshipBtn_XPATH");
	    Thread.sleep(2000);
	    click("scholarshipType_XPATH");
	    click("studentSelected_XPATH");
	    driver.findElement(By.id(OR.getProperty("titleField_ID"))).sendKeys(OR.getProperty("titleField_TEXT"));	
		driver.findElement(By.id(OR.getProperty("payerNameField_ID"))).sendKeys(OR.getProperty("payerName_TEXT"));
	    driver.findElement(By.xpath(OR.getProperty("payerEmail_XPATH"))).sendKeys(OR.getProperty("payerEmail_TEXT"));	
		driver.findElement(By.name(OR.getProperty("payerPhone_CLASSNAME"))).sendKeys(OR.getProperty("payerPhone_TEXT"));
		click("selectFeeType_XPATH");
		click("selectedTypeOfFee_XPATH");
		click("semestField_XPATH");
		click("selectedSemester_XPATH");
		driver.findElement(By.xpath(OR.getProperty("noOfBeneficiary_XPATH"))).sendKeys(OR.getProperty("beneficiary_TEXT"));	
		driver.findElement(By.id(OR.getProperty("amount_ID"))).sendKeys(OR.getProperty("amount_TEXT"));
		driver.findElement(By.id(OR.getProperty("description_ID"))).sendKeys(OR.getProperty("description_TEXT"));
		click("saveBtn_ID");
		Thread.sleep(3000);
		click("profileName_XPATH");
		click("adminLogOut_XPATH");
	}
	
	@Test (priority=5)
	public void DiscontinuedCourses () throws InterruptedException  {
		
		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
		driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
	    click("logInBtn_XPATH");	
	    Thread.sleep(2000);

	    click("coursesBtn_XPATH");
	    click("discontinuedCoursesBtn_XPATH");
	    Thread.sleep(3000);
	    click("profileName_XPATH");
	    click("adminLogOut_XPATH");
}
	
	@Test (priority=6)
	public void ManageTransaction () throws InterruptedException  {
		
		click("currentStudentReg_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.name(OR.getProperty("adminEmailField_CLASSNAME"))).sendKeys(OR.getProperty("adminEmailField_TEXT"));
		driver.findElement(By.name(OR.getProperty("adminPasswordField_CLASSNAME"))).sendKeys(OR.getProperty("adminPasswordField_TEXT"));
	    click("logInBtn_XPATH");	
	    Thread.sleep(2000);

	  click("feesBtn_XPATH");
	  click("manageTransactionsBtn_XPATH");
	  Thread.sleep(3000);
	   click("profileName_XPATH");
	    click("adminLogOut_XPATH");
	    }
	}

