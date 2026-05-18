package fileHandling;
import java.io.FileWriter;
public class WriteDataIntoFile {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new
                FileWriter("./INTERNS/current_status.txt",
                true); // true for updating data
        writer.append("\nThu-Fri-Aptitude");
        writer.append("\nSat-Core Subjects");
        writer.close();
        System.out.println("Wrote data to the file.");
    }
}
