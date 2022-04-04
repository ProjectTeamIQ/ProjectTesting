package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;public class Learning_lab {
WebDriver driver;
boolean flag1=true;
By learning=By.linkText("Learning Labs");
public Learning_lab(WebDriver driver) {
super();
this.driver=driver;
}public void learninglabs() throws InterruptedException {
if(driver.findElement(learning).isDisplayed()) {
	Reporter.log("Learning Labs is present");
System.out.println("Learning Labs is present");
driver.findElement(learning).click();
String title=driver.getTitle();
Reporter.log("The page is opened is:"+title);
System.out.println("The page is opened is:"+title);
}
else {
	Reporter.log("Learning Labs is not present");
System.out.println("Learning Labs is not present");
flag1=false;
}
Thread.sleep(1000);
driver.navigate().back();
if(flag1==true) {
	Reporter.log("Learning Labs is working fine!");
System.out.println("Learning Labs is working fine!");
}
else {
	Reporter.log("Learning Labs is not working fine!");
System.out.println("Learning Labs is not able to work");
}
}
}


