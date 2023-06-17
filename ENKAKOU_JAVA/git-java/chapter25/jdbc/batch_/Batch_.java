package chapter25.jdbc.batch_;

import chapter25.dou_.utils.JDBCUtilsByDruid;
import chapter25.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {

    @Test
    public void noBatch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统的方式 耗时=" + (end - start));

        JDBCUtils.close(null, preparedStatement, connection);
    }

    public void batch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");

//            public void addBatch() throws SQLException {
//                synchronized(this.checkClosed().getConnectionMutex()) {
//                    if (this.batchedArgs == null) {
//
//                        this.batchedArgs = new ArrayList();
//                    }
//
//                    for(int i = 0; i < this.parameterValues.length; ++i) {
//                        this.checkAllParametersSet(this.parameterValues[i], this.parameterStreams[i], i);
//                    }
//
//                    this.batchedArgs.add(new PreparedStatement.BatchParams(this.parameterValues, this.parameterStreams, this.isStream, this.streamLengths, this.isNull));
//                }
//            }
            preparedStatement.addBatch();
            if((i + 1) % 1000 == 0 ) {
                preparedStatement.executeUpdate();
                //清空
                preparedStatement.clearBatch();
        }
    }

        long end = System.currentTimeMillis();
        System.out.println("批量方式 耗时=" + (end - start));

        JDBCUtils.close(null, preparedStatement, connection);

    }
}
