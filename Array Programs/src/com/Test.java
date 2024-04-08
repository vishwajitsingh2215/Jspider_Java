package com;

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		for(int i=0;i<a.length;i++) {
			System.out.println(i+"-->"+a[i]);
		}
		System.out.println("-----------");
		String[] subjects= {"Apti","Java","Sql"};
		for(int i=0;i<subjects.length;i++) {
			System.out.println(i+"-->"+subjects[i]);
		}
		System.out.println("_____________________");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size for array");
		int size= sc.nextInt();
		String[] sub = new String[size];
		System.out.println("Enter  "+size+" subjects name");
		for(int i=0;i<size;i++) {
			sub[i]= sc.next();
		}
		System.out.println("Here is the Subjects");
		for(int i=0;i<sub.length;i++) {
			System.out.println("Subject : "+sub[i]+" ");
		}sc.close();
	}
}
