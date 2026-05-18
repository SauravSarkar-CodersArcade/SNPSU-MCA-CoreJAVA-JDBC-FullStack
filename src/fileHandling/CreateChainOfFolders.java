package fileHandling;
import java.io.File;
public class CreateChainOfFolders {
    public static void main(String[] args) {
        /*
        Absolute Path -> Root Directory - Full Path
        Relative Path -> Current Base Directory
         */
        String path = System.getProperty("user.dir");
        System.out.println(path);
        // mkdirs() creates all level folders if the initial path is correct
        File folder = new
                File("D:\\Idea Projects\\SNPSU-MCA-B1\\INTERNS\\A\\B\\C\\D\\E");
        if(folder.mkdirs()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Failed to create the folder.");
        }
    }
}
