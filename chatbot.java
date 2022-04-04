package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;



public class chatbot {
WebDriver driver;



public chatbot(WebDriver driver) {
super();
this.driver = driver;
}
By link=By.linkText("Chatbot");
//Chatbot opening
public void chat() throws InterruptedException {
	if(driver.findElement(link).isDisplayed()) {
		Reporter.log("ChatBot option is displayed.");
		System.out.println("ChatBot option is displayed.");
		driver.findElement(link).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Reporter.log("Chatbot is done");

		System.out.println("Chatbot is done");
	}else {
		Reporter.log("ChatBot option is not displayed.");

		System.out.println("ChatBot option is not displayed.");
		}
	

}}