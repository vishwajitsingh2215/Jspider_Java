package com;

import java.util.Scanner;

class Solution {
	static void Check(int num) {
		if(num%2==0) {
			System.out.println(num+" is Even number");
		}
		else {
			System.out.println(num+" is Odd number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter number to check Even or Odd= ");
			Solution.Check(sc.nextInt());
//			int num= sc.nextInt();
//			Solution.Check(num);
			}
		sc.close();
	}
}
