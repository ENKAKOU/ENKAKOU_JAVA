public class BiliJavaDay2 {
	
    public static void main(String[] args){
        //代码规范
        int n1 = 1 + 2;  //整体向右移动，选中，然后输入tab
        int n2 = 5 + 10; //整体向左移动，选中，然后输入shift+tab
        int n3 = 1 + 3 + 34; //运算符和 = 两边习惯性各加一个空格
        System.out.println(n1 + n2);
        //行宽不要超过80字符
        //次行风格，行尾风格

        // 作业1 编写hello world
        System.out.println("hello world");

        /* 作业2 将个人的基本信息（姓名，性别，籍贯，住址）
             打印到控制台上输出。各条信息分别占一行  */
        System.out.println("姓名\t性别\t籍贯\t住址\n酱酱\t女性\t未知\t福冈");

        /* 作业3 JDK,JRE,JVM的关系
             答：JDK + JRE = java开发工具   JRE + JVM = 核心类库 */

        /* 作业4 环境变量path配置及起作用
             答：环境变量的作用，为了在dos的任意目录，可以去使用java 和 javac命令。
                先配置 JAVA HOME = 指向jdk安装的主目录。
                编辑path环境变量，增加 %JAVA_HOME%\bin  */

        /* 作业5 编写JAVA步骤
            1.编写java源代码
            2.java编译，对应的.class 字节码文件
            3.java运行，本质是.class 加载到jvm 运行 */

        // java变量
        // 变量 三个要素 ：  类型 + 名称 + 值
        int a = 1;   // int = 类型 ;  a = 名称 ; 1 = 值
        //  b = 89; //把89值赋给b变量
        System.out.println(a); //输出a 变量的值

        //声明变量
        //int = a;
        a = 100;
        System.out.println(a);
        //还可以这样使用
        int b = 100;
        System.out.println(b);

        //定义变量  记录人的信息
        int age = 20;
        double score = 88.6;
        char gender = '男';
        String name = "jack";
        //输出信息
        System.out.println("人的信息如下：");
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);


        //变量必须先声明，后使用，即：有顺序
       // int a = 50;   //int 类型
       // System.out.println(a);  // 输出为 50
        //该区域数据/值可以在同一类型范围内不断变化
        //  a = 88;
        //  System.out.println(a);  // 输出为 88

        //  a = "jack";
        // String类型 不能转成 int类型


        //变量在同一个作用域内不能重名    例如 ： int a = 77;（错误）
        //   class doc{
        //    public static void main(String[] args){
        //        int a = 666;   // 对的



    }
}
