/**
 * 
 */
package com.myfamily.clan;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author gaurav_amritkar
 *
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestClan.class);
		
		System.out.println("Run Time : "+result.getRunTime());
		System.out.println("Run Count : "+result.getRunCount());
		System.out.println("Failure Count : "+result.getFailureCount());
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Overall Result : "+result.wasSuccessful());

	}

}
