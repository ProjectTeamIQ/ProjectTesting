package com.LMS.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.LMS.pages.*;

public class Test_month_session_calender {
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Exception  {
		 driver= helper.Browsers.getBrowsers("edge", "https://www.hcltss-lms.com/login/index.php");
	}
	@Test 
	public void verify_Month_session_calender() throws Exception {
		//checking login page
		Login log=new Login(driver);
		log.login_lms("LTTB0821448", "P@ssw0rd");
		
		// month session calender checking
				months mo=new months(driver);
				mo.jan();
					
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
