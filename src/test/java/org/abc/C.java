package org.abc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C {
	
	
	@Test
	private void testC1() {
		System.out.println("TestC1");
		System.out.println(Thread.currentThread());
	}
	@Test
	private void TestC2() {
		System.out.println("TestC2");
		System.out.println(Thread.currentThread());
	}
	@Test
	private void TestC3() {
		System.out.println("TestC3");
		System.out.println(Thread.currentThread());
	    
	}
	
}
