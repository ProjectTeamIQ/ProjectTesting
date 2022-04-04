package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class doubt_clearing_Session {
WebDriver driver;
By Test=By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[3]/div[8]/div/div/a");
//constructor
public doubt_clearing_Session(WebDriver driver) {
this.driver=driver;
}

//for selecting dcs course
public void dcs() throws InterruptedException {
	if(driver.findElement(Test).isDisplayed()) {
		Reporter.log("Doubt Clearing session option is present");
		System.out.println("Doubt Clearing session option is present");
		driver.findElement(Test).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(nt.get(1));
		Thread.sleep(1500);
		System.out.println("Page title is : "+driver.getTitle());
		Reporter.log("Doubt clearing session is done");
		System.out.println("Doubt clearing session is done");
		driver.close();
		driver.switchTo().window(nt.get(0));
	}else {
		Reporter.log("Doubt Clearing session option is not present");
		System.out.println("Doubt Clearing session option is not present");
	}

}

}
