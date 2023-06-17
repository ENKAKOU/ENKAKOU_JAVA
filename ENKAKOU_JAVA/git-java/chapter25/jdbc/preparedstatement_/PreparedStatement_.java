package chapter25.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatement_ {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);  //PreparedStatement类图
        System.out.print("请输入管理员名字： ");
        String admin_name = scanner.nextLine();
        System.out.print("请输入管理员密码： ");
        String admin_pwd = scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);   //注册驱动
        Connection connection = DriverManager.getConnection(url, user, password);   //得到连接
        String sql = "select name , pwd  from admin where name =? and pwd = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);   //preparedStatement 对象实现了 PreparedStatement 接口的实现类的对象
        preparedStatement.setString(1, admin_name);
        preparedStatement.setString(2, admin_pwd);

        //执行 select 语句使用  executeQuery
        //如果执行的是 dml(update, insert ,delete) executeUpdate()
        ResultSet resultSet = preparedStatement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println("恭喜， 登录成功");
        } else {
            System.out.println("对不起，登录失败");
        }

        //关闭连接
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
