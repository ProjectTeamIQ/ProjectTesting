package com.LMS.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Learning_path {
WebDriver driver;
By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");

public Learning_path(WebDriver driver) {
super();
this.driver = driver;
}
By learning =By.linkText("Learning Path");

public void learning_path() throws InterruptedException {
if(driver.findElement(learning).isDisplayed()) {
	Reporter.log("Learning Path is present");
System.out.println("Learning Path is present");
driver.findElement(learning).click();
}
else {
	Reporter.log("Learning Path is not present");
System.out.println("Learning Path is not present");
}
Thread.sleep(6200);
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("window.scrollBy(0,300)");
Thread.sleep(1000);
j.executeScript("window.scrollBy(0,300)");
Thread.sleep(1000);
j.executeScript("window.scrollBy(0,300)");
Thread.sleep(1000);
j.executeScript("window.scrollBy(0,-300)");
Thread.sleep(1000);
j.executeScript("window.scrollBy(0,-300)");
Thread.sleep(1000);
j.executeScript("window.scrollBy(0,-300)");
Thread.sleep(1000);
System.out.println("Learning path is closing");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
System.out.println("closed");
Reporter.log("Learning Path is working fine!");
System.out.println("Learning path is working fine!");
}

}
