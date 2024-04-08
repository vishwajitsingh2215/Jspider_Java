package com;

class Demo {
	public static void main(String[] args) {
		//Array Declaration
		int[] a ;
		//Array Creation
		a= new int[3];
		//Printing array elements with default values
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("----------");
		//Array initialization
		a[0]=10;
		a[1]=30;
		a[2]=50;
		//Printing elements with initialized values
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("======");
		// Array declaration and creation
		double[] y = new double[2];
		y[0]=20.5;
		y[1]=8.9;
		System.out.println(y[0]+" "+y[1]);
		// Array declaration and initialization
		double[] x= {2.4,3.5};
		System.out.println(x[0]);
		System.out.println(x[1]);


	}
}
