package chapter07;

public class ThisHomeWork09{
	
	public static void main(String[] args){
		Circle2 c = new Circle2();
		PassObject01 po = new PassObject01();
		po.printAreas(c, 5);
		
	}
}

class Circle2{
	double radius;
	public Circle2() {

	}
	public Circle2(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI * radius * radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class PassObject01 {
	public void printAreas(Circle2 c, int times) {
		System.out.println("radius\tarea");
		for(int i = 1; i <= times; i++) {
			c.setRadius(i) ;
			System.out.println((double)i + "\t" + c.findArea());
		}
	}
}
