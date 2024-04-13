package multilevel;

class Puppy extends Dog {
	@Override
	void speak() {
		super.speak(); //access its super class i.e Dog
		System.out.println("Puppy makes cute sounds");
	}
}
