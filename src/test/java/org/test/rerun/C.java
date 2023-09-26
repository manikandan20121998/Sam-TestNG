package org.test.rerun;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C {
	
	
	@Parameters({"username","password"})
	@Test
	private void testc1(String user, String pass) {
		
		System.out.println(user);
		System.out.println(pass);
		System.out.println("testc1");
		
	}
	
	@Parameters("username")
	@Test
	private void testc2(String user) {
		System.out.println(user);
		System.out.println("testc2");
	}

	@Test
	private void testc3() {
		System.out.println("testc3");
	}
}
