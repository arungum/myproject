package org.tester;

public class company {
	private void add() throws EmployeeNotFoundException {
		throw new EmployeeNotFoundException();

	}
public static void main(String[] args) throws EmployeeNotFoundException {
	company c=new company();
	c.add();
	
}
}
