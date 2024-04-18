package com;

class Employee {
	Employee(int id){
		this(5000.5);
		System.out.println("Id is :"+ id);
	}
	Employee(String name, int age){
		
		System.out.println("Name :"+name+" Age :"+age);
	}
	Employee(double salary){
		this("Luffy",24);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		Employee ep= new Employee(25);
	}
}
