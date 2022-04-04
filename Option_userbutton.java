package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class Option_userbutton {
WebDriver driver;
//constructor
public Option_userbutton(WebDriver driver) {
super();
this.driver = driver;
}
By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");

By main= By.linkText("Dheeraj .");
By MyLearning= By.linkText("My Learning");
By Profile=By.linkText("Profile");
By grades=By.linkText("Grades");
By messages=By.linkText("Messages");
By preferance=By.linkText("Preferences");


// for my learning
public void Mylearning() throws InterruptedException {

if(driver.findElement(main).isDisplayed()) {
	Reporter.log("Name is present");
System.out.println("Name is present");
driver.findElement(main).click();
Reporter.log("The title of the page is "+driver.getTitle());
System.out.println("The title of the page is "+driver.getTitle());
}
else {
	Reporter.log("Name is not present");
System.out.println("Name is not present");
}
Thread.sleep(1200);
if(driver.findElement(MyLearning).isDisplayed()) {
	Reporter.log("MyLearning is present");
System.out.println("MyLearning is present");
driver.findElement(MyLearning).click();
Reporter.log("The title of the page is "+driver.getTitle());
System.out.println("The title of the page is "+driver.getTitle());

}
else {
	Reporter.log("MyLearning is not present");
System.out.println("MyLearning is not present");
}
Thread.sleep(1400);
driver.navigate().back();
Reporter.log("MyLearning is working fine!");
System.out.println("My Learning is working fine!");
}


//for profile
public void profile() throws InterruptedException {
driver.findElement(main).click();
Thread.sleep(1200);
if(driver.findElement(Profile).isDisplayed()) {
	Reporter.log("Profile is present");
System.out.println("Profile is present");
driver.findElement(Profile).click();
Reporter.log("The title of the page is "+driver.getTitle());
System.out.println("The title of the page is "+driver.getTitle());

}
else {
	Reporter.log("Profile is not present");
System.out.println("Profile is not present");
}
Thread.sleep(1200);
driver.navigate().back();
Reporter.log("Profile is working fine!");
System.out.println("Profile is working fine!");

}


// for grade
public void grades() throws InterruptedException {
driver.findElement(main).click();
Thread.sleep(1200);
if(driver.findElement(grades).isDisplayed()) {
	Reporter.log("grades is present");
System.out.println("grades is present");
driver.findElement(grades).click();
Reporter.log("The title of the page is "+driver.getTitle());
System.out.println("The title of the page is "+driver.getTitle());

}
else {
	Reporter.log("grades is not present");
System.out.println("grades is not present");
}
Thread.sleep(1200);
driver.navigate().back();
Reporter.log("grades is working fine!");
System.out.println("grades is working fine!");

}

// for message
public void messages() throws InterruptedException {
driver.findElement(main).click();
Thread.sleep(1200);
if(driver.findElement(messages).isDisplayed()) {
	Reporter.log("messages is present");
System.out.println("messages is present");
driver.findElement(messages).click();
Reporter.log("The title of the page is "+driver.getTitle());
System.out.println("The title of the page is "+driver.getTitle());

}
else {
	Reporter.log("messages is present");
System.out.println("messages is present");
}
Thread.sleep(1200);
driver.navigate().back();
Reporter.log("messages is working fine!");
System.out.println("messages is working fine!");

}

//for perferance 
public void preferance() throws InterruptedException {
driver.findElement(main).click();
Thread.sleep(1200);
if(driver.findElement(preferance).isDisplayed()) {
	Reporter.log("preference is present");
System.out.println("preference is present");
driver.findElement(preferance).click();
Reporter.log("The title of the page is "+driver.getTitle());
System.out.println("The title of the page is "+driver.getTitle());

}
else {
	Reporter.log("preference is not present");
System.out.println("preference is not present");
}
Thread.sleep(1200);
driver.navigate().back();
Reporter.log("parefarance is working fine!");
System.out.println("parefarance is working fine!");
}
}