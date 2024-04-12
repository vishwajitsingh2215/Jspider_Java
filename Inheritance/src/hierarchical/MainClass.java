package hierarchical;

class MainClass {
	public static void main(String[] args) {
		Bike b = new Bike();
		System.out.println("Fuel type "+b.fuel);
		System.out.println("Cost:   "+b.cost);
		b.ride();
		System.out.println("_________________");
		Car c = new Car();
		System.out.println("Vehicle brand "+c.brand);
		System.out.println("Color "+c.color);
		c.drive();
	}

}
