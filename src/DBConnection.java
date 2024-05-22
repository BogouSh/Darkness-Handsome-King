import java.sql.*;
//单例数据库连接
public class DBConnection {
    private static final String DB_URL="jdbc:mysql://localhost:3306/dbdemo?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER="root";
    private static final String PASSWORD="123";
    private Connection conn;
    private static DBConnection instance;
    private DBConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn=DriverManager.getConnection(DB_URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }

    }
    public Connection getConnection()
    {
        return conn;
    }
    public static DBConnection getInstance()
    {
        if (instance == null) {
            instance = new DBConnection();
        }else {
            try {
                if(instance.getConnection().isClosed()){
                    instance=new DBConnection();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return instance;
    }
}
