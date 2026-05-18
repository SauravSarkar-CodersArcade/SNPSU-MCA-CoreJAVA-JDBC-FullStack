package fileHandling;
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("./INTERNS/c.txt");
        if (file.delete()){
            System.out.println("File " + file.getName() +
                    " deleted.");
        }else {
            System.out.println("Failed to delete the file.");
        }
    }
}
