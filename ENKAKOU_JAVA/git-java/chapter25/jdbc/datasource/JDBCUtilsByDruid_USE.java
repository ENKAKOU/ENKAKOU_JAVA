package chapter25.jdbc.datasource;

import java.sql.*;
import java.util.ArrayList;
public class JDBCUtilsByDruid_USE {

    public void testSelect() {

        System.out.println("使用 druid方式完成");

        Connection connection = null;   //得到连接
        String sql = "select * from actor where id >= ?";   //组织一个sql
        PreparedStatement preparedStatement = null;
        ResultSet set = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();   //创建PreparedStatement 对象
            System.out.println(connection.getClass());//运行类型 com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);//给?号赋值
            //执行, 得到结果集
            set = preparedStatement.executeQuery();

            //遍历该结果集
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");//getName()
                String sex = set.getString("sex");//getSex()
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            JDBCUtilsByDruid.close(set, preparedStatement, connection);   //关闭资源
        }
    }

    public ArrayList<Actor> testSelectToArrayList() {   //解决ResultSet =封装=> Arraylist

        System.out.println("使用 druid方式完成");

        Connection connection = null;   // 得到连接
        String sql = "select * from actor where id >= ?";   //组织一个sql
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        ArrayList<Actor> list = new ArrayList<>();   //创建ArrayList对象,存放actor对象

        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println(connection.getClass());
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);

            set = preparedStatement.executeQuery();

            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");

                list.add(new Actor(id, name, sex, borndate, phone));   //把得到的resultset 的记录，封装到 Actor对象，放入到list集合
            }

            System.out.println("list集合数据=" + list);
            for(Actor actor : list) {
                System.out.println("id=" + actor.getId() + "\t" + actor.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(set, preparedStatement, connection);   //关闭资源
        }
        return  list;

    }
}
