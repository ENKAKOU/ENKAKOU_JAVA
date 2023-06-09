package chapter05;

public class Stars {

	public static void main(String[] args) {
	
		int totalLevel = 20; //层数
		for(int i = 1; i <= totalLevel; i++) { //i 表示层数

			//在输出*之前，还有输出 对应空格 = 总层数-当前层
			for(int k = 1; k <= totalLevel - i; k++ ) {
				System.out.print(" ");
			}

			//控制打印每层的*个数
			for(int j = 1;j <= 2 * i - 1;j++) {
				//当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				} else { //其他情况输出空格
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
}
