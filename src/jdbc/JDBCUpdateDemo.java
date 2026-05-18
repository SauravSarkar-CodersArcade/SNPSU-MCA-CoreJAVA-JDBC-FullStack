package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBCUpdateDemo {
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
        String language = "Bhojpuri";
        // AVOID SQL INJECTION = We don't write the column name in
        // the QUERY, rather we use QUESTION MARKS for the parameters
        PreparedStatement ps = connection.
                prepareStatement("UPDATE state_languages SET language=? WHERE name=?");
        ps.setString(1, language);
        ps.setString(2, name);
        int i = ps.executeUpdate(); // Returns no of rows affected
        if (i > 0 ){
            System.out.println("Updated data successfully.");
        }else {
            System.out.println("Failed to update data.");
        }
        ps.close();
        connection.close();
    }
}
