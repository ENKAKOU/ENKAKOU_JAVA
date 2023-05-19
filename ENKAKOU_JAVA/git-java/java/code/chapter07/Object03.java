package java.code.chapter07;

public class Object03 {

	public static void main(String[] args) {

		Person005 p1=new Person005();
		p1.age=10;
		p1.name="小明";
		Person005 p2=p1;
		System.out.println(p2.age); // 10
		
	
	}
}

class Person005 {
	String name;
	int age; 
}
