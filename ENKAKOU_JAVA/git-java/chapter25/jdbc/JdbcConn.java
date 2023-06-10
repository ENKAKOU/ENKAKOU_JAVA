package chapter25.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConn {

    //方式1
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "hsp");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    //方式2
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";

        Properties properties = new Properties();
        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "hsp"); //密码

        Connection connect = driver.connect(url, properties);
        System.out.println("方式2=" + connect);

    }

    //方式3 使用DriverManager
    public void connect03() throws IllegalAccessException, InstantiationException, ClassNotFoundException, SQLException {

        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");//使用反射加载Driver
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db02";   //创建url 和 user 和 password
        String user = "root";
        String password = "hsp";

        DriverManager.registerDriver(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第三种方式=" + connection);
    }

    //方式4: 使用Class.forName
    public void connect04() throws ClassNotFoundException, SQLException {
//            static {
//                try {
//                    DriverManager.registerDriver(new Driver());
//                } catch (SQLException var1) {
//                    throw new RuntimeException("Can't register driver!");
//                }
//            }
//
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "hsp";
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("第4种方式~ " + connection);

    }

    //方式5 ,增加配置文件，让连接mysql更加灵活
    public void connect05() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("方式5 " + connection);

    }
}
