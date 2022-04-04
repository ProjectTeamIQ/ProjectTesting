package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class batch_select {
WebDriver driver;

public batch_select(WebDriver driver) {
super();
this.driver = driver;
}

By name=By.name("programid");
By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");

//batch selection
public void batch() throws InterruptedException {
Thread.sleep(1200);
driver.findElement(img).click();
String title=driver.getTitle();
System.out.println("The title of the page is "+title);
if(driver.findElement(name).isDisplayed()) {
	Reporter.log("dropdown is present");
System.out.println("dropdown is present");
Select dropdown=new Select(driver.findElement(name));
dropdown.selectByVisibleText("TECHBEE_OND21_ERS_COM_TESTING_3");
Reporter.log("option is selected");
System.out.println("option is selected");
}
else {
	Reporter.log("dropdown is not present");

System.out.println("dropdown is not present");
}
Reporter.log("batch selection is done");

System.out.println("batch selection is done");

}}