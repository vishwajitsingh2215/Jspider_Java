package com;

import java.util.Scanner;

class PosNeg {
	static void CheckPosOrNeg(int num) {
		if(num>=0) {
			System.out.println(num+" is a Positive number");
		}else
		{
			System.out.println(num+" is an Negative number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter number :");
			PosNeg.CheckPosOrNeg(sc.nextInt());
		}
		sc.close();
	}
}
