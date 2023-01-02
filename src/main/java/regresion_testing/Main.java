package regresion_testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import dynamic_generator.DynamicGenerator;
import regresion_testing.configuration.ANSIConstants;

public class Main {

	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(DynamicGenerator.class);

		for (Failure fail : res.getFailures()) {
			System.out.println(fail.toString());
		}

		if (res.wasSuccessful())
			System.out.print(ANSIConstants.ANSI_BOLD + ANSIConstants.ANSI_GREEN
					+ "EXECUTION SUCCESSFUL " + ANSIConstants.ANSI_RESET);
		else
			System.out.print(ANSIConstants.ANSI_BOLD + ANSIConstants.ANSI_RED
					+ "EXECUTION NOT SUCCESSFUL " + ANSIConstants.ANSI_RESET);
	}

}