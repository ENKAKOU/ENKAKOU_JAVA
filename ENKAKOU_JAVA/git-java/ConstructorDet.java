
public class ConstructorDet { 


	public static void main(String[] args) {
		PersonB p1 = new PersonB("king", 40);
		PersonB p2 = new PersonB("tom");

		Dog dog1 = new Dog();

	}
}
class Dog {
	
    /*  
     默认构造器   
     Dog() {
    }   
    */
    
	public Dog(String dName) {
		//...
	}
	Dog() {

	}
}

class PersonB {
	String name;
	int age;

	public PersonB(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	public PersonB(String pName) {
		name = pName;
	}
}