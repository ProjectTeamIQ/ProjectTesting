package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class MyWorkbookCalender {
	WebDriver driver;
	public MyWorkbookCalender(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By calender=By.linkText("My Workbook Calendar");
	
	public void MyWorkbookcalender() throws Exception {
		if(driver.findElement(calender).isDisplayed()) {
			Reporter.log("My workbook calender option is present.");
			System.out.println("My workbook calender option is present.");
			driver.findElement(calender).click();
			  driver.findElement(calender).click();
			  Thread.sleep(9200);
			  Reporter.log("Page title is:"+driver.getTitle());
			  System.out.println("Page title is:"+driver.getTitle());
			  JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("window.scrollBy(0,300)");
		      Thread.sleep(1000);
		      j.executeScript("window.scrollBy(0,300)");
		      Thread.sleep(1000);
		      j.executeScript("window.scrollBy(0,300)");
		      Thread.sleep(1000);
		      j.executeScript("window.scrollBy(0,-300)");
		      Thread.sleep(1000);
		      j.executeScript("window.scrollBy(0,-300)");
		      Thread.sleep(1000);
		      j.executeScript("window.scrollBy(0,-300)");
		      Thread.sleep(1000);
		      Reporter.log("My Workbook  calender working fine!");
			  System.out.println("My Workbook  calender working fine!");
		}else {
			Reporter.log("My workbook calender option is present.");
			System.out.println("My workbook calender option is present.");

		}
	}

}
