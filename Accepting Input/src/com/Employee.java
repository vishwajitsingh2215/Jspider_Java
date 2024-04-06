package com;

import java.util.Scanner;

class Employee {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Id:");
		int id= sc.nextInt();
		System.out.println("Enter name:");
		String name= sc.next();
		System.out.println("Enter Salary:");
		int salary= sc.nextInt();
		System.out.println("Enter Gender --> 'M' for MALE & 'F' for FEMALE:");
		char gen= sc.next().charAt(0);
		sc.close();
		System.out.println("ID = "+id);
		System.out.println("NAME = "+name);
		System.out.println("SALARY = "+salary);
		System.out.println("GENDER = "+gen);
	}
}
