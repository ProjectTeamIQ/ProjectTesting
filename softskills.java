package com.LMS.pages;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
//class
public class softskills {
WebDriver driver;
By comms=By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[3]/div[1]/div/div/a/strong");
By mod1=By.cssSelector("#section-outline-8 > a");
By top1=By.linkText("Adjectives and Adverbs...");
By content=By.xpath("//*[@id=\"module-579619\"]/div/div/div[2]/div[1]/a/img");
//constructro
public softskills(WebDriver driver) {
this.driver=driver;
}

//for selecting communications skills
public void comms() throws InterruptedException {
	if(driver.findElement(comms).isDisplayed()) {
		Reporter.log("Communication/Softskill option is present");
		System.out.println("Communication/Softskill option is present");
		driver.findElement(comms).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(nt.get(1));
		Reporter.log("Tiltle of the page is : "+driver.getTitle());
		System.out.println("Tiltle of the page is : "+driver.getTitle());
		module();
	}else {
		Reporter.log("Communication/Softskill option is not  present");
		System.out.println("Communication/Softskill option is not  present");
		Reporter.log("Tiltle of the page is : "+driver.getTitle());
		System.out.println("Tiltle of the page is : "+driver.getTitle());
	}}

//for selecting module
public void module() throws InterruptedException {
	if(driver.findElement(mod1).isDisplayed()) {
		Reporter.log("module in communication is displayed");
		System.out.println("module in communication is displayed");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(mod1).click();
		Reporter.log("Tiltle of the page is : "+driver.getTitle());
		System.out.println("Tiltle of the page is : "+driver.getTitle());
		topic();
	}else {
		Reporter.log("module in communication is not displayed");
		System.out.println("module in communication is not displayed");

	}}
//for selecting topic
public void topic() throws InterruptedException {
	if (driver.findElement(top1).isDisplayed()) {
		Reporter.log("Topic inside module is present");
		System.out.println("Topic inside module is present");
		Thread.sleep(1200);
		driver.findElement(top1).click();
		Reporter.log("Tiltle of the page is : "+driver.getTitle());
		System.out.println("Tiltle of the page is : "+driver.getTitle());
		cont();
	}
	else {
		Reporter.log("Topic inside module is present");
		System.out.println("Topic inside module is present");
		}
}
//for clicking on topic
public void cont() throws InterruptedException {
	if(driver.findElement(content).isDisplayed()) {
		Reporter.log("Content inside topic is present");
		System.out.println("Content inside topic is present");
		Thread.sleep(1200);
		driver.findElement(content).click();
		Reporter.log("Tiltle of the page is : "+driver.getTitle());
		System.out.println("Tiltle of the page is : "+driver.getTitle());
		Reporter.log("Comms is done");
		System.out.println("Comms is done");
		driver.close();
	}else {
		Reporter.log("Content inside topic is not present");
		System.out.println("Content inside topic is not present");
	}
//To come for home window
ArrayList <String> nt=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(nt.get(0));
}}
