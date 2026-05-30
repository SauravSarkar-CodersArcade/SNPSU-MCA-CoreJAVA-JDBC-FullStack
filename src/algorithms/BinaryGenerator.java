package algorithms;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryGenerator {
    public static void generateBinaryNumbers(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (N-- > 0){
            String current = q.poll(); // POP
            System.out.print(current + " "); // PRINT
            // Push Operation Back to the Queue
            q.offer(current + "0"); // Concatenate 0
            q.offer(current + "1"); // Concatenate 1
        }
    }
    public static void main(String[] args) {
        int N = 5;
        generateBinaryNumbers(N);
    }
}
