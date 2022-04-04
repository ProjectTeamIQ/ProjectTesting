package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;



public class feedback {
WebDriver driver;



public feedback(WebDriver driver) {
super();
this.driver = driver;
}

By feedback= By.linkText("Feedback");


// open feedback form
public void fb() throws Exception {
WebElement fb=driver.findElement(feedback);
if(fb.isDisplayed()) {
	Reporter.log("feedback form is displayed");
	System.out.println("feedback form is displayed");
	Thread.sleep(1000);
	fb.click();
	Thread.sleep(1000);
	dropdowns();
	
	
	driver.navigate().back();
}else {
	Reporter.log("Feedback form is not displayed. Please try again!");
	System.out.println("Feedback form is not displayed. Please try again!");
	System.out.println("Title of the page is :"+ driver.getTitle());
	driver.navigate().back();
}}

By img=By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/nav/div[1]/a/img");
By course=By.cssSelector("#crs");
By week_no=By.cssSelector("#wks");
By trainer=By.cssSelector("#trn");
By q1=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[5]");
By q2=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[9]");
By q3=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[13]");
By q4=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[17]");
By q5=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[21]");
By q6=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[27]");
By q7=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[33]");
By trainerComment=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/textarea[1]");

//selecting drowdowns
public void dropdowns() throws Exception {
if(driver.findElement(course).isDisplayed()) {
	Reporter.log("course dropdown is present");
System.out.println("course dropdown is present");
WebElement course_selection=driver.findElement(course);
Select drp1=new Select(course_selection);
Thread.sleep(1000);
drp1.selectByValue("Testing");
}
if(driver.findElement(week_no).isDisplayed()) {
	Reporter.log("week dropdown is present");

System.out.println("week dropdown is present");
WebElement week_selection=driver.findElement(week_no);
Thread.sleep(1000);
Select drp2=new Select(week_selection);
drp2.selectByVisibleText("Week15");
}
if(driver.findElement(trainer).isDisplayed()) {
	Reporter.log("Trainer dropedown is present");

System.out.println("Trainer dropedown is present");
Thread.sleep(1000);
WebElement trainer_selection=driver.findElement(trainer);
Select drp3=new Select(trainer_selection);
drp3.selectByValue("Nageswarrao");
}
feedack_on_trainer();
}


//For feedback on trainer
public void feedack_on_trainer() throws Exception {
if(driver.findElement(q1).isDisplayed()) {
	Reporter.log("Radio button 1 is present");
System.out.println("Radio button 1 is present");
driver.findElement(q1).click();
Thread.sleep(1500);
}
if(driver.findElement(q2).isDisplayed()) {
	Reporter.log("Radio button 2 is present");
System.out.println("Radio button 2 is present");
driver.findElement(q2).click();
Thread.sleep(1500);
}
if(driver.findElement(q3).isDisplayed()) {
	Reporter.log("Radio button 3 is present");
System.out.println("Radio button 3 is present");
driver.findElement(q3).click();
Thread.sleep(1500);
}
if(driver.findElement(q4).isDisplayed()) {
	Reporter.log("Radio button 4 is present");
System.out.println("Radio button 4 is present");
driver.findElement(q4).click();
Thread.sleep(1500);
}
if(driver.findElement(q5).isDisplayed()) {
	Reporter.log("Radio button 5 is present");
System.out.println("Radio button 5 is present");
driver.findElement(q5).click();
Thread.sleep(1500);
}
if(driver.findElement(q6).isDisplayed()) {
	Reporter.log("Radio button 6 is present");
System.out.println("Radio button 6 is present");
driver.findElement(q6).click();
Thread.sleep(1500);
}
if(driver.findElement(q7).isDisplayed()) {
	Reporter.log("Radio button 7 is present");
System.out.println("Radio button 7 is present");
driver.findElement(q7).click();
}
if(driver.findElement(trainerComment).isDisplayed()) {
	Reporter.log("Comment box for trainer is present");
	System.out.println("Comment box for trainer is present");
	driver.findElement(trainerComment).sendKeys("Good");
}
content();
}

//For feedback to content
By cont5=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[40]");
By cont4 = By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[44]");
By cont3 =By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[48]");
By cont2 =By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[52]");
By cont1 =By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[56]");
By contentcomment=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/textarea[2]");




public void content() throws Exception {
	if(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/legend[2]/a")).isDisplayed()) {
		Reporter.log("Feedback On content is displayed.");
		System.out.println("Feedback On content is displayed.");
		driver.findElement(cont5).click();
		Thread.sleep(1000);
		driver.findElement(cont4).click();
		Thread.sleep(1000);
		driver.findElement(cont3).click();
		Thread.sleep(1000);
		driver.findElement(cont2).click();
		Thread.sleep(1000);
		driver.findElement(cont1).click();
		Thread.sleep(1000);
		if(driver.findElement(contentcomment).isDisplayed()) {
			Reporter.log("Commnet box of content feedback is shown");
			System.out.println("Commnet box of content feedback is shown ");
			driver.findElement(contentcomment).sendKeys("Good and Relevent to topic");
			System.out.println("Text in comment box is "+driver.findElement(contentcomment).getText());
		}else {
			Reporter.log("Comment box of content feedback is not shown. Please refresh and try again.");
			System.out.println("Comment box of content feedback is not shown. Please refresh and try again.");
		}
	}else {
		Reporter.log("Feedback on Content is not Displayed. Please refesh page and try again.");
		System.out.println("Feedback on Content is not Displayed. Please refesh page and try again.");
	}
	lms();
}

// For feedback to lms

By lms5=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[65]");
By lms4=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[69]");
By lms3=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/input[73]");
By lmscomment=By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/textarea[3]");

public void lms() throws Exception {
	if(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/legend[3]/a")).isDisplayed()) {
		Reporter.log("Feedback on Lms is displayed");
		System.out.println("Feedback on Lms is displayed");
		driver.findElement(lms5).click();
		Thread.sleep(1000);
		driver.findElement(lms4).click();
		Thread.sleep(1000);
		driver.findElement(lms3).click();
		Thread.sleep(1000);
			if(driver.findElement(lmscomment).isDisplayed()) {
				Reporter.log("Lms comment box is displayed.");
				System.out.println("Lms comment box is displayed.");
				driver.findElement(lmscomment).sendKeys("Working fine.");
				Reporter.log("Text in comment box is "+driver.findElement(lmscomment).getText());
				System.out.println("Text in comment box is "+driver.findElement(lmscomment).getText());
			}else {
				Reporter.log("LMS comment box is not displayed.");
				System.out.println("LMS comment box is not displayed.");
			}
			if(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/p[24]/input")).isDisplayed()){
				Reporter.log("Submit button displayed.");
				System.out.println("Submit button displayed.");
				Reporter.log("Title of the page is :"+ driver.getTitle());
				System.out.println("Title of the page is :"+ driver.getTitle());
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/section/div/form/p[24]/input")).click();
			}else {
				Reporter.log("submit button is not displayed");
				System.out.println("submit button is not displayed");}
		}else {
			Reporter.log("submit button is not displayed");
		System.out.println("Feedback on lms is not displayed. Please refresh and try again.");
	}
}


}
