package com.LMS.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
//class
public class Java {
WebDriver driver;
By java= By.cssSelector("#region-main > div > div > div > div.container-fluid.page__container > div.row.card-group-row > div:nth-child(3) > div > div > a");
By mod2=By.xpath("//*[@id=\"section-outline-1\"]/a");
By top1= By.linkText("Topic 1: Introduction to ...");
By seltop=By.xpath("//*[@id=\"module-579710\"]/div/div/div[2]/div/a/img");
//constructor
public Java(WebDriver driver) {
this.driver = driver;
}

//for clicking on java
public void java() throws Exception {
	if(driver.findElement(java).isDisplayed()) {
		Reporter.log("Java options is present");
		System.out.println("Java options is present");
		driver.findElement(java).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//for wait
		ArrayList <String> tabs= new ArrayList <String>(driver.getWindowHandles());//to get window handles
		driver.switchTo().window(tabs.get(1));// to switch window/tab
		Thread.sleep(1100);
		Reporter.log("Page Title is : "+driver.getTitle());
		System.out.println("Page Title is : "+driver.getTitle());
		module2();
	}else {
		Reporter.log("Java options is not present");
		System.out.println("Java options is not present");

	}

}

//for clicking on module
public void module2() throws InterruptedException {
	if(driver.findElement(mod2).isDisplayed()) {
		Reporter.log("module inside java is present");
		System.out.println("module inside java is present");
		driver.findElement(mod2).click();
		Thread.sleep(1100);
		Reporter.log("Page Title is : "+driver.getTitle());
		System.out.println("Page Title is : "+driver.getTitle());
		topic1();
	}else {
		Reporter.log("module inside java is not present");
		System.out.println("module inside java is not present");

	}

}

// for clicking on topic
public void topic1() throws InterruptedException {
	if(driver.findElement(top1).isDisplayed()) {
		Reporter.log("Topics inside module is present");
		System.out.println("Topics inside module is present");
		driver.findElement(top1).click();
		Reporter.log("Page Title is : "+driver.getTitle());
		System.out.println("Page Title is : "+driver.getTitle());
		Thread.sleep(1100);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,900)");
		topic1click();
	}else {
		Reporter.log("Topics inside module is not present");
		System.out.println("Topics inside module is not present");
		}
}

//for selecting topics
public void topic1click() {
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,900)");
	if(driver.findElement(seltop).isDisplayed()) {
		Reporter.log("Content inside topic is present");
		System.out.println("Content inside topic is present");
		driver.findElement(seltop).click();
		Reporter.log("Page Title is : "+driver.getTitle());
		System.out.println("Page Title is : "+driver.getTitle());
		Reporter.log("Java cource is done");
		System.out.println("Java course is done");
		driver.close();
	}else {
		Reporter.log("Content inside topic is not present");
		System.out.println("Content inside topic is not present");

	}
	//To come for home window
			ArrayList <String> nt1=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(nt1.get(0));
}
}