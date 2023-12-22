package klucenZborStatic;

public class Student {
	int index;
	String ime;
	static String fakultet = "ITS"; //staticna promenliva
	
	Student(int r, String n){
		
		index=r;
		ime=n;
	}
	void display() {
		System.out.println(index + " " + ime + " " + fakultet);
		
	}

	public static void main (String srgs[]) {
		
		Student s1=new Student(111, "Petar");
		Student s2=new Student(222, "Marko");
		s1.display();
		s2.display();
	}
}
