package chapter25.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {

    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver(); //创建driver对象

        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();

        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "hsp"); //密码
        Connection connect = driver.connect(url, properties);

        String sql = "delete from actor where id =1";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);

        System.out.println(rows > 0 ? "成功" : "失败");
        //关闭连接资源
        statement.close();
        connect.close();

    }
}
