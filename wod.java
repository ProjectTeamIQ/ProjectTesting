package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class wod {
WebDriver driver;
boolean flag1=true;
boolean flag2=true;
public wod(WebDriver driver) {
this.driver = driver;
}

By wod=By.linkText("WOD");
By close=By.cssSelector("#page-local-lmsrequests-batch_creation > div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.ui-draggable.ui-resizable > div.ui-dialog-titlebar.ui-corner-all.ui-widget-header.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon.ui-icon.ui-icon-closethick");
By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");


public void wod_click() throws Exception {

driver.findElement(img).click();
Thread.sleep(1000);

if(driver.findElement(wod).isDisplayed()) {
	Reporter.log("wod is present");

System.out.println("wod is present");
driver.findElement(wod).click();
Thread.sleep(1000);
}
else{
	Reporter.log("wod is not present");
System.out.println("wod is not present");
}

if(driver.findElement(close).isDisplayed()) {
	Reporter.log("close button is present");
System.out.println("close button is present");
driver.findElement(close).click();
Reporter.log("wod is closed");
System.out.println("wod is closed");
Thread.sleep(1000);
}
else{
	Reporter.log("close button is not present");
System.out.println("close button is not present");
}

if(flag1==true && flag2==true) {
	Reporter.log("wod is working fine");
System.out.println("wod is working fine");
driver.navigate().back();
}
else {
	Reporter.log("wod is not working fine");
System.out.println("wod is not working fine");
}
}
}