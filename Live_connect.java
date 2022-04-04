package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class Live_connect {
WebDriver driver;
boolean flag1=true;
By LC=By.linkText("Join");
//constructor
public Live_connect(WebDriver driver) {
this.driver=driver;
}

//for selecting testing course
public void connect() throws InterruptedException {
if(driver.findElement(LC).isDisplayed()) {
	Reporter.log("Live connect is present");
System.out.println("Live connect is present");
driver.findElement(LC).click();
}
else {
	Reporter.log("Live connect is not present");
System.out.println("Live connect is not present");
flag1=false;
}
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
ArrayList <String> tabs= new ArrayList <String>(driver.getWindowHandles());//to get window handles
driver.switchTo().window(tabs.get(1));// to switch window/tab
System.out.println("switching tab");
Reporter.log("the title of the page is : "+driver.getTitle());
System.out.println("the title of the page is : "+driver.getTitle());
Thread.sleep(1500);
if(flag1=true) {
	Reporter.log("Live connect is working fine");
System.out.println("Live connect is working fine");
}
else {
	Reporter.log("Live connect is not working fine");
System.out.println("Live connect is not working");
}

driver.close();
driver.switchTo().window(tabs.get(0));}}