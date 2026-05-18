package fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(
                        new FileReader("./INTERNS/current_status.txt"));
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
    }
}
