public class ConstructorExercise {
	
	public static void main(String[] args) {
		
		PersonC p1 = new PersonC();
		
		// name = null, age = 18
		System.out.println("p1Information name=" + p1.name + " age=" + p1.age);

		PersonC p2 = new PersonC("scott", 50);
		
		//name = scott, age = 50
	    System.out.println("p2Information name=" + p2.name + " age=" + p2.age);

			}
		}

class PersonC {
	
	String name;
	int age;
	
	public PersonC() {
		age = 18;
		
	}
	
	public PersonC(String pName, int pAge) {
		name = pName;
		age = pAge;
		
		
	}
}