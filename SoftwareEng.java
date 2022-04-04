package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class SoftwareEng {
WebDriver driver;

public SoftwareEng(WebDriver driver) {
this.driver=driver;
}

By soft= By.linkText("Software Engineering");
By module1= By.linkText("Module 1");
By topic1= By.linkText("SE_DAY1");




//for selecting software engineering
public void software() throws InterruptedException {
if(driver.findElement(soft).isDisplayed()) {
	Reporter.log("Software Engineering is present");
System.out.println("Software Engineering is present");
driver.findElement(soft).click();
Reporter.log("the title of the page is "+driver.getTitle());
System.out.println("the title of the page is "+driver.getTitle());
}
else{
	Reporter.log("Software Engineering is not present");
System.out.println("Software Engineering is not present");
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//for wait
System.out.println("switching to next tab");
ArrayList <String> tabs= new ArrayList <String>(driver.getWindowHandles());//to get window handles
driver.switchTo().window(tabs.get(1));// to switch window/tab
module1();
}

// for selecting module
public void module1() throws InterruptedException {
if(driver.findElement(module1).isDisplayed()) {
	Reporter.log("Module 1 is present");
System.out.println("Module 1 is present");
driver.findElement(module1).click();
Reporter.log("the title of the page is "+driver.getTitle());
System.out.println("the title of the page is "+driver.getTitle());

}
else {
	Reporter.log("Module 1 is not present");
System.out.println("Module 1 is not present");
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
}
Thread.sleep(1100);
Reporter.log("Software Engineering is working fine!");
System.out.println("Software Engineering is working fine!");
driver.close();
// To come for home window
System.out.println("switching to previous tab");
ArrayList <String> nt1=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(nt1.get(0));

}}