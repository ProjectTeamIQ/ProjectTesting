package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class project {
WebDriver driver;
By Test=By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[3]/div[6]/div/div/a");
By mod1=By.linkText("Module 1");
By top1=By.linkText("Topic 1");
//constructor
public project(WebDriver driver) {
this.driver=driver;
}
//for selecting project course
public void proj() throws InterruptedException {
	if(driver.findElement(Test).isDisplayed()) {
		Reporter.log("Project option is present");
		System.out.println("Project option is present");
		driver.findElement(Test).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(nt.get(1));
		Reporter.log("Page Title is: "+driver.getTitle());
		System.out.println("Page Title is: "+driver.getTitle());
		module();
	}else {
		Reporter.log("Project option is not present");
		System.out.println("Project option is not present");
	}

}

//for selecting module
public void module() throws InterruptedException {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
if(driver.findElement(mod1).isDisplayed()) {
	Reporter.log("Modules inside project are present");
	System.out.println("Modules inside project are present");
	driver.findElement(mod1).click();
	Reporter.log("Page Title is: "+driver.getTitle());
	System.out.println("Page Title is: "+driver.getTitle());
	topic();
}else {
	Reporter.log("Modules inside project are not present");
	System.out.println("Modules inside project are not present");
}}

//for selecting topic
public void topic() throws InterruptedException {
Thread.sleep(1200);
if(driver.findElement(top1).isDisplayed()) {
	Reporter.log("Topics inside modules are present");
	System.out.println("Topics inside modules are present");
	driver.findElement(top1).click();
	Reporter.log("Page Title is: "+driver.getTitle());
	System.out.println("Page Title is: "+driver.getTitle());
	Reporter.log("Project is done");
	System.out.println("Project is done");
	driver.close();
}else {
	Reporter.log("Topics inside modules are present");
	System.out.println("Topics inside modules are present");
}
//to switch to main window
ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(nt.get(0));
}
}