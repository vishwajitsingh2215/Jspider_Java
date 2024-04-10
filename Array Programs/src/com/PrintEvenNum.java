package com;

class PrintEvenNum {
	public static void main(String[] args) {
		int[] a = {10,13,15,18,25,20,30};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Even numbers are :"+a[i]);
			}
			

		}
		
	}
}
