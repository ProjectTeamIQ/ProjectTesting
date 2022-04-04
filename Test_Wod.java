package com.LMS.Test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.LMS.pages.*;

public class Test_Wod {
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Exception  {
		 driver= helper.Browsers.getBrowsers("edge", "https://www.hcltss-lms.com/login/index.php");
	}
	@Test 
	public void verify_Wod() throws Exception {
		//checking login page
		Login log=new Login(driver);
		log.login_lms("LTTB0821448", "P@ssw0rd");
		
		
		//checking wod(Word of day)
		wod wo=new wod(driver);
		wo.wod_click();
		/*
		//checking induction
		induction ind=new induction(driver);
		ind.indassessment();
		ind.indHandbook();
		ind.ethics();
		
		//checking feedback form function
		feedback feed = new feedback(driver);
		feed.fb();
		
		//checking resources
		Resources res=new Resources(driver);
		res.VAlab();
		res.EngPrimer();
		
		
		//Checking score card
		scorecard score=new scorecard(driver);
		score.sc();
		
		//checking learning labs
		Learning_lab lab=new Learning_lab(driver);
		lab.learninglabs();	
		
		//checking chatbot
		chatbot chat=new chatbot(driver);
		chat.chat();
		
		//batch change
		batch_select batch = new batch_select(driver);
		batch.batch();
	
		//checking My workbook calender		
		MyWorkbookCalender calender=new MyWorkbookCalender(driver);
		calender.MyWorkbookcalender();
		
		//checking learning path
		Learning_path learning=new Learning_path(driver);
		learning.learning_path();
		
		//checking My Program Milestone
		MyProgramMilestones milestone=new MyProgramMilestones(driver);
		milestone.mile();
				
		
		//userbutton options check
		Option_userbutton user=new Option_userbutton(driver);
		user.Mylearning();
		user.profile();
		user.grades();
		user.messages();
		user.prefarance();
		
		//for again go back to dash board 
		Dashboard dash1=new Dashboard(driver);
		dash1.dashboard();
		
		// communication checking
		softskills skill=new softskills(driver);
		skill.comms();
		
		//Software Engineering checking
		SoftwareEng software=new SoftwareEng(driver);
		software.software();
		
		//Java checking
		Java jav=new Java(driver);
		jav.java();
		
		//ITP java checking
		ITP_java itp=new ITP_java(driver);
		itp.itp_java();
		
		//Testing checking
		Testing test=new Testing(driver);
		test.test();
		
		//project checking
		project pro=new project(driver);
		pro.proj();
		
		//Sql checking
		sql sq=new sql(driver);
		sq.sql_course();
		
		//doubt clering checking
		doubt_clearing_Session dob=new doubt_clearing_Session(driver);
		dob.dcs();
	
		
		//live connect checking
		Live_connect liv=new Live_connect(driver);
		liv.connect();
		
		
		
		//Assessment checking
		Assessments as=new Assessments(driver);
		as.asm();
		
		// month session calender checking
		months mo=new months(driver);
		mo.jan();
		
		//Term assessment checking
		Term_assessment_record rec=new Term_assessment_record(driver);
		rec.reocrd();
		
		//Communication assessment checking
		Communication_assessment_record rec2=new Communication_assessment_record(driver);
		rec2.reocrd();
		
		// Daily Quiz record checking
		Daily_quiz_record daily=new Daily_quiz_record(driver);
		daily.reocrd();
		
		// log out function check
				Logout log1 =new Logout(driver);
				log1.logout();	
		*/
		
					
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
