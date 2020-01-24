package com.learning.junit4.test;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TestCommonListener extends RunListener {
	/**
	 * Called before any tests have been run.
	 * */
	public void testRunStarted(Description description)
			throws java.lang.Exception {
		System.out
				.println("===================================================");
		System.out
				.println("TestCommonListener : Total Number of tests to execute : "
						+ description.testCount());
	}

	/**
	 * Called when all tests have finished
	 * */
	public void testRunFinished(Result result) throws java.lang.Exception {
		System.out
				.println("TestCommonListener : Total Number of tests executed : "
						+ result.getRunCount());
		System.out
				.println("TestCommonListener : Total Number of tests failed : "
						+ result.getFailureCount());
		System.out
				.println("TestCommonListener : Total Number of tests ignored : "
						+ result.getIgnoreCount());
		System.out
				.println("===================================================");
	}

	/**
	 * Called when an atomic test is about to be started.
	 * */
	public void testStarted(Description description) throws java.lang.Exception {
		System.out
				.println("---------------------------------------------------");
		System.out
				.println("TestCommonListener : Starting execution of test case : "
						+ description.getMethodName());
	}

	/**
	 * Called when an atomic test has finished, whether the test succeeds or
	 * fails.
	 * */
	public void testFinished(Description description)
			throws java.lang.Exception {
		System.out
				.println("TestCommonListener : Finished execution of test case : "
						+ description.getMethodName());
		System.out
				.println("---------------------------------------------------");
	}

	/**
	 * Called when an atomic test fails.
	 * */
	public void testFailure(Failure failure) throws java.lang.Exception {
		System.out
				.println("****************************************************");
		System.out
				.println("TestCommonListener : Execution of test case failed : "
						+ failure.getMessage());
	}

	/**
	 * Called when a test will not be run, generally because a test method is
	 * annotated with Ignore.
	 * */
	public void testIgnored(Description description) throws java.lang.Exception {
		System.out
				.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out
				.println("TestCommonListener : Execution of test case ignored : "
						+ description.getMethodName());
	}
}