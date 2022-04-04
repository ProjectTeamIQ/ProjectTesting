package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Dashboard {
	WebDriver driver;
	By img= By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");
	By dashboard = By.linkText("Dashboard");
	
	
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	
	public void dashboard() throws InterruptedException {
		
		driver.findElement(img).click();
		Thread.sleep(1000);
		driver.findElement(dashboard).click();
			if(driver.findElement(dashboard).isDisplayed()) {
				Reporter.log("Dashboard option is dispalyed");
				System.out.println("Dashboard option is dispalyed.");
				System.out.println("Page title is:"+driver.getTitle());

			}else {
				Reporter.log("Dashboard option is not dispalyed please try again");
				System.out.println("Dashboard option is not dispalyed please try again");
				System.out.println("Page title is:"+driver.getTitle());
			}
		
	}

}
