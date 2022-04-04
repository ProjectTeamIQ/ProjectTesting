package com.LMS.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.LMS.pages.*;

public class Test_userbutton_options {
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Exception  {
		 driver= helper.Browsers.getBrowsers("edge", "https://www.hcltss-lms.com/login/index.php");
	}
	@Test 
	public void verify_Userbutton() throws Exception {
		//checking login page
		Login log=new Login(driver);
		log.login_lms("LTTB0821448", "P@ssw0rd");
		//batch change
				batch_select batch = new batch_select(driver);
				batch.batch();
				//userbutton options check
				Option_userbutton user=new Option_userbutton(driver);
				user.Mylearning();
				user.profile();
				user.grades();
				user.messages();
				user.preferance();
		
				
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
