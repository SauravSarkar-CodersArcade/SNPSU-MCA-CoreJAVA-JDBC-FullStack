package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCReadDemo {
    public static void main(String[] args) throws Exception{
        // Load the JDBC Driver [jar file]
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start / Establish the Connection
        Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/snpsu_mca",
                             "root",
                         "1234");
        // Verify Connection
        System.out.println("Connection Established!!!!");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.
                executeQuery("SELECT * FROM users");
        // id -> int name -> String
        while (rs.next()){
            System.out.println(rs.getInt(1) + "\t" +
                    rs.getString(2));
        }
        rs.close();
        statement.close();
        connection.close();
    }
}
