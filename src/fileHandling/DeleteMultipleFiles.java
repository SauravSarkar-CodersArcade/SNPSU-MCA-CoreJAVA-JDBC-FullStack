package fileHandling;
import java.io.File;
public class DeleteMultipleFiles {
    public static void main(String[] args) {
        String[] files = {"java.txt", "python.txt", "sql.txt"};
        String path = "./INTERNS/";
        // CONCATENATION -> Addition of strings
        for (int i=0; i< files.length; i++){
            // ./INTERNS/java.txt ./INTERNS/python.txt ./INTERNS/sql.txt
            File file = new File(path + files[i]);
            if (file.delete()){
                System.out.println("Deleted file: " + file.getName());
            }else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}
