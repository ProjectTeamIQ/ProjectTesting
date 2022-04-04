package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class scorecard {
WebDriver driver;

By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");
By close=By.xpath("//*[@id=\"cls\"]");

public scorecard(WebDriver driver) {
super();
this.driver = driver;
}

//for score card

public void sc() throws InterruptedException {
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
if(driver.findElement(By.linkText("Score Card")).isDisplayed()) {
	Reporter.log("Score card option is displayed");
	System.out.println("Score card option is displayed");
	driver.findElement(By.linkText("Score Card")).click();
	Thread.sleep(1000);
}else {
	Reporter.log("Score card option is not displayed");
	System.out.println("Score card option is not displayed");

}
if(driver.findElement(close).isDisplayed()) {
	Reporter.log("Page Title is:"+driver.getTitle());
	System.out.println("Page Title is:"+driver.getTitle());
	Reporter.log("Close option is present");
	System.out.println("Close option is present");
	driver.findElement(close).click();
	Thread.sleep(1000);
	Reporter.log("scorecard is done");
	System.out.println("scorecard is done");
}else {
	Reporter.log("Close option is not present");
	System.out.println("Close option is not present");

}
}}