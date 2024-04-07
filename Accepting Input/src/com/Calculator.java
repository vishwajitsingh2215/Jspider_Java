package com;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the two numbers ");
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println("Enter '+' for add,'-' for subtraction and '%' for division");
			char c= sc.next().charAt(0);
			Calculator.calc(a, b, c);
			System.out.println("______________________");
		}
	}
	static void calc(int a,int b, char c) {
		switch(c) {
		case '+' :
			System.out.println("Sum of "+a+"+"+b+" = "+(a+b));
			break;
		case '-':
			System.out.println("Difference of "+a+" -"+b+" = "+(a-b));
			break;
		case '%':
			System.out.println("Remainder of "+a+" %"+b+" = "+(a%b));
			break;
		default:
			System.out.println("Entered invalid operator");
		}
	}
}
