package chapter25.jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils_USE {

    public void testQueryMany() throws SQLException {   //返回结果是多行的情况

        Connection connection = JDBCUtilsByDruid.getConnection();   //连接 (druid)
        //使用 DBUtils 类和接口,先引入DBUtils 相关的jar,加入到本Project
        QueryRunner queryRunner = new QueryRunner();
        //可以执行相关的方法，返回ArrayList 结果集
//        String sql = "select * from actor where id >= ?";

        String sql = "select id, name from actor where id >= ?";    //注意: sql 语句也可以查询部分列

        //  queryRunner.query方法:
//         public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh,
//                                            Object... params) throws SQLException {
//                 PreparedStatement stmt = null;     //定义PreparedStatement
//                 ResultSet rs = null;               //接收返回的 ResultSet
//                 Object result = null;              //返回ArrayList
//
//                 try {
//                     stmt = this.prepareStatement(conn, sql);          //创建PreparedStatement
//                     this.fillStatement(stmt, params);                 //对sql 进行赋值
//                     rs = this.wrap(stmt.executeQuery());              //执行sql,返回resultset
//                     result = rsh.handle(rs);                          //返回的resultset --> arrayList[result]
//                     this.rethrow(var33, sql, params);
//                 } finally {

//                     try {
//                         this.close(rs);                               //关闭resultset
//                     } finally {
//                         this.close((Statement)stmt);                  //关闭preparedstatement对象
//                     }
//                 }
//
//                 return result;
//             }

        List<Actor> list =
                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
        System.out.println("输出集合的信息");
        for (Actor actor : list) {
            System.out.print(actor);
        }

        JDBCUtilsByDruid.close(null, null, connection);    //释放资源
    }

    public void testQuerySingle() throws SQLException {

        Connection connection = JDBCUtilsByDruid.getConnection();   //连接 (druid)
        //使用 DBUtils 类和接口 , 先引入DBUtils 相关的jar , 加入到本Project
        QueryRunner queryRunner = new QueryRunner();   //创建 QueryRunner
        String sql = "select * from actor where id = ?";    //返回单个对象

        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 10);
        System.out.println(actor);

        JDBCUtilsByDruid.close(null, null, connection);   //释放资源

    }

    public void testScalar() throws SQLException {

        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select name from actor where id = ?";
        //老师解读： 因为
        Object obj = queryRunner.query(connection, sql, new ScalarHandler(), 4);   //返回的是一个对象, 使用的handler 就是 ScalarHandler
        System.out.println(obj);

        JDBCUtilsByDruid.close(null, null, connection);   //释放资源
    }

    public void testDML() throws SQLException {

        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();

        //组织sql 完成 update, insert delete
//        String sql = "update actor set name = ? where id = ?";
//        String sql = "insert into actor values(null, ?, ?, ?, ?)";
        String sql = "delete from actor where id = ?";

        //执行dml 操作是 queryRunner.update()
        //返回的值是受影响的行数 (affected: 受影响)
//        int affectedRow = queryRunner.update(connection, sql, "林青霞", "女", "1966-10-10", "116");
        int affectedRow = queryRunner.update(connection, sql, 1000 );
        System.out.println(affectedRow > 0 ? "执行成功" : "执行没有影响到表");

        JDBCUtilsByDruid.close(null, null, connection);   //释放资源

    }
}
