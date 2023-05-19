package java.code.chapter08;

public class ConstructorDetail {
	
	public static void main(String[] args) {
		Person02 p1 = new Person02("king", 40);
		Person02 p2 = new Person02("tom");

		Dog02 dog1 = new Dog02();

	}
}
class Dog02 {
	public Dog02(String dName) {
	}
	Dog02() {

	}
}

class Person02 {
	String name;
	int age;

	public Person02(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	public Person02(String pName) {
		name = pName;
	}
}
