package org.test.group;

import org.testng.annotations.Test;

public class A {

	@Test(groups="smoke")
	private void testa1() {
		System.out.println("testa1");
	}
	@Test(groups="sanity")
	private void testa2() {
		System.out.println("testa2");
	}
	@Test(groups="regression")
	private void testa3() {
		System.out.println("testa3");
	}
	
	@Test(groups="retest")
	private void testa4() {
		System.out.println("testa4");
	}
	@Test(groups="smoke")
	private void testa5() {
		System.out.println("testa5");
	}
	@Test(groups="sanity")
	private void testa6() {
		System.out.println("testa6");
	}
	@Test(groups="regression")
	private void testa7() {
		System.out.println("testa7");
	}
	@Test
	private void testa8() {
		System.out.println("testa8");
	}
	@Test(groups="smoke")
	private void testa9() {
		System.out.println("testa9");
	}
	
	
	
	
	
	
	
	
	
}
