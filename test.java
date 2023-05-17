public class test {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            default:
                System.out.println("未知成绩");
        }
        System.out.println("等级是" + grade);
       
        
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 30;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        System.out.println("b % a = " + (b % a));
   
    
    }
        
}


