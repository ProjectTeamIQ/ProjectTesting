package com.LMS.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.LMS.pages.*;

public class Test_score_card {
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Exception  {
		 driver= helper.Browsers.getBrowsers("edge", "https://www.hcltss-lms.com/login/index.php");
	}
	@Test 
	public void verify_Wod() throws Exception {
		//checking login page
		Login log=new Login(driver);
		log.login_lms("LTTB0821448", "P@ssw0rd");

		//Checking score card
				scorecard score=new scorecard(driver);
				score.sc();
	}
@AfterTest
public void tearDown() {
	driver.quit();
}}
	
