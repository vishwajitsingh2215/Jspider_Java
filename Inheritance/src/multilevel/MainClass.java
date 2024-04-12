package multilevel;

class MainClass {
	public static void main(String[] args) {
		Developer d = new Developer(); //Cause developer object can access all the properties
		System.out.println("Person name "+d.name);
		d.eat();
		System.out.println("Employee id "+d.id+" Company name : "+d.company);
		d.work();
	}
}
