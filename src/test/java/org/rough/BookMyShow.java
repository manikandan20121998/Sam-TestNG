package org.rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class BookMyShow extends BaseClass{
	
	
	@BeforeClass
	public static  void beforeclass() {
		chromebrowser();
		urllaunch("https://in.bookmyshow.com/explore/home/chennai");
		implicitywait(10);
		maximize();
		
	}
	@BeforeMethod
	public void beforemethod() {
		Date d=new Date();
		System.out.println("test start time"+d);
	}
	
	@AfterClass
	public static void afterclass() {
		//driver.close();
	}
	@AfterMethod
	public void aftermethod() {
		Date d=new Date();
		System.out.println("test end time"+d);
	}
	
	@Test(priority=1,enabled=false)
	public void test1() throws InterruptedException, AWTException  {
		Thread.sleep(3000);
		WebElement ser = driver.findElement(By.id("4"));
		jeexecute(ser, "Love Today");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	@Test(priority=-4)
	public void test2() throws InterruptedException {
		Thread.sleep(3000);
		WebElement show = driver.findElement(By.xpath("(//div[@class='sc-1vmod7e-2 iBonLL'])[1]"));
		jeclick(show);
	}

	@Test(priority=-3)
	public void test3() throws InterruptedException {
        Thread.sleep(5000);
       WebElement pob = driver.findElement(By.id("wzrk-confirm"));
       pob.click();
       WebElement cli = driver.findElement(By.xpath("(//div[@class='__text'])[113]"));
	   scrolldown(cli);
    	jeclick(cli);
		
	}
	
	@Test(priority=-5)
	public void test4() {
		WebElement link = driver.findElement(By.xpath("//div[contains(text(),'Vendhu Thanindhathu Kaadu')]"));
		scrolldown(link);
		click(link);
	}

	@Test(priority=-2)
	private void test6() {
		WebElement ale = driver.findElement(By.id("btnPopupAccept"));
		ale.click();
	}
	@Test(priority=-1)
	private void test7() {
		WebElement sel = driver.findElement(By.id("proceed-Qty"));
		sel.click();
	}
	@Test(priority=1)
	private void test8() {
		WebElement s1 = driver.findElement(By.xpath("(//a[@class='_available'])[1]"));
		s1.click();
//		WebElement s2 = driver.findElement(By.xpath("(//a[@class='_available'])[2]"));
//		s2.click();
	}
	
	@Test(priority=2)
	private void test9() {
		WebElement pay = driver.findElement(By.id("btmcntbook"));
		jeclick(pay);
	}
	
	@Test(priority=3)
	private void test10() {
		WebElement tpay = driver.findElement(By.id("PayTotal"));
		scrolldown(tpay);
		jeclick(tpay);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
