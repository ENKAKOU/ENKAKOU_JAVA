import java.util.Scanner;

public class MuFor_2023_1_27 {
	
    public static void main(String[] args){
    	
        for(int a = 0; a < 2; a++){
            for(int g = 0; g < 3; g++){
                System.out.println("a=" + a + "g=" + g);
            }
        }
   

        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;  //累计所有学生的成绩
        int passNum = 0;   //累计 及格人数
        for(int i = 1; i <= 3; i++){    // i 表示班级
            double sum = 0;     // 一个班级的总分
            for(int j = 1; j <= 5; j++){    // j 表示学生
              System.out.println("请输入第" + i + "班的第" + j +"个学生的成绩");
              double score = myScanner.nextDouble();
                //当有一个学生成绩 >= 60, passNum++
              if(score >= 60){
                  passNum++;
            }
            sum += score;   // 累计
            System.out.println("成绩为" + score);
        }
            //因为sum 是 5个学生的总成绩
        System.out.println("sum=" + sum + " 平均分=" + (sum / 5));
            //把sum 累计到 totalScore
            totalScore += sum;
        }
        System.out.println("三个班总分=" + totalScore + " 平均分=" + totalScore / 15);
        System.out.println("及格人数有=" + passNum);


        // 打印一个矩形
        for(int y = 1; y <= 5; y++){   //y 表示层数
            System.out.println("*****");
        }
        // 打印半个金字塔
        for(int w = 1; w <= 5; w++){
            // 控制打印每层的 * 个
            for( int v = 1; v <= w; v++){
                System.out.println("*");
        }
            System.out.println("");
        }



    }
}
