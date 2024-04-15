package com;
//Accessing public members inside same class 
public class Student {
	public int age=23;
	public String name ="TOM";
	public static void study() {
		System.out.println("Studying Java");
	}
	public static void main(String[] args) {
		Student s= new Student();
		System.out.println("Age :"+s.age+" Name :"+s.name);
		study(); //Student.study();
	}
}
