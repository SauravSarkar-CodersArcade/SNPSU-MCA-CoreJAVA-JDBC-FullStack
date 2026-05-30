package algorithms;
import java.util.Hashtable;
import java.util.Map;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Swati");
        ht.put(117, "Ankitha");
        ht.put(128, "Asra");
        ht.put(98, "Benita");
        ht.put(99, "Darshan");
        ht.put(100, "Surya");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
