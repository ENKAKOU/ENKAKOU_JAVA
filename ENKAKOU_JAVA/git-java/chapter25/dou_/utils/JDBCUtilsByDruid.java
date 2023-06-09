package chapter25.dou_.utils;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class JDBCUtilsByDruid {

    private static DataSource ds;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);

        }
    }
}
