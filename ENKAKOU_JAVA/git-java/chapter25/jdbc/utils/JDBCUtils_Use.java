package chapter25.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class JDBCUtils_Use {

    public void testSelect() {
        Connection connection = null;   //得到连接

        String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;

        try {       //创建PreparedStatement 对象
            connection = JDBCUtils.getConnection();
            System.out.println(connection.getClass());
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 5);
            set = preparedStatement.executeQuery();//执行, 得到结果集

            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            JDBCUtils.close(set, preparedStatement, connection);   //关闭资源
        }
    }

    public void testDML () {
        Connection connection = null;    //得到连接
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;    //测试"delete"和"insert"

        try {
            connection = JDBCUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "周星驰");   //给占位符赋值
            preparedStatement.setInt(2, 4);
            preparedStatement.executeUpdate();   //执行
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);               //关闭资源

        }
    }
}
