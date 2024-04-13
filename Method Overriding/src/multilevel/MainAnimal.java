package multilevel;

class MainAnimal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.speak(); // it will access super class too
		System.out.println("____________");
		Puppy p = new Puppy();
		p.speak(); //It will access Dog class methods and its super class too 
	}
}
