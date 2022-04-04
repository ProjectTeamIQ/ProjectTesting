package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class months {
	WebDriver driver;
//constructor
	public months(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By month=By.cssSelector("#demoEvoCalendar > div.calendar-sidebar > div.month-list > ul");
	By jan=By.cssSelector("#demoEvoCalendar > div.calendar-sidebar > div.month-list > ul > li:nth-child(1)");
	By feb=By.cssSelector("#demoEvoCalendar > div.calendar-sidebar > div.month-list > ul > li:nth-child(2)");
	
	
	//for jan month
	public void jan() throws Exception {
		if(driver.findElement(month).isDisplayed()) {
			Reporter.log("Month wise session calender is present");
			System.out.println("Month wise session calender is present");
			driver.findElement(month).click();
			if(driver.findElement(jan).isDisplayed()) {
				Reporter.log("January month is shown in calender");
				System.out.println("January month is shown in calender");	
				driver.findElement(jan).click();
				Thread.sleep(3200);
				feb();
				Reporter.log("Month wise session calender displayed!");
				System.out.println("Month wise session calender displayed!");
			}else {
				Reporter.log("January month is not shown in calender");
				System.out.println("January month is not shown in calender");
			}
		}
		else {
			Reporter.log("Month wise session calender is not present");
			System.out.println("Month wise session calender is not present");

		}
	
	}
	// for feb month
	public void feb() throws Exception {
		if(driver.findElement(feb).isDisplayed()) {
			Reporter.log("February month is present in calender");
			System.out.println("February month is present in calender");
			driver.findElement(feb).click();
			Thread.sleep(3200);
			driver.navigate().refresh();
		}else {
			Reporter.log("February month is not  present in calender");
			System.out.println("February month is not  present in calender");
		}
		
	}
}
