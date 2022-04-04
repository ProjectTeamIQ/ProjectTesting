package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class sql {
WebDriver driver;
By xp=By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[3]/div[7]/div/div/a");
//constructor
public sql(WebDriver driver) {
this.driver=driver;
}

//for selecting testing course
public void sql_course() throws InterruptedException {
if(driver.findElement(xp).isDisplayed()) {
	Reporter.log("sql is present");
System.out.println("sql is present");
driver.findElement(xp).click();

}
else {
	Reporter.log("sql is not present");
System.out.println("sql is not present");
}
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
System.out.println("switching tabs");
driver.switchTo().window(nt.get(1));
Reporter.log("the title of the page is "+driver.getTitle());
System.out.println("the title of the page is "+driver.getTitle());
Thread.sleep(1500);
Reporter.log("sql is working fine");
System.out.println("sql is working fine");
System.out.println("closing");
driver.close();
driver.switchTo().window(nt.get(0));






}






}
