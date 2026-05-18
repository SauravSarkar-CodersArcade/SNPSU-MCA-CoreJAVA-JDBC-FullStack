package algorithms;
import java.util.Scanner;
public class ScannerClassProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt(); // 25
        scanner.nextLine(); // Consume the remaining line [ENTER]
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}
