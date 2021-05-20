package Testing_Loggers;

//import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestFailure;

public class JunitClassRunner {
	
	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(JunitJarFile.class,AssertClass.class);
		for(Failure failure : res.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result=="+res.wasSuccessful());
	}

}
