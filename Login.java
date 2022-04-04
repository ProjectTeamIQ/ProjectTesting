package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Login {
	WebDriver driver;
	By username=By.cssSelector("#username");
	By password=By.cssSelector("#password");
	By login=By.cssSelector("#loginbtn");
	By forgot=By.cssSelector("#login > div.forgetpass.float-left > a");
	
	public Login(WebDriver driver) {
		this.driver=driver;
		
	}
	public void login_lms(String uname, String pass) throws Exception {
		username(uname);
		Thread.sleep(1000);
		password(pass);
		Thread.sleep(1000);
		login_button();
		Reporter.log("Login verified done!");
		System.out.println("Login verified done!");
	}
	
	public void username(String uname) {
		System.out.println("Page title before login  is "+ driver.getTitle());
		if(driver.findElement(username).isDisplayed()) {
			Reporter.log("Username field is present.");
			System.out.println("Username field is present.");
			driver.findElement(username).sendKeys(uname);
		}else {
			Reporter.log("username field is not there plese try again");
			System.out.println("username field is not there plese try again");
		}
	}
	public void password(String pass) {
		if(driver.findElement(password).isDisplayed()) {
			Reporter.log("password field is present.");
			System.out.println("password field is present.");
			driver.findElement(password).sendKeys(pass);
		}else {
			Reporter.log("password field is not there plese try again");
			System.out.println("password field is not there plese try again");
		}
		if(driver.findElement(forgot).isDisplayed()) {
			Reporter.log("Forgot password option is present.");
			System.out.println("Forgot password option is present.");
		}else {
			Reporter.log("Forgot password option is not present.");

			System.out.println("Forgot password option is not present.");
		}
		

	}
	public void login_button() {
		if(driver.findElement(login).isDisplayed()) {
			Reporter.log("login button is present.");
			System.out.println("login button is present.");
			driver.findElement(login).click();
		}else {
			Reporter.log("login button is not there plese try again");
			System.out.println("login button is not there plese try again");
		}
		Reporter.log("Page title after login is "+driver.getTitle());
		System.out.println("Page title after login is "+driver.getTitle());
	}
	

}
