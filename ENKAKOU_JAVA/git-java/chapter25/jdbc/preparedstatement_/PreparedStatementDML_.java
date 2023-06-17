package chapter25.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatementDML_ {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输删除管理员的名字: ");
        String admin_name = scanner.nextLine();
//        System.out.print("请输入管理员的新密码: ");
//        String admin_pwd = scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));    //通过Properties对象获取配置文件的信息

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);   // 注册驱动
        Connection connection = DriverManager.getConnection(url, user, password);   //得到连接

        //得到PreparedStatement
//        String sql = "insert into admin values(?, ?)";
//        String sql = "update admin set pwd = ? where name = ?";
        String sql = "delete from  admin where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);   //preparedStatement 对象实现了 PreparedStatement 接口的实现类的对象
        preparedStatement.setString(1, admin_name);  //赋值
//        preparedtatement.setString(2, admin_name);


        int rows = preparedStatement.executeUpdate();   //执行 dml 语句使用  executeUpdate
        System.out.println(rows > 0 ? "执行成功" : "执行失败");

        //关闭连接
        preparedStatement.close();
        connection.close();

    }
}

