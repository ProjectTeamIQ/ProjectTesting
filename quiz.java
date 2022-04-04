package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class quiz{
	WebDriver driver;
//constructor
	public quiz(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By quiz=By.linkText("Attend");
	By daily=By.linkText("Daily Quiz");
	
	//To select quiz option from dashboard
	public void quiz() {
		if(driver.findElement(quiz).isDisplayed()) {
			Reporter.log("Quiz option is present");
			System.out.println("Quiz option is present");
			driver.findElement(quiz).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ArrayList <String> tabs= new ArrayList <String>(driver.getWindowHandles());//to get window handles
			driver.switchTo().window(tabs.get(1));// to switch window/tab
			Reporter.log("Page Title is: "+driver.getTitle());
			System.out.println("Page Title is: "+driver.getTitle());
			daily();
		}else {
			Reporter.log("Quiz option is not present");
			System.out.println("Quiz option is not present");
		}
		
	}
	// To select daily quiz
	public void daily() {
		if(driver.findElement(daily).isDisplayed()) {
			Reporter.log("Quizes are available inside daily quiz options!");
			System.out.println("Quizes are available inside daily quiz options!");
			driver.findElement(daily).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Reporter.log("Page Title is: "+driver.getTitle());
			System.out.println("Page Title is: "+driver.getTitle());
			Reporter.log("Quiz is working fine!");
			System.out.println("Quiz is working fine!");
			driver.close();
		}else {
			Reporter.log("Quizes are not available inside daily quiz options!");
			System.out.println("Quizes are not available inside daily quiz options!");
		}
		
		//go back to main window
		ArrayList <String> tabs= new ArrayList <String>(driver.getWindowHandles());//to get window handles
		driver.switchTo().window(tabs.get(0));// to switch window/tab
		
	}
	

}
