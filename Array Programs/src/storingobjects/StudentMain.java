package storingobjects;

class StudentMain {
	public static void main(String[] args) {
		Student s1= new Student("Luffy",50);
		Student s2=new Student("Zoro",65);
		Student[] s= {s1,s2};
		for(int i=s.length-1;i>=0;i--) {
			System.out.println(s[i].name+" has scored "+s[i].marks);
		}
	}
}
