package storingobjects;



class CountryMain {
	public static void main(String[] args) {
		Country c1= new Country("India",146);
		Country c2= new Country("USA",20);
		Country[] c= {c1,c2};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].name+" has a population of "+c[i].population+" crores");
		}
		
		
	}
}
