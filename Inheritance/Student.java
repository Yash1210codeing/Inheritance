package Inheritance;
public class Student {
	String name = "Yash";
	int age = 21;
	@Override
	public String toString() {
		//return "Hello";
		return this.name+" "+ this.age;
	}
}
