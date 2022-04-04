package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

//class
public class Assessments {
boolean flag1=true,flag2=true,flag3=true;
WebDriver driver;
By assess=By.linkText("Go");
By mod1=By.linkText("Assessment 1");
By content=By.linkText("TTT_C&PST_TB_QUIZ_WEEK_15");
//constructor
public Assessments(WebDriver driver) {
this.driver=driver;
}

//for selecting assessment course
public void asm() throws InterruptedException {
if(driver.findElement(assess).isDisplayed()) {
Reporter.log("Assessment is present");
System.out.println("Assessment is present");
driver.findElement(assess).click();
}
else {
	Reporter.log("Assessment is not present");
System.out.println("Assessment is not present");
flag1=false;
}
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
System.out.println("switching tabs");
ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(nt.get(1));
System.out.println("the title of the page is "+driver.getTitle());
module();
}



//for selecting module
public void module() throws InterruptedException {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
if(driver.findElement(mod1).isDisplayed()) {
	Reporter.log("module is present");
System.out.println("Module is present");
driver.findElement(mod1).click();
System.out.println("the title of the page is "+driver.getTitle());

}
else {
	Reporter.log("module is not present");
System.out.println("Module is not present");
flag2=false;
}
topic();
}





//for selecting content
public void topic() throws InterruptedException {
Thread.sleep(1200);
if(driver.findElement(content).isDisplayed()) {
	Reporter.log("Content  is present");
System.out.println("the content is present");
driver.findElement(content).click();
System.out.println("the title of the page is "+driver.getTitle());

}
else {
	Reporter.log("Content is not present");
System.out.println("the content is not present");
flag3=false;
}
if(flag1==true && flag2==true && flag3==true) {
	Reporter.log("assessment is working fine");
System.out.println("assessment is working fine");
}
else {
	Reporter.log("assessment is not working fine");
System.out.println("assessment is not working fine");
}
driver.close();
ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(nt.get(0));
}







}
