package com;
import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		sc.close();
		int sum= a+b;
		System.out.println("Sum of : "+a+" and : "+b+" = "+sum);
	}
}
