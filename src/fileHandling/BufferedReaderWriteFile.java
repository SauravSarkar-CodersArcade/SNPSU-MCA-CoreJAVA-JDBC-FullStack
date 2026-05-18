package fileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedReaderWriteFile {
    public static void main(String[] args) throws Exception{
        String[] names = {"Darshan", "Surya", "Keshav"};
        BufferedWriter writer =
                new BufferedWriter(new FileWriter("./INTERNS/current_status.txt",
                        true));
        writer.write("\nWriting line 2 into the file");
        writer.write("\nWriting line 3 into the file");
        writer.write("\nWriting line 4 into the file");
        writer.write("\nWriting line 5 into the file");
        for (String name : names){
            writer.write("\n" + name);
        }
        writer.close();

    }
}
