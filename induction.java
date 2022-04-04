package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;



public class induction {
WebDriver driver;
By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");
By induction= By.linkText("Induction");
By indassessment= By.linkText("Ind Assessment");
By indhandbook= By.linkText("Ind Handbook");
By ethics = By.linkText("Ethics");



public induction(WebDriver driver) {
super();
this.driver = driver;
}



public void indassessment() throws InterruptedException {
	if(driver.findElement(img).isDisplayed()) {
		Reporter.log("\"HCL Training and staffing services\" is displayed ");
		System.out.println("\"HCL Training and staffing services\" is displayed ");
		driver.findElement(img).click();
		Thread.sleep(1000);
	}else
	{
		Reporter.log("\"HCL Training and staffing services\" is not displayed ");
		System.out.println("\"HCL Training and staffing services\" is not  displayed ");

	}
	if(driver.findElement(induction).isDisplayed()) {
		Reporter.log("Induction dropdown button is present");
		System.out.println("Induction dropdown button is present");
		driver.findElement(induction).click();
		Thread.sleep(1000);
	}else {
		Reporter.log("Induction dropdown button is not present");
		System.out.println("Induction dropdown button is not  present");

	}
	if(driver.findElement(indassessment).isDisplayed()) {
		Reporter.log("Assessment option is displayed.");
		System.out.println("Assessment option is displayed.");
		driver.findElement(indassessment).click();
		Thread.sleep(1000);
		Reporter.log("Title of page is"+driver.getTitle());
		System.out.println("Title of page is"+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		Reporter.log("ind Assessment  is working fine!");
		
		System.out.println("ind Assessment  is working fine!");
	}else {
		Reporter.log("Assessment option is not displayed.");
		System.out.println("Assessment option is not displayed.");

	}
}

public void indHandbook() throws Exception {
	if(driver.findElement(img).isDisplayed()) {
		Reporter.log("\"HCL Training and staffing services\" is displayed ");
		System.out.println("\"HCL Training and staffing services\" is displayed ");
		driver.findElement(img).click();
		Thread.sleep(1000);
	}else
	{
		Reporter.log("\"HCL Training and staffing services\" is not displayed ");
		System.out.println("\"HCL Training and staffing services\" is not  displayed ");

	}
	if(driver.findElement(induction).isDisplayed()) {
		Reporter.log("Induction dropdown button is present");
		System.out.println("Induction dropdown button is present");
		driver.findElement(induction).click();
		Thread.sleep(1000);
	}else {
		Reporter.log("Induction dropdown button is not present");
		System.out.println("Induction dropdown button is not  present");}

	if(driver.findElement(indhandbook).isDisplayed()) {
		Reporter.log("Ind Handbook option is displayed");
		System.out.println("Ind Handbook option is displayed");
		driver.findElement(indhandbook).click();
		Thread.sleep(1000);
		Reporter.log("Title of page is"+driver.getTitle());
		System.out.println("Title of page is"+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		Reporter.log("ind handbook is working fine!");
		System.out.println("ind handbook is working fine!");
	}else {
		Reporter.log("ind handbook is not working fine!");
		System.out.println("Ind Handbook option is not  displayed");

	}
	
}
public void ethics() throws Exception {
	if(driver.findElement(img).isDisplayed()) {
		Reporter.log("\"HCL Training and staffing services\" is displayed ");
		System.out.println("\"HCL Training and staffing services\" is displayed ");
		driver.findElement(img).click();
		Thread.sleep(1000);
	}else
	{
		Reporter.log("\"HCL Training and staffing services\" is not displayed ");
		System.out.println("\"HCL Training and staffing services\" is not  displayed ");

	}
	driver.findElement(induction).click();
	Thread.sleep(1000);
	if(driver.findElement(ethics).isDisplayed()) {
		Reporter.log("Ethics option is displayed");
		System.out.println("Ethics option is displayed");
		driver.findElement(ethics).click();
		Thread.sleep(1000);
		Reporter.log("Title of page is"+driver.getTitle());
		System.out.println("Title of page is"+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		Reporter.log("Ethics is working fine!");
		System.out.println("Ethics is working fine!");
		
	}else {
		Reporter.log("Ethics option is not displayed");
		System.out.println("Ethics option is not displayed");

	}
	
	
	
}

}
