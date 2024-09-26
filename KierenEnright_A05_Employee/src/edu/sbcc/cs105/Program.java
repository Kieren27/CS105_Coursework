package edu.sbcc.cs105;

/**
 * This class tests the Employee object.
 *
 */
public class Program {

	/**
	 * Create an employee and test that the proper name has been created. Test the
	 * initial salary amount and then give the employee a raise. Then check to make
	 * sure the salary matches the raised salary.
	 * 
	 * 
	 * @param args command line values. Not used in this example.
	 */
	public static void main(String[] args) {

		// TODO write your test code here to make sure your class Employee works
		Employee e = new Employee("Kieren Enright", 100000);

		System.out.println("Employee Name: " + e.getName());
		System.out.println("Employee Salary: " + e.getSalary());

		e.raiseSalary(17);

		System.out.println(e.getName() + " gets a 17% raise: " + e.getSalary());
	}
}