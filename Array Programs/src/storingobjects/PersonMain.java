package storingobjects;

class PersonMain {
	public static void main(String[] args) {
		Person p1= new Person(10);
		Person p2= new Person(20);
		Person[] p= {p1,p2}; 
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
			System.out.println(p[i].age);
		}
	}
}
