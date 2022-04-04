package com.LMS.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.LMS.pages.*;

public class Test_learning_path {
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Exception  {
		 driver= helper.Browsers.getBrowsers("edge", "https://www.hcltss-lms.com/login/index.php");
	}
	@Test 
	public void verify_learning_path() throws Exception {
		//checking login page
		Login log=new Login(driver);
		log.login_lms("LTTB0821448", "P@ssw0rd");
		//batch change
		batch_select batch = new batch_select(driver);
		batch.batch();
		//checking learning path
		Learning_path learning=new Learning_path(driver);
		learning.learning_path();
		
				
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}

