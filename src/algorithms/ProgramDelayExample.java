package algorithms;
public class ProgramDelayExample {
    public static void main(String[] args) throws InterruptedException{
        for (int i=1; i<=5; i++){
            System.out.print(" . ");
            Thread.sleep(1000);
            // Pause - halt - wait - INTERRUPT
        }
    }
}
