public class MethodExercise02_1{
	public static void main(String[] args) {
		
	Person p = new Person();
	p.name = "milan";
	p.age = 100;
	
	MyTools tools = new MyTools();
	Person p2 = tools.copyPerson(p);
	
	// p 和 p2 是person 两个独立对象
	System.out.println("P的属性 age=" + p.age + "名字=" + p.name);
	System.out.println("P2的属性 age=" + p2.age + "名字=" + p2.name);
	
		
	}
}

class Person{
	String name;
	int age;
	
}

class MyTools{
	
	
public Person copyPerson(Person p) {
	
	//创建一个新的对象
	Person p2 = new Person();
	p2.name = p.name;
	p2.age = p.age;
	
	return p2;
	
   }
}
