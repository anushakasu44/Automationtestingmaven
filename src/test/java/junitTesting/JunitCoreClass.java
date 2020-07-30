package junitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitCoreClass {

	public void runnerclass() {
	Result result= JUnitCore.runClasses(JUnitLogin.class);
	System.out.println("run count is "+result.getRunCount());
	System.out.println("Failure count is"+result.getFailureCount());
	System.out.println("ignore count is"+result.getIgnoreCount());
	System.out.println("runtime is "+result.getRunTime());
	
	for(Failure fail:result.getFailures()) {
		System.out.println(fail.getMessage());
	}
	
}
}
