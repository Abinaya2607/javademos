package lesson2constructors;
class Student {
	int id;
	String name;
	String dep;
	Student(int i, String n,String j) {
		id = i;
		name = n;
		dep = j;
	}
	void display() {
		System.out.println("Name "+ name + " id " + id+ " department "+ dep);
	}
}
public class paramConstrDemo {
	public static void main(String[] args) {
		Student std1 = new Student(23,"Raja","EEE");
		Student std2 = new Student(10, "Annie","ECE");
		std1.display();
		std2.display();
	}
}
