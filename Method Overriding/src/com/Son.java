package com;

class Son extends Father {
	@Override
	void bike() {
		System.out.println("New modified bike of Son");
	}
	public static void main(String[] args) {
		Son s= new Son();
		s.bike();
	}

}
