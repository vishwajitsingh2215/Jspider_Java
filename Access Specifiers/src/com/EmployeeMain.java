package com;
//Accessing public members in the different class but in the same package
public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("Id: "+Employee.id);
		Employee ep= new Employee();
		ep.work();
	}
}
