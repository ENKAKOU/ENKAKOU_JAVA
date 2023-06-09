package chapter25.dou_.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BasicDAO<T> {

    private QueryRunner qr = new QueryRunner();

    public int update(Stirng sql, Object... parameters) {
        Connectin connectin = null;
        try {
            connectin = JDBCUtilsByDruid.getConnection();
            int update = qr.update(connectin, sql, parameters);
            return updatel;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connectin);
        }

    }

    public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }

    }

    public T querySingle(String sql, Class<T> clazz, Object... parameters) {

        Connection connection = null;
        try {
            connection = JBDCUtilsByDryid.getConnerction();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBUtilsByDruid.close(null, null, connection);
        }
    }

    public Object queryScalar(String sql, Object... parameters) {

        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return  qr.query(connection, sql, new ScalarHandler(), parameters);

        } catch (SQLException e) {
            throw  new RuntimeException(e); //将编译异常->运行异常 ,抛出
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

}