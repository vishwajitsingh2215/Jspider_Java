package programming;

import java.util.Scanner;

//Code to check the user input number whether Special Digit or not 

class SpecialDigit{
	public static void main(String[] args) {
		Scanner sp= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sp.nextInt();
		int d1= a/10;
		int d2= a%10;
		int sum = d1+d2+(d1*d2); //Logic for Special Two Digit number
		if(sum==a) {
			System.out.println(a+" is a Special Two Digit Number");
		}
		else {
			System.out.println(a+" is not a Special Two Digit Number");
		}
	}
}
