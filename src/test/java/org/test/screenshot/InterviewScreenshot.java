package org.test.screenshot;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InterviewScreenshot extends BaseClass {


	@BeforeClass
	private void beforeclass() {
		chromebrowser();
		urllaunch("https://www.facebook.com/");
		implicitywait(10);
		maximize();
		System.out.println("beforeclass");
		
	}
	
	@AfterClass
	private void afterclass() {
		driver.close();
		System.out.println("after class");
	}
	
	@BeforeMethod
	private void beforemethod() {
		Date d=new Date();
		System.out.println("test start time "+d);
		
	}
	
	@AfterMethod
	private void aftermethod(ITestResult r) throws IOException {
		String name = r.getName();
		int status = r.getStatus();
		if(status==2) {
		screenshottestng("login" +name);
		}
		else if(status==1) {
			screenshottestng("passed"+name);
		}
		Date d=new Date();
		System.out.println("test end time "+d); 
	}
	@Test(priority=-7)
	public void test5() throws InterruptedException, IOException {
        driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement createbtn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		jeclick(createbtn);
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("mani");
		
		Assert.assertTrue(true);
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("maddy");
		
		WebElement cre = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		jeclick(cre);
		screenshottestng("register");
		
		System.out.println("test5");
		
		
	}	
}
