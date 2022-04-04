package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;



public class MyProgramMilestones {
WebDriver driver;



public MyProgramMilestones(WebDriver driver) {
super();
this.driver = driver;
}
By milestone=By.linkText("My Program Milestone");
public void mile() throws InterruptedException {
	if(driver.findElement(milestone).isDisplayed()) {
		Reporter.log("My program milestone option is present");
		System.out.println("My program milestone option is present");
		driver.findElement(milestone).click();
		Thread.sleep(7200);
		Reporter.log("Page title is : "+driver.getTitle());
		System.out.println("Page title is : "+driver.getTitle());
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
		driver.navigate().back();
		Reporter.log("My Program Milestone is done");
		System.out.println("My Program Milestone is done");
	}else {
		Reporter.log("My program milestone option is not present");
		System.out.println("My program milestone option is not present");

	}

}}