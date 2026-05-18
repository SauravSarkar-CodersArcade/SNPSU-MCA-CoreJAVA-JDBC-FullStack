package fileHandling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferedReaderExample {
    // Can we create an Object inside a constructor ?????
    // ClassName obj = new ClassName(new AnotherClassname());
    // Can we use a try block without catch or finally
    public static void main(String[] args) throws Exception{
        // BufferedReader br = null;
        String str = "";
//        try {
//            br = new BufferedReader(new InputStreamReader(System.in));
//            str = br.readLine();
//            System.out.println(str);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            br.close();
//        }
        // If we use try with resources try(){} -> We don't need catch{} or finally{}
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
            System.out.println(str);
            br.close(); // Not required => Closes Automatically => JVM
        }
    }

}
