package java.code.chapter07;

public class ThisDetail {
	
	public static void main(String[] args) {
		PersonD p1 = new PersonD("mary",20);
		PersonD p2 = new PersonD("mary",20);
		
		System.out.println("p1 和 p2 比较的结果=" + p1.compareTo(p2));
		
		
	}
}

class PersonD {

	String name;
	int age;
    
	//构造器
public PersonD(String name, int age) {

	this.name = name;
	this.age = age;
}
    //compareTo 比较方法

public boolean compareTo(PersonD p) {
    //名字和年龄完全一样
    // if(this.name.equals(p.name) && this.age == p.age) {
    // return true;
    // } else {
    // return false;
    // }

	return this.name.equals(p.name) && this.age == p.age;
    }

}