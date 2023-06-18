package chapter25.jdbc.datasource;

import chapter25.jdbc.utils.JDBCUtils;
import java.sql.Connection;

public class ConQuestion {

    public void testCon() {   //连接mysql 5000次
        long start = System.currentTimeMillis();
        System.out.println("开始链接....");
        for (int i = 0; i < 5000; i++) {
            Connection connection = JDBCUtils.getConnection();    //使用传统的jdbc方式，得到连接

            JDBCUtils.close(null, null, connection);   //关闭
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式5000次  耗时= " + (end - start));

    }
}
