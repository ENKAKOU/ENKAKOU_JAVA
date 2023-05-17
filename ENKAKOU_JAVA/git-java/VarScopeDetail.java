
public class VarScopeDetail { 


	public static void main(String[] args) {
		PersonT p1 = new PersonT();

		WWT t1 = new WWT();
		t1.test();

		t1.test2(p1);

	}
}

class WWT {

	public void test() {
		PersonT p1 = new PersonT();
		System.out.println(p1.name);   //jack
	}

	public void test2(PersonT p) {
		System.out.println(p.name);   //jack
	}
}

class PersonT {

	public int age = 20;

	String name = "jack";

	public void say() {

		String name = "king";
		System.out.println("say() name=" + name);
	}

	public void hi() {
		String address = "BEI JING";

		String name = "hsp";
	}
}