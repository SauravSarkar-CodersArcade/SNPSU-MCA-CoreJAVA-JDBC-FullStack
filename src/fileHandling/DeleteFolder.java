package fileHandling;
import java.io.File;
public class DeleteFolder {
    public static void main(String[] args) {
        // Relative Path - Current Directory
        // . means current folder / means entering the folder
        File folder = new File("./INTERNS/A/B/C/D/E");
        // .delete() methods deletes the last folder -> E
        if (folder.delete()){
            System.out.println("Folder " + folder.getName() + " deleted.");
        }else {
            System.out.println("Failed to delete the folder.");
        }

    }
}
