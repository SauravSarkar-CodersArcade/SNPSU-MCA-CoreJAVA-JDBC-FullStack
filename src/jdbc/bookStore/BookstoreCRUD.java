package jdbc.bookStore;
import java.sql.*;
import java.util.Scanner;
// A top-level class can be either public or default
public class BookstoreCRUD {
    private static final String URL =
            "jdbc:mysql://localhost:3306/mca_bookstore_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    public static void main(String[] args) {
        // Try with resources [closes the classes automatically by JVM]
        try(Connection conn = DriverManager.
                getConnection(URL, USERNAME, PASSWORD);
            Scanner scanner = new Scanner(System.in)) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // MAIN BOOKSTORE CRUD APP
        while (true){
            // Display Menu Options Create-Display-Update-Delete-Exit
            System.out.println("\n1. Create Book | 2. Display Books | 3. Update Book | 4. Delete Book | 5. Exit");
            System.out.print("Choice: ");
            int ch = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover line
            // ============ CREATE ===============================
            if (ch == 1){
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Author: ");
                String author = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                // PreparedStatement to prevent SQL Injection
                String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
                try(PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, title);
                    ps.setString(2, author);
                    ps.setDouble(3, price);
                    ps.executeUpdate(); // EXECUTES THE INSERT OPERATION
                    System.out.println("Book: " + title + " added to Database.");
                }
            }
            // =========================== READ or DISPLAY BOOKS ================
            else if (ch == 2) {
                String sql = "SELECT * FROM books";
                try (Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(sql)){
                    System.out.println("ID | TITLE | AUTHOR | PRICE");
                    while (rs.next()){
                        int id = rs.getInt("id");
                        String title = rs.getString("title");
                        String author = rs.getString("author");
                        double price = rs.getDouble("price");
                        System.out.println(id + "\t|\t" + title + "\t|\t" + author + "\t|\t" + price);
                    }
                }
            }
            // ======================== UPDATE BOOK =======================================
            else if(ch == 3){
                System.out.print("Enter the BOOK ID to Update: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover line
                System.out.print("New Title: ");
                String title = scanner.nextLine();
                System.out.print("New Author: ");
                String author = scanner.nextLine();
                System.out.print("New Price: ");
                double price = scanner.nextDouble();
                String sql = "UPDATE books SET title=?, author=?, price=? WHERE ID=?";
                try(PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, title);
                    ps.setString(2, author);
                    ps.setDouble(3, price);
                    ps.setInt(4, id);
                    int rows = ps.executeUpdate();
                    if (rows > 0) System.out.println("Updated");
                    else System.out.println("ID: " + id + " NOT FOUND.");
                }
            }
            // ========================= DELETE BOOK ================================
            else if (ch == 4){
                System.out.print("Enter BOOK ID to Delete: ");
                int id = scanner.nextInt();
                String sql = "DELETE FROM books WHERE id=?";
                try(PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, id);
                    int rows = ps.executeUpdate();
                    if(rows > 0) System.out.println("Book with id: " + id + " deleted.");
                    else System.out.println("ID " + id + " NOT FOUND.");
                }
            }
            // ========================= EXIT DATABASE APPLICATION
            else if (ch == 5) {
                System.out.println("EXITING THE BOOKSTORE APPLICATION: ");
                for (int i=1; i<=5; i++){
                    System.out.print("..");
                    Thread.sleep(500);
                }
                break; // Exits the while loop
            }
            // HANDLE THE INVALID MENU CASES
            else {
                System.out.println("INVALID CHOICE");
                System.out.println("CORRECT CHOICES: [1,2,3,4,5]");
            }
        }
        }catch (ClassNotFoundException e){
            System.out.println("MYSQL JDBC DRIVER NOT FOUND!");
        }catch (SQLException e){
            System.out.println("DATABASE ERROR: " + e.getMessage());
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
