package com;

class MobileMainClass {
	public static void main(String[] args) {
		Mobile m1= new Mobile("Apple",50000);
		Mobile m2= new Mobile("Samsung",40000);
		System.out.println("Cost of "+m1.brand+" is RS:"+m1.cost);
		System.out.println("Cost of "+m2.brand+" is RS:"+m2.cost);
		System.out.println();
	}
}
