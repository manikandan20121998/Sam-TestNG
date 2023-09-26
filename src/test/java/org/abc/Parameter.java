package org.abc;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Parameters({"Username","password"})
	@Test
	private void TestA1(@Optional("maddy")String user,@Optional("0077")String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println("TestA1");
	}
	
	@Parameters("username")
	@Test
	private void TestA2(@Optional("raja")String user) {
		System.out.println(user);
		System.out.println("TestA2");
	}
	
	@Test
	private void TestA3() {
		System.out.println("TestA3");
	}

}
