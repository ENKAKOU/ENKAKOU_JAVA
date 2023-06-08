package chapter23.javamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaMysql {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsp_db02", "root", "hsp");

        //String sql = "create table hsp_goods ( id int, name varchar(32), price double, introduce text)" ;
        //String sql = "insert into hsp_goods values(1, '华为手机', 2000, '这是不错的一款手机')" ;
        String sql = "drop table hsp_goods" ;

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
        System.out.println("成功~");

    }
}
