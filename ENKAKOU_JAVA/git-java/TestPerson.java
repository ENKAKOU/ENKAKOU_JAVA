public class TestPerson { 
	
	public static void main(String[] args) {

		Person003 p11 = new Person003("mary", 20);
		Person003 p22 = new Person003("mary", 20);

		System.out.println("p11和p22比较的结果=" + p11.compareTo(p22));
	}
}

class Person003 {
	String name;
	int age;
	
	public Person003(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//compareTo比较方法
	public boolean compareTo(Person003 p) {
		
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}
