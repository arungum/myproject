package org.tester;

public class EmployeeNotFoundException extends Exception {
	@Override
	public String getMessage() {
		String msg="emp id is not found";
		return msg;
	}

}
