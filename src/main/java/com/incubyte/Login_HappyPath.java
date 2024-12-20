package com.incubyte;

import org.testng.annotations.Test;

import com.incubyte.testcases.LoginTestCases;

public class Login_HappyPath {
	@Test(priority=1)
	public static void HappyPath_TC01() throws Exception {
		LoginTestCases.registerFlow();
	}

	@Test(priority=2)
	public static void HappyPath_TC02() throws Exception {
		LoginTestCases.singInFlow();
	}

	@Test(priority=3)
	public static void HappyPath_TC03() throws Exception {
		LoginTestCases.singOutFlow();
	}
}
