public class This01 {
	
	public static void main(String[] args) {
		
		Dog2 dog1 = new Dog2("koji", 3);
		dog1.info();
		
		
	}
}

class Dog2{

	String name;
	int age;
	
	// public Dog2(String dName, int dAge){
	// name = dName;
	// age = dAge;
	// }

	public Dog2(String name, int  age){
		//this.name
		this.name = name;
		
		//this.age
		this.age = age;
		
		System.out.println("this.hashCode=" + this.hashCode());
	}

	public void info(){
		System.out.println("this.hashCode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}
