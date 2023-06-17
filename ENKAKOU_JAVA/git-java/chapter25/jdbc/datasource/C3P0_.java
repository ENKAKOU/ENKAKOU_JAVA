package chapter25.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.Properties;

public class C3P0_ {

    @Test
    public void testC3P0_01() throws Exception {

        ComboPooledDataSource combopooledDataSource = new ComboPooledDataSource();   //创建一个数据源对象

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));  //配置文件mysql.properties 获取相关连接的信息

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        comboPooledDataSource.setInitialPoolSize(10);   //设置初始化连接数
        comboPooledDataSource.setMaxPoolSize(50);   //最大连接数

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {       //测试连接池的效率, 测试对mysql 5000次操作
            Connection connection = comboPooledDataSource.getConnection(); //这个方法就是从 DataSource 接口实现的
            //System.out.println("连接OK");
            connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("c3p0 5000连接mysql 耗时=" + (end - start));

    }

    @Test
    public void testC3P0_02() throws Exception {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        long start = System.currentTimeMillis();           //测试5000次连接mysql
        System.out.println("开始执行....");
        for (int i = 0; i < 500000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
//            System.out.println("连接OK~");
            connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("c3p0的第二种方式(500000) 耗时=" + (end - start));//1917

    }
}