public class Homework13 { 
	
	public static void main(String[] args) {

		Circle02 c2 = new Circle02();
		PassObject po = new PassObject();
		po.printAreas(c2, 5);
	}
}


class Circle02 {
	double radius;
	public Circle02() {

	}
	public Circle02(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI * radius * radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class PassObject {
	public void printAreas(Circle02 c2, int times) {
		System.out.println("radius\tarea");
		for(int i = 1; i <= times; i++) {
			c2.setRadius(i) ;
			System.out.println((double)i + "\t" + c2.findArea());
		}
	}
}
