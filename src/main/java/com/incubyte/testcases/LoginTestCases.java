package com.incubyte.testcases;

import com.incubyte.utility.LoginUtility;

public class LoginTestCases {

	public static void registerFlow() throws Exception {
		LoginUtility.initializeDriver("Chrome");
		LoginUtility.clickOnRegisterLink();
		LoginUtility.provideRegistrationDetails();
	}

	public static void singInFlow() throws Exception {
		LoginUtility.provideDetailsAndSignIn();
	}

	public static void singOutFlow() {
		LoginUtility.signOut();
	}
}