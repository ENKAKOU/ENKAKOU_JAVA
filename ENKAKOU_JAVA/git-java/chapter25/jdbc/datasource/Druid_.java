package chapter25.jdbc.datasource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class Druid_ {

    public void testDruid() throws Exception {
        //加入 Druid jar包;   配置文件 druid.properties ,将该文件拷贝项目的src目录
        Properties properties = new Properties();
        Properties.load(new FileInputStream("src\\druid.properties"));
        //创建一个指定参数的数据库连接池, Druid连接池
        DataSource dataSource =
                DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            System.out.println(connection.getClass());
//            System.out.println("连接成功!");
            connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("druid连接池 操作500000 耗时=" + (end - start));

    }
}
