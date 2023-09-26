package org.rough;

import java.util.Date;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AdactHotel extends BaseClass {


	@BeforeClass
	public static  void beforeclass() {
		chromebrowser();
		urllaunch("https://adactinhotelapp.com/BookedItinerary.php");
		implicitywait(10);
		maximize();
		
	}
	@BeforeMethod
	public void beforemethod() {
		Date d=new Date();
		System.out.println("test start time"+d);
	}
	
	@AfterClass
	public static void afterclass() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	@AfterMethod
	public void aftermethod() {
		Date d=new Date();
		System.out.println("test end time"+d);
	}
	
	@Test(enabled=false)
	private void test1() {
		
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("manimaddy007");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("9080955719");
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
		WebElement bin = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		bin.click();
		
		WebElement ser = driver.findElement(By.id("order_id_text"));
		ser.sendKeys("0T94J1380K");
		
		WebElement go = driver.findElement(By.id("search_hotel_id"));
		go.click();
		
		WebElement cli = driver.findElement(By.xpath("//input[@type='checkbox']"));
		cli.click();
		
		WebElement can = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		can.click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	@Test(enabled=false)
	private void test2() {
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("manimaddy007");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("9080955719");
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
		WebElement bin = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		bin.click();
	
		List<WebElement> table = driver.findElements(By.tagName("table"));
		WebElement tab = table.get(5);
		
		List<WebElement> row = tab.findElements(By.tagName("tr"));
		for(int i=0; i<row.size(); i++) {
			WebElement rows = row.get(i);
			System.out.println(rows.getText());
		}
		List<WebElement> head = tab.findElements(By.tagName("th"));
		
		List<WebElement> order = tab.findElements(By.xpath("//strong[text()='Order Id ']"));
	
	}
	@Ignore
	@Test(priority=1,invocationCount=1)
	private void test4() throws InterruptedException {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("manimaddy007");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("9080955719");
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
		WebElement bin = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		bin.click();
		
		List<WebElement> tab = driver.findElements(By.tagName("table"));
		int size = tab.size();
		System.out.println(size);
		WebElement sel = tab.get(5);
		List<WebElement> data = sel.findElements(By.tagName("td"));
		for(int i=0; i<data.size(); i++) {
			WebElement li = data.get(i);
		}
		Thread.sleep(3000);
        WebElement con = sel.findElement(By.xpath("//input[@name='btn_id_731390']"));
		if(data.contains(con.getText())) {
			click(con);
			Alert al = driver.switchTo().alert();
			al.accept();
		}
	}
	

	
	
	
	
	
	
	
	
}
