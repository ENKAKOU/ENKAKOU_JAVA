public class Constructor01 {
	
	public static void main(String[] args) {
		
		PersonA p1 = new PersonA("smith", 80);
		System.out.println("p1 的信息如下");
		System.out.println("p1 对象 name=" + p1.name);
		System.out.println("p1 对象 age=" + p1.age);
	}
}

class PersonA{
	String name;
	int age;
	
	public PersonA(String pName, int pAge) {
		System.out.println("The constructor is being called.");
		
		name = pName;
		age = pAge;
		
	}
	
}
