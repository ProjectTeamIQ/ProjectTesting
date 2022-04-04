package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class Testing {
WebDriver driver;
By Test=By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[3]/div[5]/div/div/a");
By mod1=By.linkText("Testing Fundamentals: Man...");
By top1=By.linkText("Topic 1-SOFTWARE DEVELOPM...");
By content=By.xpath("//*[@id=\"module-580039\"]/div/div/div[2]/div[1]/a/img");
//constructor
public Testing(WebDriver driver) {
this.driver=driver;
}

//for selecting testing course
public void test() throws InterruptedException {
	if(driver.findElement(Test).isDisplayed()) {
		Reporter.log("Testing option is present");
		System.out.println("Testing option is present");
		driver.findElement(Test).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(nt.get(1));
		Reporter.log("Page title is "+driver.getTitle());
		System.out.println("Page title is "+driver.getTitle());
		module();
	}else {
		Reporter.log("Testing option is not present");
		System.out.println("Testing option is not present");}
}

//for selecting module
public void module() throws InterruptedException {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
if(driver.findElement(mod1).isDisplayed()) {
	Reporter.log("Modules inside testing options are present");
	System.out.println("Modules inside testing options are present");
	driver.findElement(mod1).click();
	Reporter.log("Page title is "+driver.getTitle());
	System.out.println("Page title is "+driver.getTitle());
	topic();
}else {
	Reporter.log("Modules inside testing options are not present");
	System.out.println("Modules inside testing options are not present");
}}

//for selecting topic
public void topic() throws InterruptedException {
	if(driver.findElement(top1).isDisplayed()) {
		Reporter.log("topics inside modules are present");
		System.out.println("topics inside modules are present");
		Thread.sleep(1200);
		driver.findElement(top1).click();
		Reporter.log("Page title is "+driver.getTitle());
		System.out.println("Page title is "+driver.getTitle());
		cont();

	}else {
		Reporter.log("topics inside modules are not  present");
		System.out.println("topics inside modules are not  present");}
}
//for selecting content
public void cont() throws InterruptedException {
	if(driver.findElement(content).isDisplayed()) {
		Reporter.log("Content inside topic is present");
		System.out.println("Content inside topic is present");
		Thread.sleep(1200);
		driver.findElement(content).click();
		Reporter.log("Page title is "+driver.getTitle());
		System.out.println("Page title is "+driver.getTitle());
		Reporter.log("Testing is done");
		System.out.println("Testing is done");
		driver.close();
	}else {
		Reporter.log("Content inside topic is not present");
		System.out.println("Content inside topic is not present");
	}
//for  go back to home window
ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(nt.get(0));


}}
