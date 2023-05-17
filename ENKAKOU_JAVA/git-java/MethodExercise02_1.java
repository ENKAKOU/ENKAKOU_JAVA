public class MethodExercise02_1{
	public static void main(String[] args) {
		
	Person009 p = new Person009();
	p.name = "milan";
	p.age = 100;
	
	MyTools003 tools = new MyTools003();
	Person009 p2 = tools.copyPerson(p);
	
	// p 和 p2 是person 两个独立对象
	System.out.println("P的属性 age=" + p.age + "名字=" + p.name);
	System.out.println("P2的属性 age=" + p2.age + "名字=" + p2.name);
	
		
	}
}

class Person009{
	String name;
	int age;
	
}

class MyTools003{
	
	
public Person009 copyPerson(Person009 p) {
	
	//创建一个新的对象
	Person009 p2 = new Person009();
	p2.name = p.name;
	p2.age = p.age;
	
	return p2;
	
   }
}
