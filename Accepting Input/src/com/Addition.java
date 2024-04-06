package com;

import java.util.Scanner;

class Addition {
	static void add(int a, int b) {
		//		int sum=a+b;
		System.out.println("Sum = "+(a+b));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter first number: ");
			int a= sc.nextInt();
			System.out.println("Enter second number: ");
			int b= sc.nextInt();
			Addition.add(a, b);
			System.out.println("-------------------");
		}
		sc.close();
	}
}
