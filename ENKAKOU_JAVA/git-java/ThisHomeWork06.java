public class ThisHomeWork06 {
	
	public static void main(String[] args) {
		Cale cale = new Cale(2, 4);
		System.out.println("和=" + cale.sum());
		System.out.println("差=" + cale.minus());
		System.out.println("乘=" + cale.mul());
		Double divRes = cale.div();
		if(divRes != null) {
			System.out.println("除=" + divRes);
		} else {
			System.out.println("除数不能为0");
		}
	}
}

class Cale {
	double num1;
	double num2;
	public Cale(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	// 和
	public double sum() {
		return num1 + num2;
	}
	// 差
	public double minus() {
		return num1 - num2;
	}
	// 乘
	public double mul() {
		return num1 * num2;
	}
	// 除
	public Double div() {
		if(num2 == 0) {
			return null;
		} else {
			return num1 / num2;
		}
	}
}
