package com;

class Main {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Age "+p.age+" Name "+p.name);
		p.walk();
		Person2 p2 = new Person2();
		p2.park();
	}
}
