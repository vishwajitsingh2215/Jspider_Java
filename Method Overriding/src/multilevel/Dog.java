package multilevel;

class Dog extends Animal {
	@Override
	void speak() {
		super.speak(); // access its super class i.e Animal
		System.out.println("Dog barks ");
	}


}
