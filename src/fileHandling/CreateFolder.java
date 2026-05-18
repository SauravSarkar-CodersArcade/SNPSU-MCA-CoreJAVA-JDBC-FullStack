package fileHandling;
import java.io.File;
public class CreateFolder {
    public static void main(String[] args) {
        /*
        Absolute Path -> Root Directory - Full Path
        Relative Path -> Current Base Directory
         */
        String path = System.getProperty("user.dir");
        System.out.println(path);
        // mkdir() only creates the last level folder if the path is correct
        File folder = new
                File("D:\\Idea Projects\\SNPSU-MCA-B1\\INTERNS");
        if(folder.mkdir()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Failed to create the folder.");
        }
    }
}
