public class MethodExercise02 { 

	public static void main(String[] args) {
		
		Person006 p2 = new Person006();
		p2.name = "milan";
		p2.age = 100;
		
		MyTools006 tools = new MyTools006();
		Person006 p4 = tools.copyPerson(p2);
		
		System.out.println("p的属性 age=" + p4.age  + " 名字=" + p2.name);
		System.out.println("p2的属性 age=" + p4.age  + " 名字=" + p4.name);
		System.out.println(p2 == p4);
		

	}
}

class Person006 {
	String name;
	int age;
}

class MyTools006 {

	public Person006 copyPerson(Person006 p) {
		
		Person006 p2 = new Person006();
		p2.name = p.name; 
		p2.age = p.age; 
		return p2;
	}
}
