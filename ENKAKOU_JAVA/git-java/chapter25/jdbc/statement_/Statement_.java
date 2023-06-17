package chapter25.jdbc.statement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Statement_ {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入管理员名字: ");    //next(): 当接收到 空格或者 '就是表示结束
        String admin_name = scanner.nextLine();
        System.out.print("请输入管理员密码: ");
        String admin_pwd = scanner.nextLine();

        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driber");
        String url = properties.getProperty("url");

        Class.forName(driver);   //注册驱动
        Connection connection = DriverManager.getConnection(url, user, password);   //得到连接
        Statement statement = connection.createStatement();   //得到Statement
        String sql = "select name , pwd  from admin where name ='"
                + admin_name + "' and pwd = '" + admin_pwd + "'";   // 组织SqL
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {    //如果查询到一条记录，则说明该管理存在
            System.out.println("恭喜， 登录成功");
        } else {
            System.out.println("对不起，登录失败");
        }

        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}

