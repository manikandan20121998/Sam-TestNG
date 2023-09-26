package org.test.rerun;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(WithoutKnownFailed.class)
public class A {
	
	
	
	@Test
	private void testa1() {
      System.out.println("testa1");
	}
	
	@Test(retryAnalyzer=WithKnownFailed.class)
	private void testa2() {
		Scanner s=new Scanner(System.in);
		System.out.println("testa2");
		boolean bol = s.nextBoolean();
		Assert.assertTrue(bol);
		
	}
	@Test
	private void testa3() {
		System.out.println("testa3");
	}

}
