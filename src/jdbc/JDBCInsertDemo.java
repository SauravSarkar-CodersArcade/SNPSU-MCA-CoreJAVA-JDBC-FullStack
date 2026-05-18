package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBCInsertDemo {
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
        String name = "Bihar";
        String language = "Hindi";
        // AVOID SQL INJECTION = We don't write the column name in
        // the QUERY, rather we use QUESTION MARKS for the parameters
        PreparedStatement ps = connection.
                prepareStatement("INSERT INTO state_languages (name, language) VALUES (?, ?)");
        ps.setString(1, name);
        ps.setString(2, language);
        int i = ps.executeUpdate(); // Returns no of rows affected
        if (i > 0 ){
            System.out.println("Inserted data successfully");
        }else {
            System.out.println("Failed to insert data.");
        }
        ps.close();
        connection.close();
    }
}
