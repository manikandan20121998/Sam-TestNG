package org.test.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithKnownFailed implements IRetryAnalyzer{

	int mincount=0,maxcount=5;
	
	@Override
	public boolean retry(ITestResult result) {
		if (mincount<maxcount) {//0<5
			mincount++;
		return true;//test fail/condition true
	
}
   return false;//testpass/condition false
	}
	
	
}
	