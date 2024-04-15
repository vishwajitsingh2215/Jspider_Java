package org;
import com.Mobile;
//Accessing public members in different package.
public class MainMobile {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println("Brand: "+ m.brand);
		System.out.println("Cost: "+ m.cost);
		Mobile.call();
	}
}
