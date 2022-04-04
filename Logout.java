package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class Logout {
WebDriver driver;
//constructor
public Logout(WebDriver driver) {
super();
this.driver = driver;
}
By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");
By main= By.linkText("Dheeraj .");
By logout=By.linkText("Log out");
//for logout 
public void logout() throws InterruptedException {
driver.findElement(img).click();
Thread.sleep(1200);
if(driver.findElement(main).isDisplayed()) {
	Reporter.log("Name is present.");
System.out.println("Name is present");
driver.findElement(main).click();
Reporter.log("Page title is "+driver.getTitle());
System.out.println("Page title is "+driver.getTitle());
}
else {
	Reporter.log("Name is not present");
	System.out.println("Name is not present");
	Reporter.log("Page title is "+driver.getTitle());
System.out.println("Page title is "+driver.getTitle());

}
Thread.sleep(1100);
if(driver.findElement(logout).isDisplayed()) {
	Reporter.log("Log out is present");
System.out.println("Log out is present");
driver.findElement(logout).click();
Reporter.log("Page title is "+driver.getTitle());
System.out.println("Page title is "+driver.getTitle());
Reporter.log("Logout successful");
System.out.println("Logout successful");
}
else {
	Reporter.log("Logout is not present");
System.out.println("Logout is not present");
Reporter.log("Page title is "+driver.getTitle());
System.out.println("Page title is "+driver.getTitle());
}
Thread.sleep(1500);
Reporter.log("Log Out function is working fine!");
System.out.println("Log Out function is working fine!");


}
}