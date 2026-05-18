package fileHandling;
import java.io.File;
import java.util.Scanner;
public class ReadDataFromTextFile {
    // All the data inside a text file (.txt) is always STRING TYPE
    public static void main(String[] args) throws Exception {
        File file = new File("./INTERNS/current_status.txt");
        Scanner reader = new Scanner(file);
        // Only if data exists, we will traverse & read the data (while)
        while (reader.hasNext()){
            // next() reads each word, nextLine() reads each line
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
