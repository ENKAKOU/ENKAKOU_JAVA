package chapter25.jdbc.transaction_;

import  chapter25.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction_ {

    public void noTransaction() {
        //操作转账的业务
        Connection connection = null;

        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils.getConnection();    // 默认情况下connection是默认自动提交
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();   // 执行第1条sql

            int i = 1 / 0; //抛出异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();   // 执行第3条sql
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            JDBCUtils.close(null, preparedStatement, connection); //关闭资源
        }
    }


    //事务来解决
    @Test
    public void useTransaction() {

        Connection connection = null;

        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCSUtils.getConnection();   // 默认情况下，connection是默认自动提交
            //connection设置为不自动提交
            connection.setAutoCommit(false);   //开启了事务
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();   // 执行第1条sql

            int i = 1 / 0;   //抛出异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();   // 执行第3条sql

            //提交事务
            connection.commit();
        } catch (SQLException e) {
            System.out.println("执行发生了异常，撤销执行的sql");

            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {

            JDBCUtils.close(null, preparedStatement, connection);   //关闭资源
        }

    }
}
