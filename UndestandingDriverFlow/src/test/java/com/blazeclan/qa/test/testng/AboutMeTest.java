package com.blazeclan.qa.test.testng;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.blazeclan.qa.pages.AboutMePage;
import com.blazeclan.qa.pages.LogoutPage;

public class AboutMeTest extends BaseTest {
	
	//this is about me page
	
	@Test(priority=3)
	public void AboutMe() throws InterruptedException {
		Thread.sleep(5000);
		 aboutmepage=new AboutMePage(driver);
		clickElement(aboutmepage.projectselectionicon);
		 clickElement(aboutmepage.projectname);
		// Thread.sleep(5000);
		 clickElement(aboutmepage.closeicon);
		// Thread.sleep(5000);
		 clickElement(aboutmepage.aboutmelink);
		 Thread.sleep(3000);
		 
		 Actions act =new Actions(driver);
		 act.dragAndDropBy(aboutmepage.sentimentfirstanswer, 99, 0).build().perform();
//	 slidingAction(aboutmepage.sentimentfirstanswer);
//	 slidingAction(aboutmepage.sentimentsecondanswer);
//	 slidingAction(aboutmepage.sentimentthirdanswer);
//	 slidingAction(aboutmepage.sentimentfourthanswer);
//	 slidingAction(aboutmepage.sentimentfifthanswer);
//	 slidingAction(aboutmepage.sentimentsixthanswer);
//	 
		 
		 
		 
		// clickElement(aboutmepage.sentimentseventhanswer);
		// aboutmepage.sentimentseventhanswer.sendKeys("Hi");
		 
		 
		 
		 
		 
		 
		
		
		
		
		
	}

}
