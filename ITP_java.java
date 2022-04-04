package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;public class ITP_java {
WebDriver driver;boolean flag1=true,flag2=true,flag3=true,flag4=true;public ITP_java(WebDriver driver) {
super();
this.driver = driver;
}
By itp=By.cssSelector("#region-main > div > div > div > div.container-fluid.page__container > div.row.card-group-row > div:nth-child(4) > div > div > a");
By module=By.linkText("Module 1");
By topic1=By.linkText("1. Introduction_To_Java...");
By seltop=By.cssSelector("#module-579698 > div > div > div:nth-child(2) > div.activityinstance > a > img");//for selecting java itp

//for ITP java 
public void itp_java() throws InterruptedException {
if(driver.findElement(itp).isDisplayed()) {
	Reporter.log("ITP Java is present");
System.out.println("ITP Java is present");
driver.findElement(itp).click();
}
else {
	Reporter.log("ITP Java is not present");
System.out.println("ITP Java is not present");
flag1=false;
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//for wait
Reporter.log("Switching the tabs");
System.out.println("Switching the tabs");
ArrayList <String> tabs= new ArrayList <String>(driver.getWindowHandles());//to get window handles
driver.switchTo().window(tabs.get(1));// to switch window/tab
Reporter.log("the title of the page is "+driver.getTitle());
System.out.println("the title of the page is "+driver.getTitle());
Thread.sleep(1100);module1();

}//for selecting module
public void module1() throws InterruptedException {
if(driver.findElement(module).isDisplayed()) {
	Reporter.log("Module is present");
System.out.println("Module is present");
driver.findElement(module).click(); 
Reporter.log("the title of the page is "+driver.getTitle());
System.out.println("the title of the page is "+driver.getTitle());
}
else {
	Reporter.log("Module is not present");
System.out.println("Module is not present");
flag2=false;
}
Thread.sleep(1100);
topic1();
}


//for selecting topic
public void topic1() throws InterruptedException {
if(driver.findElement(topic1).isDisplayed()) {
	Reporter.log("topic is present");
System.out.println("topic is present");
driver.findElement(topic1).click(); 
Reporter.log("the title of the page is "+driver.getTitle());
System.out.println("the title of the page is "+driver.getTitle());
}
else {
	Reporter.log("topic is not present");
System.out.println("topic is not present");
flag3=true;
}
Thread.sleep(1100);
seltop();
}


//for opening of selected topic
public void seltop() throws InterruptedException {
if(driver.findElement(seltop).isDisplayed()) {
	Reporter.log("content is present");
System.out.println("content is present");
driver.findElement(seltop).click();
Reporter.log("the title of the page is "+driver.getTitle());
System.out.println("the title of the page is "+driver.getTitle());

}
else {
	Reporter.log("content is not presented");
System.out.println("content is not presented");
flag4=false;
}
Thread.sleep(1100);
driver.close();
if(flag1=true && flag2==true && flag3==true && flag4==true) {
	Reporter.log("ITP Java is working fine!");
System.out.println("ITP Java is working fine!");
}
else {
	Reporter.log("ITP Java is not working fine!");
System.out.println("ITP Java is not working");
}
// To come for home window
ArrayList <String> nt1=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(nt1.get(0));
}}

