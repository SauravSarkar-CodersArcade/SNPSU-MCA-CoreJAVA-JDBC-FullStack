package algorithms;
// It is a special class used to store Named Constants
enum BugPriority{
    LOW, MEDIUM, HIGH
}
public class EnumExample {
    public static void main(String[] args) {
        // Enum var = Enum.VALUE;
        BugPriority bug = BugPriority.MEDIUM;
        System.out.println("The priority is: " + bug);
        for(BugPriority priority : BugPriority.values()){
            System.out.print(priority + " ");
        }
    }
}
