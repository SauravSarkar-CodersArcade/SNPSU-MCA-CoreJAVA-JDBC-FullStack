package jdbc;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class JDBCCreateTableDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // Load the properties from the file
            FileInputStream fis = new FileInputStream("./db.properties");
            properties.load(fis);
            String URL = properties.getProperty("url");
            String USERNAME = properties.getProperty("username");
            String PASSWORD = properties.getProperty("password");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.
                    getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection Established!");
            Statement statement = connection.createStatement();
            String createTableQuery = "CREATE TABLE state_languages (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "language VARCHAR(50));";
            statement.executeUpdate(createTableQuery);
            System.out.println("Table 'state_languages' created successfully!");
        }catch (SQLException | ClassNotFoundException | IOException e){
            e.printStackTrace(); // Details of an exception
        }
    }
}
