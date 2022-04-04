package com.LMS.Test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.LMS.pages.*;

public class verifyLogin {
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Exception  {
		 driver= helper.Browsers.getBrowsers("edge", "https://www.hcltss-lms.com/login/index.php");
	}
	@Test 
	public void verifyLMS_login() throws Exception {
		//checking login page
		Login log=new Login(driver);
		log.login_lms("LTTB0821448", "P@ssw0rd");
					
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
