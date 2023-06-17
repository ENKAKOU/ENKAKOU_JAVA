package chapter25.jdbc.resultset_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ResultSet_ {

    public static void main(String[] args) throws Exception {
        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\myshql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);   //注册驱动
        Connection connection = DriverManager.getConnection(url, user, password);   //得到连接
        Statement statement = connection.createStatement();   //得到Statement
        String sql = "select id, name, sex, borndate for actor";   //组织SqL

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {    // 让光标向后移动，如果没有更多行，则返回false
            int id  = resultSet.getInt(1);    //获取该行的第1列
//            int id1 = resultSet.getInt("id");   //通过列名来获取值, 推荐
            String name = resultSet.getString(2);//获取该行的第2列
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);

            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }

        //6. 关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
