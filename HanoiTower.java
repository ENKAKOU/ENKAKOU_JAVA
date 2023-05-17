public class HanoiTower {
	
	// main 方法
	public static void main(String[] args) {
		
		Tower tower = new Tower();
		tower.move(5,  'A', 'B', 'C');
		
	}
} 

class Tower {
	
	// num 移动个数，a,b,c, is : A Tower; B Tower; C Tower; 
	public void move(int num, char a, char b, char c) {
		
		if(num == 1) {
			System.out.println(a + "->" + c);
			
		} else {
			move(num -1,a,c,b);  // 先移动上面所有的盘到b，借助 c
			System.out.println(a + "->" + c);  // 最下面的盘，移动到C
			
			move(num -1, b, a, c);  // b塔所有盘，移动到c，借助a
			
			
			
		}
		
	}
}