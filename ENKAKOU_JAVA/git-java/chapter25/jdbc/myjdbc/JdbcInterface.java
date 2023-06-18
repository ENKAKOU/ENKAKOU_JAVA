package chapter25.jdbc.myjdbc;

public interface JdbcInterface {

    public Object getConnection();   //连接

    public void crud();   //crud

    public void close();   //关闭连接

}
