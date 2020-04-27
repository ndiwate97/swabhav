package com.techlab.checked.exception;

public class UserDefinedCheckedExceptionTest {

	public static void main(String... arg) {
		try {
			throw new UserDefinedCheckedException("User defined Checked exception is thrown and handled.");
		} catch (UserDefinedCheckedException e) {
			System.err.println(e.getMessage());
		}

	}
}
