package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class Resources {
WebDriver driver;
boolean flag1=true;
boolean flag2=true;
By img= By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");
By resource= By.linkText("Resources");
By VLab= By.linkText("V&A LAB");
By EngPrimer=By.linkText("English Primer");


//constructror
public Resources(WebDriver driver) {
super();
this.driver = driver;
}


//for V & A LAB
public void VAlab() throws InterruptedException{
driver.findElement(img).click();
Thread.sleep(1000);
if(driver.findElement(resource).isDisplayed()) {
	Reporter.log("Resources is present");
System.out.println("Resources is present");
driver.findElement(resource).click();
}
else {
	Reporter.log("Resources is not present");
System.out.println("Resources is not present");
}
Thread.sleep(1000);
if(driver.findElement(VLab).isDisplayed()) {
	Reporter.log("Vlab is present");
System.out.println("Vlab is present");
driver.findElement(VLab);
}
else {
	Reporter.log("VLab is not present");
System.out.println("VLab is not present");
flag1=false;
}
Thread.sleep(1000);
driver.navigate().back();
Reporter.log("V&A lab working fine!");
System.out.println("V&A lab working fine!");
}



public void EngPrimer() throws InterruptedException {
	driver.findElement(img).click();
	Thread.sleep(1000);
driver.findElement(resource).click();
Thread.sleep(1000);
if(driver.findElement(EngPrimer).isDisplayed()) {
	Reporter.log("EngPrimer is present");
System.out.println("EngPrimer is present");
driver.findElement(EngPrimer).click();
}
else {
	Reporter.log("EngPrimer is not present");
System.out.println("EngPrimer is not present");
flag2=false;
}
Thread.sleep(1000);
driver.navigate().back();
if(flag1==true && flag2==true) {
	Reporter.log("English Primer is working fine!");
System.out.println("English Primer is working fine!");
}
else {
	Reporter.log("English Primer is not working fine!");
	System.out.println("English Primer is working fine!");

}
}
}
