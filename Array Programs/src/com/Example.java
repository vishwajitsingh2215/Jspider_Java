package com;

class Example {
	public static void main(String[] args) {
		int[] a= {10,20,30};

		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}System.out.println("-------------------");
		String[] names= {"Luffy","Zoro","Sanji","Zimbei"};
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]);
		}
		}
}
