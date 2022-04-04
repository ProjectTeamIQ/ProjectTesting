package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class Communication_assessment_record {
	WebDriver driver;
//constructor
	public Communication_assessment_record(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By record=By.cssSelector("#region-main > div > div > div > div:nth-child(5) > div > div:nth-child(2) > div");
	
	//For communication assessment checking
	public void reocrd() {
		boolean b=driver.findElement(record).isDisplayed();
		if(b==true) {
			Reporter.log("Communication Assessment record is shown!");
			System.out.println("Communication Assessment record is shown!");
		}
		else {
			Reporter.log("try again or refresh lms page");
			System.out.println("try again or refresh lms page");
		}
	}
}
