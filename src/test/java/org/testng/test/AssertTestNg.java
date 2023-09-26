package org.testng.test;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertTestNg extends BaseClass{
	public static LoginPage l;
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
		System.out.println("after class");
		quit();
	}
	
	@BeforeMethod
	private void beforemethod() {
		Date d=new Date();
		System.out.println("test start time "+d);
		
	}
	
	@AfterMethod
	private void aftermethod() {
		Date d=new Date();
		System.out.println("test end time "+d);
      
	}
	
	@Test(priority=1)
	private void test3() throws InterruptedException {
		urllaunch("https://www.facebook.com/");
		String cs = currenturl();
		boolean ct = cs.contains("facebook");
		SoftAssert s=new SoftAssert();
		s.assertTrue(ct, "verify url");
		Assert.assertTrue(ct);
		 l=new LoginPage();
		sendkeys(l.getUser(), "mani");
		String at = getattribute(l.getUser());
	//	SoftAssert getting failed
		s.assertEquals(at, "maddy", "VerifyUser");
		sendkeys(l.getPass(), "9098");
		String at1 = getattribute(l.getPass());
		s.assertEquals(at1, "7879");
		click(l.getLog());
		Thread.sleep(3000);
		String curl = currenturl();
		boolean contains = curl.contains("mani");
		s.assertTrue(contains, "VerifyURL");
		System.out.println("test3");
		
	}
	
	@Test(priority=0)
	private void test4() {
		System.out.println("test4");
	}
	
	
	
	
}
