package chapter25.jdbc.temp_;

import chapter25.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class Temp_ {

    @Test
    public void m1() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = JDBCUtils.getConnection();
//            System.out.println("do something..");
            JDBCUtils.close(null,null,connection);
        }

        long end = System.currentTimeMillis();
        System.out.println("连接5k次mysql 耗时=" + (end - start));

    }
}
